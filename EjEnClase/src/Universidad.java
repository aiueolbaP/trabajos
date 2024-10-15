public class Universidad {
private static String nombre = "UDLA" ;
private String direccion;

//

    public Universidad() {
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public Universidad(String nombre, String direccion) {
        this(nombre);
        this.direccion = direccion;
    }


    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    //

    public String detalleU(){
        String cosa;
        cosa = this.nombre + " ubicacion: " + this.direccion + " \n";
        return cosa;
    }
}



