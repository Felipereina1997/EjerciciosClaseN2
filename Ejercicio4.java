import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner platica = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        var nombre = platica.nextLine();

        System.out.print("Bienvenida " + nombre + " Ingrese el dinero que disponías antes de salir: ");
        var antes = platica.nextDouble();

        System.out.print("Por favor ingresa la cantidad de dinero que tienes ahora: ");
        var despues = platica.nextDouble();

        var actual = antes - despues;

        System.out.print("En tus manos debes tener " + actual + ", y te gastaste " + despues + " euros");

        platica.close();

    }
}
