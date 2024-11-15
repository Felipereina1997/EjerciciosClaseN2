import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Escribe un programa que convierta una temperatura dada en grados Celsius a
        // grados Fahrenheit y Kelvin.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese los grados celsius= ");
        var celsius = entrada.nextInt();

        var fahrenheit = (celsius * 1.8) + 32;
        var kelvin = (celsius + 273.15);

        System.out.print(celsius + "° celsius equivale a " + fahrenheit + " ° fahrenheit y a " + kelvin + " ° kelvin");

        entrada.close();

    }
}
