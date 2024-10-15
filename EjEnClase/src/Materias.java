public class Materias {
    private String nombre;
    private String codigo;

    //

    public Materias() {
    }

    public Materias(String nombre) {
        this.nombre = nombre;
    }

    public Materias(String nombre, String codigo) {
        this(nombre);
        this.codigo = codigo;
    }

    //


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
