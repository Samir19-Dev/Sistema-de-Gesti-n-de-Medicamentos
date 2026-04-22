package parcialfinalpoo;

public class Medicamento {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String nombreTipo;
    private double precio;
    private int stock;
    private String nombreProveedor;

    public Medicamento(String codigo, String nombre, String descripcion,
            String nombreTipo, double precio, int stock, String nombreProveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.stock = stock;
        this.nombreProveedor = nombreProveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String toFileString() {
        return String.format("%s|%s|%s|%s|%.2f|%d|%s",
                codigo, nombre, descripcion, nombreTipo, precio, stock, nombreProveedor);
    }

    public static Medicamento fromFileString(String line) {
        String[] datos = line.split("\\|");
        if (datos.length == 7) {

            String precioTxt = datos[4].trim();
            precioTxt = precioTxt.replace(",", "."); 

            return new Medicamento(
                    datos[0],
                    datos[1],
                    datos[2],
                    datos[3],
                    Double.parseDouble(precioTxt),
                    Integer.parseInt(datos[5]),
                    datos[6]
            );
        }
        return null;
    }
}
