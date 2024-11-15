import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println("¿Cuántos peces hay en el acuario?");

        Scanner ingresos = new Scanner(System.in);

        System.out.println("Ingrese el numero de peces rojos");
        var pecesRojos = ingresos.nextInt();

        System.out.println("Ingrese el numero de peces azules");
        var pecesAzules = ingresos.nextInt();

        System.out.println("El número de peces rojos es: " + pecesRojos);
        System.out.println("El número de peces azules es: " + pecesAzules);

        int totalPeces = pecesAzules + pecesRojos;

        System.out.println("En el acuario hay un total de " + totalPeces + " peces");

        ingresos.close();

    }
}
