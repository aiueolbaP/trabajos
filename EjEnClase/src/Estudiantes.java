public class Estudiantes {
private String nombre;
private int edad;
private String codigo;

//


    public Estudiantes() {
    }

    public Estudiantes(String nombre) {
        this.nombre = nombre;
    }

    public Estudiantes(String nombre, int edad) {
        this(nombre);
        this.edad = edad;
    }

    public Estudiantes(String nombre, int edad, String codigo) {
        this(nombre, edad);
        this.codigo = codigo;
    }

    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //
    public String detalleAlum(){
        String alum;
        alum = "Alumno " + this.nombre + ", edad: "+ this.edad + ", con código: " + this.codigo + "\n";
        return alum;
    }
}
