package parcialfinalpoo;

import java.io.*;
import javax.swing.JOptionPane;

public class CRUDMedicamento {

    private static final String Ruta_Archivos = "src/Archivos/";
    private static final String Archivo_Medicamentos = Ruta_Archivos + "medicamentos.txt";
    private static final String Archivo_Tipos = Ruta_Archivos + "tipos_medicamentos.txt";

    private static final Medicamento[] medicamentos = new Medicamento[100];
    private static int contadorMedicamentos = 0;
    private static final TipoMedicamento[] tiposMedicamentos = new TipoMedicamento[50];
    private static int contadorTipos = 0;

    // ==================== INICIALIZACIÓN ====================
    public static void cargarDatos() {
        cargarTiposMedicamentos();
        cargarMedicamentos();
    }

    private static void cargarMedicamentos() {
        try {
            File archivo = new File(Archivo_Medicamentos);
            if (!archivo.exists()) {
                archivo.getParentFile().mkdirs();
                archivo.createNewFile();
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                contadorMedicamentos = 0;
                while ((linea = br.readLine()) != null && contadorMedicamentos < medicamentos.length) {
                    Medicamento med = Medicamento.fromFileString(linea);
                    if (med != null) {
                        medicamentos[contadorMedicamentos++] = med;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar medicamentos: " + e.getMessage());
        }
    }

    private static void cargarTiposMedicamentos() {
        try {
            File archivo = new File(Archivo_Tipos);
            if (!archivo.exists()) {
                archivo.getParentFile().mkdirs();
                archivo.createNewFile();
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                contadorTipos = 0;
                while ((linea = br.readLine()) != null && contadorTipos < tiposMedicamentos.length) {
                    TipoMedicamento tipo = TipoMedicamento.fromFileString(linea);
                    if (tipo != null) {
                        tiposMedicamentos[contadorTipos++] = tipo;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar tipos: " + e.getMessage());
        }
    }

    private static void guardarMedicamentos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo_Medicamentos))) {
            for (int i = 0; i < contadorMedicamentos; i++) {
                if (medicamentos[i] != null) {
                    bw.write(medicamentos[i].toFileString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar medicamentos: " + e.getMessage());
        }
    }

    private static void guardarTiposMedicamentos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Archivo_Tipos))) {
            for (int i = 0; i < contadorTipos; i++) {
                if (tiposMedicamentos[i] != null) {
                    bw.write(tiposMedicamentos[i].toFileString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar tipos: " + e.getMessage());
        }
    }

    // ==================== OBTENER ARRAYS PARA INTERFAZ ====================
    public static String[] obtenerNombresTipos() {
        String[] nombres = new String[contadorTipos];
        for (int i = 0; i < contadorTipos; i++) {
            nombres[i] = tiposMedicamentos[i].getNombre();
        }
        return nombres;
    }

    public static TipoMedicamento[] obtenerTodosTipos() {
        TipoMedicamento[] resultado = new TipoMedicamento[contadorTipos];
        for (int i = 0; i < contadorTipos; i++) {
            resultado[i] = tiposMedicamentos[i];
        }
        return resultado;
    }

    public static Medicamento[] obtenerTodosMedicamentos() {
        Medicamento[] resultado = new Medicamento[contadorMedicamentos];
        for (int i = 0; i < contadorMedicamentos; i++) {
            resultado[i] = medicamentos[i];
        }
        return resultado;
    }

    // ==================== MEDICAMENTO ====================
    // ==================== AGREGAR MEDICAMENTO ====================
    public static boolean agregarMedicamento(String codigo, String nombre, String descripcion,
            String nombreTipo, double precio, int stock, String nombreProveedor) {

        if (codigo.isEmpty() || nombre.isEmpty() || nombreProveedor.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos obligatorios:\n- Código\n- Nombre\n- Proveedor\n- Descripción", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (contadorMedicamentos >= medicamentos.length) {
            JOptionPane.showMessageDialog(null, "Capacidad máxima de medicamentos alcanzada", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (buscarMedicamentoPorCodigo(codigo) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un medicamento con el código: " + codigo, "Código duplicado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (buscarMedicamentoPorNombre(nombre) != null) {
            Medicamento existente = buscarMedicamentoPorNombre(nombre);
            JOptionPane.showMessageDialog(null, "Ya existe un medicamento con el nombre: '" + nombre + "'\n\n" + "Código: " + existente.getCodigo() + "\n" + "Stock actual: " + existente.getStock() + "\n" + "Precio: $" + String.format("%.2f", existente.getPrecio()) + "\n\n" + "Si desea agregar más unidades, use la opción de editar.", "Medicamento duplicado", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (buscarTipoPorNombre(nombreTipo) == null) {
            JOptionPane.showMessageDialog(null, "No existe el tipo de medicamento: '" + nombreTipo + "'", "Tipo no encontrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (precio <= 0 || stock < 0) {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0 y el stock no puede ser negativo", "Valores inválidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        Medicamento nuevo = new Medicamento(codigo, nombre, descripcion, nombreTipo,
                precio, stock, nombreProveedor);
        medicamentos[contadorMedicamentos++] = nuevo;
        guardarMedicamentos();

        return true;
    }

    // ==================== BUSCAR MEDICAMENTO ====================
    public static Medicamento buscarMedicamentoPorCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del medicamento para buscar", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return null;
        }

        String busqueda = codigo.trim().toLowerCase();

        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null
                    && medicamentos[i].getCodigo().toLowerCase().equals(busqueda)) {
                return medicamentos[i];
            }
        }
        
        return null;
    }

    private static Medicamento buscarMedicamentoPorNombre(String nombre) {
        String nombreBusqueda = nombre.toLowerCase().trim();
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null && medicamentos[i].getNombre().toLowerCase().trim().equals(nombreBusqueda)) {
                return medicamentos[i];
            }
        }
        return null;
    }

    // ==================== ACTUALIZAR MEDICAMENTO ====================
    public static boolean actualizarMedicamento(String codigoActual, String nuevoNombre,
            String nuevaDescripcion, String nuevoTipo, double nuevoPrecio,
            int nuevoStock, String nuevoProveedor) {

        if (codigoActual == null || codigoActual.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del medicamento a actualizar", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (nuevoNombre.isEmpty() || nuevoProveedor.isEmpty() || nuevaDescripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos obligatorios:\n- Nombre\n- Proveedor\n- Descripción", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        Medicamento medicamento = null;
        int indice = -1;
        String busqueda = codigoActual.trim().toLowerCase();

        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null
                    && medicamentos[i].getCodigo().toLowerCase().equals(busqueda)) {
                medicamento = medicamentos[i];
                indice = i;
                break;
            }
        }

        if (medicamento == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el medicamento con código: '" + codigoActual + "'", "No encontrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String nuevoNombreLower = nuevoNombre.trim().toLowerCase();
        String nombreActualLower = medicamento.getNombre().toLowerCase();

        if (!nombreActualLower.equals(nuevoNombreLower)) {
            for (int i = 0; i < contadorMedicamentos; i++) {
                if (medicamentos[i] != null && i != indice
                        && medicamentos[i].getNombre().toLowerCase().equals(nuevoNombreLower)) {
                    JOptionPane.showMessageDialog(null, "Ya existe otro medicamento con el nombre: '" + nuevoNombre + "'", "Nombre duplicado", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }

        if (buscarTipoPorNombre(nuevoTipo) == null) {
            JOptionPane.showMessageDialog(null, "No existe el tipo de medicamento: '" + nuevoTipo + "'", "Tipo no encontrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (nuevoPrecio <= 0 || nuevoStock < 0) {
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0 y el stock no puede ser negativo", "Valores inválidos", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        medicamentos[indice] = new Medicamento(
                medicamento.getCodigo(),
                nuevoNombre.trim(),
                nuevaDescripcion.trim(),
                nuevoTipo,
                nuevoPrecio,
                nuevoStock,
                nuevoProveedor.trim()
        );

        guardarMedicamentos();

        JOptionPane.showMessageDialog(null, "Medicamento actualizado correctamente:\n\n" + "Código: " + medicamento.getCodigo() + "\n" + "Nuevo nombre: " + nuevoNombre.trim(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

// ==================== ELIMINAR MEDICAMENTO ====================
    public static boolean eliminarMedicamento(String codigo) {

        if (codigo == null || codigo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del medicamento a eliminar", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        Medicamento medicamento = null;
        int indice = -1;
        String busqueda = codigo.trim().toLowerCase();

        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null
                    && medicamentos[i].getCodigo().toLowerCase().equals(busqueda)) {
                medicamento = medicamentos[i];
                indice = i;
                break;
            }
        }

        if (medicamento == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el medicamento con código: '" + codigo + "'", "No encontrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        for (int i = indice; i < contadorMedicamentos - 1; i++) {
            medicamentos[i] = medicamentos[i + 1];
        }
        medicamentos[--contadorMedicamentos] = null;

        guardarMedicamentos();

        JOptionPane.showMessageDialog(null, "Medicamento eliminado correctamente:\n\n" + "Código: " + medicamento.getCodigo() + "\n" + "Nombre: " + medicamento.getNombre() + "\n" + "Stock eliminado: " + medicamento.getStock(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    // ==================== TIPO MEDICAMENTO====================
    // ==================== AGREGAR TIPO DE MEDICAMENTO ====================
    public static boolean agregarTipoMedicamento(String codigo, String nombre, String detalles) {
        if (codigo.isEmpty() || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos obligatorios:\n- Código\n- Nombre", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (contadorTipos >= tiposMedicamentos.length) {
            JOptionPane.showMessageDialog(null, "Capacidad máxima de tipos alcanzada", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (buscarTipoPorCodigo(codigo) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un tipo con el código: " + codigo, "Código duplicado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (buscarTipoPorNombre(nombre) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un tipo con el nombre: " + nombre, "Nombre duplicado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        TipoMedicamento nuevo = new TipoMedicamento(codigo, nombre, detalles); 
        tiposMedicamentos[contadorTipos++] = nuevo;
        guardarTiposMedicamentos();

        return true;
    }

    // ==================== ACTUALIZAR TIPO DE MEDICAMENTO ====================
    public static boolean actualizarTipo(String codigoActual, String nuevoNombre, String nuevosDetalles) {

        if (codigoActual == null || codigoActual.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del tipo a actualizar", "Campo vacío",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nuevo nombre no puede estar vacío", "Campo obligatorio", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        TipoMedicamento tipo = null;
        int indice = -1;
        String busqueda = codigoActual.trim().toLowerCase();

        for (int i = 0; i < contadorTipos; i++) {
            if (tiposMedicamentos[i] != null
                    && tiposMedicamentos[i].getCodigo().toLowerCase().equals(busqueda)) {
                tipo = tiposMedicamentos[i];
                indice = i;
                break;
            }
        }

        if (tipo == null) {
            JOptionPane.showMessageDialog(null, "No se encontró el tipo con código: '" + codigoActual + "'", "No encontrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String nombreAnterior = tipo.getNombre();

        String nuevoNombreLower = nuevoNombre.trim().toLowerCase();
        String nombreActualLower = nombreAnterior.toLowerCase();

        if (!nombreActualLower.equals(nuevoNombreLower)) {
            for (int i = 0; i < contadorTipos; i++) {
                if (tiposMedicamentos[i] != null && i != indice
                        && tiposMedicamentos[i].getNombre().toLowerCase().equals(nuevoNombreLower)) {
                    JOptionPane.showMessageDialog(null, "Ya existe otro tipo con el nombre: '" + nuevoNombre + "'", "Nombre duplicado", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }

        int medicamentosAfectados = 0;
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null
                    && medicamentos[i].getNombreTipo().equalsIgnoreCase(nombreAnterior)) {
                medicamentosAfectados++;
            }
        }

        if (medicamentosAfectados > 0 && !nombreActualLower.equals(nuevoNombreLower)) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "ATENCIÓN: Esta actualización afectará " + medicamentosAfectados + " medicamento(s)\n\n" + "Nombre actual del tipo: " + nombreAnterior + "\n" + "Nuevo nombre del tipo: " + nuevoNombre.trim() + "\n\n" + "Todos los medicamentos asociados se actualizarán automáticamente.\n" + "¿Desea continuar?", "Confirmar actualización en cascada", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirmacion != JOptionPane.YES_OPTION) {
                return false;
            }
        }

        String detalles;

        if (nuevosDetalles != null) {
            nuevosDetalles = nuevosDetalles.trim();
        }

        if (nuevosDetalles != null && !nuevosDetalles.isEmpty()) {
            detalles = nuevosDetalles;
        } else {
            detalles = tipo.getDetalles();
        }

        tiposMedicamentos[indice] = new TipoMedicamento(
                tipo.getCodigo(),
                nuevoNombre.trim(),
                detalles
        );

        if (!nombreActualLower.equals(nuevoNombreLower)) {
            for (int i = 0; i < contadorMedicamentos; i++) {
                if (medicamentos[i] != null
                        && medicamentos[i].getNombreTipo().equalsIgnoreCase(nombreAnterior)) {

                    // Crear un nuevo medicamento con el tipo actualizado
                    medicamentos[i] = new Medicamento(
                            medicamentos[i].getCodigo(),
                            medicamentos[i].getNombre(),
                            medicamentos[i].getDescripcion(),
                            nuevoNombre.trim(),
                            medicamentos[i].getPrecio(),
                            medicamentos[i].getStock(),
                            medicamentos[i].getNombreProveedor()
                    );
                }
            }

            guardarMedicamentos();
        }

        guardarTiposMedicamentos();

        String mensaje = "Tipo actualizado correctamente:\n\n" + "Código: " + tipo.getCodigo() + "\n" + "Nuevo nombre: " + nuevoNombre.trim();

        if (medicamentosAfectados > 0 && !nombreActualLower.equals(nuevoNombreLower)) {
            mensaje += "\n\n " + medicamentosAfectados + " medicamento(s) actualizado(s) automáticamente.";
        }

        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
// ==================== ELIMINAR TIPO DE MEDICAMENTO ====================

    public static boolean eliminarTipo(String codigo) {
        // Validar código
        if (codigo == null || codigo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del tipo a eliminar", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Buscar el tipo por código
        TipoMedicamento tipo = null;
        int indice = -1;
        String busqueda = codigo.trim().toLowerCase();

        for (int i = 0; i < contadorTipos; i++) {
            if (tiposMedicamentos[i] != null
                    && tiposMedicamentos[i].getCodigo().toLowerCase().equals(busqueda)) {
                tipo = tiposMedicamentos[i];
                indice = i;
                break;
            }
        }

        if (tipo == null) {
            JOptionPane.showMessageDialog(null, "No se encontro el tipo con codigo: '" + codigo + "'", "No encontrado", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        for (int i = indice; i < contadorTipos - 1; i++) {
            tiposMedicamentos[i] = tiposMedicamentos[i + 1];
        }
        tiposMedicamentos[--contadorTipos] = null;

        guardarTiposMedicamentos();

        JOptionPane.showMessageDialog(null, "Tipo eliminado correctamente:\n" + "Código: " + tipo.getCodigo() + "\n" + "Nombre: " + tipo.getNombre(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    // ==================== BUSCAR TIPO ====================
    public static TipoMedicamento buscarTipoPorNombreOCodigo(String criterio) { 
        if (criterio == null || criterio.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre o código del tipo para buscar", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return null;
        }

        String busqueda = criterio.trim().toLowerCase();

        for (int i = 0; i < contadorTipos; i++) {
            if (tiposMedicamentos[i] != null) {
                String codigo = tiposMedicamentos[i].getCodigo().toLowerCase();
                String nombre = tiposMedicamentos[i].getNombre().toLowerCase();

                if (codigo.equals(busqueda) || nombre.equals(busqueda)) {
                    return tiposMedicamentos[i];
                }
            }
        }

        JOptionPane.showMessageDialog(null, "No se encontró ningún tipo con: '" + criterio + "'", "No encontrado", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }

    private static TipoMedicamento buscarTipoPorCodigo(String codigo) {
        for (int i = 0; i < contadorTipos; i++) {
            if (tiposMedicamentos[i] != null
                    && tiposMedicamentos[i].getCodigo().equalsIgnoreCase(codigo.trim())) {
                return tiposMedicamentos[i];
            }
        }
        return null;
    }

    public static TipoMedicamento buscarTipoPorNombre(String nombre) {
        String nombreBusqueda = nombre.toLowerCase().trim();
        for (int i = 0; i < contadorTipos; i++) {
            if (tiposMedicamentos[i] != null
                    && tiposMedicamentos[i].getNombre().toLowerCase().trim().equals(nombreBusqueda)) {
                return tiposMedicamentos[i];
            }
        }
        return null;
    }

    // ==================== OBTENER ESTADÍSTICAS ====================
// Total de UNIDADES de medicamentos (suma de todos los stocks)
    public static int obtenerTotalUnidadesMedicamentos() {
        int totalUnidades = 0;
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null) {
                totalUnidades += medicamentos[i].getStock();
            }
        }
        return totalUnidades;
    }

// Total de TIPOS de medicamentos registrados (cantidad de medicamentos diferentes)
    public static int obtenerCantidadTiposMedicamentos() {
        return contadorMedicamentos;
    }

// Medicamentos con stock disponible (stock > 0) - CUENTA MEDICAMENTOS, NO UNIDADES
    public static int obtenerMedicamentosEnStock() {
        int enStock = 0;
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null && medicamentos[i].getStock() > 0) {
                enStock++;
            }
        }
        return enStock;
    }

// Medicamentos con bajo stock (stock <= 10) - INCLUYE LOS QUE TIENEN 0
    public static int obtenerMedicamentosBajoStock() {
        int bajoStock = 0;
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null && medicamentos[i].getStock() <= 10) {
                bajoStock++;
            }
        }
        return bajoStock;
    }

// Medicamentos sin stock (stock = 0)
    public static int obtenerMedicamentosSinStock() {
        int sinStock = 0;
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null && medicamentos[i].getStock() == 0) {
                sinStock++;
            }
        }
        return sinStock;
    }

// Obtener lista de medicamentos con bajo stock (para mostrar detalles) - INCLUYE LOS QUE TIENEN 0
    public static String[] obtenerListaBajoStock() {
        // Primero contar cuántos hay
        int contador = 0;
        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null && medicamentos[i].getStock() <= 10) {
                contador++;
            }
        }

        // Crear array del tamaño exacto
        String[] lista = new String[contador];
        int indice = 0;

        for (int i = 0; i < contadorMedicamentos; i++) {
            if (medicamentos[i] != null && medicamentos[i].getStock() <= 10) {
                lista[indice++] = medicamentos[i].getNombre() + " (Stock: " + medicamentos[i].getStock() + ")";
            }
        }

        return lista;
    }

    // ==================== MÉTODOS AUXILIARES ====================
    public static int obtenerCantidadMedicamentos() {
        return contadorMedicamentos;
    }

    public static int obtenerCantidadTipos() {
        return contadorTipos;
    }
}
