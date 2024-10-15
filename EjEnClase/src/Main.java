import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Universidad udla = new Universidad();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String var1;
        System.out.println("Direccion: ");
        var1 = br.readLine();
        udla.setDireccion(var1);
        System.out.println(udla.detalleU());

        Estudiantes pablo = new Estudiantes();
        Scanner sc = new Scanner(System.in);

        String nombre1;
        int edad1;
        String codigo1;
        System.out.println("Nombre del alumno: ");
        //nombre1 = sc.nextLine(); //otra forma de leer datos
        nombre1 = br.readLine();
        pablo.setNombre(nombre1);

        System.out.println("Edad del alumno: ");
        //edad1 = sc.nextInt();
        edad1 = Integer.parseInt(br.readLine());
        pablo.setEdad(Integer.valueOf(edad1));


        float n1, n2, n3;
        System.out.println("Ingrese las 3 notas del alumno: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        //esta forma de leer no guarda los datos en el setter

        System.out.println(pablo.detalleAlum());




    }
}