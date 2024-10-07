public class AutoDeportivo {
    String marca;
    String modelo;
    String color;
    Integer anio;

    public void metodocarro(){
        System.out.println();
        System.out.println();
        System.out.println("carrito.marca = " + this.marca);
        System.out.println("carrito.color = " + this.color);
        System.out.print("carrito.modelo = " + this.modelo + "\n");//sin ln no hay salto de linea
        //un print vacio tmb es salto de linea o poner el \n aparte
        System.out.println("carrito.anio = " + this.anio);
    }

}
