public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Negro";
    private double cilindraje;
    private float consumo = 40;


   //para acceder a los valores de atributos privados el metodo debe ser publico
   //getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
   /*public void leerMarca(String marca){
       //al atributo marca se le asigna la variable marca
       this.marca = marca;

   }

   public void escribirMarca(){
       this.marca = marca;
   }
    */

    public String detalleauto(){
        //este es el metodo
        //String modelo = "otro";
        //primero toma la parte interna, por eso toma el valor de otro al estar dentro del proceso
        //el this diferencia valores dentro o fuera de un producto
        //this hace que tome primero los datos de la clase y atributos, sin el, toma el valor de las variables que llama
        /*System.out.println("La marca del auto es: "+ marca);//este es con sout
        System.out.println("auto.modelo = " + this.modelo);//este es con soutv
        System.out.println("auto.color = " + color);
        System.out.println("auto.cilindraje = " + cilindraje);
        //los demas funcionan con o sin el this porque no hay variables con el mismo nombre dentro de la funcion, solo modelo*/
        StringBuilder sb = new StringBuilder();

        sb.append("La marca del auto es: "+ this.marca + " \n");//este es con sout
        //this sirve con private porque esta dentro de la misma clase
        sb.append("auto.modelo = " + this.modelo + " \n");//este es con soutv
        sb.append("auto.color = " + this.color + " \n");
        sb.append("auto.cilindraje = " + this.cilindraje + " \n");
        return sb.toString();
    }

    public String acelerar(){
        return "El auto marca: " + this.marca + " Esta acelerando";
    }
    public String frenar(int kmph){
        return "El auto modelo " + this.modelo + " esta frenando a -> " + kmph + " km/h" ;
    }
    public float capacidadTanque(int cap, float porConsumo){
        float cm = consumo / (cap*porConsumo);
        return cm;
    }
// pueden haber 2 metodos con el mismo nombre siempre y cuando sus parametros o procesos sean diferentes
//eso se llama sobrecarga de métodos
    //ahi se aplica el principio de polimorfismo, porque el mismo nombre funciona como varios métodos
    public float capacidadTanque(int cap, int porConsumo){
        float cm = consumo / (cap*(porConsumo/100));
        return cm;
    }




}
