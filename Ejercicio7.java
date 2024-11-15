
/*
Calculadora Básica. Escribe un programa que solicite al usuario dos números y luego realice 
las operaciones de suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola.
*/
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora de Felipe");

        System.out.println("Ingrese el primer numero");
        var primernumero = calculadora.nextInt();

        System.out.println("Ingrese el segundo numero");
        var segundonumero = calculadora.nextInt();

        var suma = primernumero + segundonumero;
        var rest = primernumero - segundonumero;
        var mul = primernumero * segundonumero;
        var div = primernumero / segundonumero;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + rest);
        System.out.println("La multiplicación es " + mul);
        System.out.println("La división es " + div);

        calculadora.close();

    }

}
