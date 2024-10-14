public class Animales {
    private String nombre;
    private String tipo;
    private int cantidad;
    private String color;
    static String estado = "muerto";
    // constructores


    public Animales() {
    }

    public Animales(String nombre) {
        this.nombre = nombre;
    }

    public Animales(String nombre, String tipo) {
        this(nombre);
        this.tipo = tipo;
    }

    public Animales(String nombre, String tipo, int cantidad) {
        this(nombre, tipo);
        this.cantidad = cantidad;
    }

    public Animales(String nombre, String tipo, int cantidad, String color) {
        this(nombre, tipo, cantidad);
        this.color = color;
    }
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    //metodos

    public String cosawea(){
        StringBuilder sb = new StringBuilder();
        sb.append("El animal es el "+ this.nombre + ", ");
        sb.append("es de tipo "+ this.tipo + ", ");
        sb.append("hay " + this.cantidad + " de ellos, ");
        sb.append("es de color " + this.color);
        sb.append(" el animal está " + Animales.estado);
        sb.append("\n");
        return sb.toString();
    }
}
