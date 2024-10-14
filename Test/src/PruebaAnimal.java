public class PruebaAnimal {
    public static void main(String[] args) {
        Animales caballo = new Animales();
        caballo.setNombre("caballo");
        caballo.setTipo("mamífero");
        caballo.setCantidad(10);
        caballo.setColor("morado");
        System.out.println(caballo.cosawea());


        Animales perro = new Animales("perro", "mamífero", 12, "azul");

        System.out.println(perro.cosawea());
    }
}
