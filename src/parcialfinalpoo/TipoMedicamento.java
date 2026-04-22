
package parcialfinalpoo;


public class TipoMedicamento {
   private String codigo;
    private String nombre;
    private String detalles;

    public TipoMedicamento(String codigo, String nombre, String detalles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.detalles = detalles;
    }

    public String getCodigo() { 
        return codigo; 
    }
    public String getNombre(){ 
        return nombre; 
    }
    public String getDetalles(){
        return detalles; 
    }

    public String toFileString() {
        return codigo + "|" + nombre + "|" + detalles;
    }

    public static TipoMedicamento fromFileString(String line) {
        String[] datos = line.split("\\|");
        return (datos.length == 3) ? new TipoMedicamento(datos[0], datos[1], datos[2]) : null;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
