public class PruebaAuto {
    public static void main(String[] args) {
        //Crea un espacio en la memoria para el constructor con un objeto, esto es instanciar, los objetos se declaran
        //con minuscula
        Automovil auto = new Automovil("BMW");
        //otra forma de mandar datos es usando constructores con parametros, ya no se necesitaria el setMarca
        //auto.setMarca("BMW");
        auto.setModelo("i320");
        auto.setColor("Blanco"); //polimorfismo
        auto.setCilindraje(3.2);


        System.out.println(auto.detalleauto());

        System.out.println(auto.acelerar());
        System.out.println(auto.frenar(80));
        System.out.println(auto.capacidadTanque(40, 0.7f)); // el f es para que sepa que es flotante
        System.out.println(auto.capacidadTanque(40, 70f));



        //auto.detalleauto();
        //si no instancio no aparece el metodo

        Automovil mb = new Automovil("MB", "C250");
        //mb.setMarca("Mercedes Benz");
        //mb.setModelo("C200");
        mb.setColor("Gris");//polimorfismo
        mb.setCilindraje(2.5);
        //mb.detalleauto();
        System.out.println(mb.detalleauto());
        //solo instanciando aparecen los atributos

        System.out.println(auto.equals(mb));




        AutoDeportivo carrito = new AutoDeportivo();
        carrito.marca = "Porsche";
        carrito.color = "Negro";
        carrito.modelo = "Spyder";
        carrito.anio = 2024;
        carrito.metodocarro();




    }
}
