import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Calcular el promedio de 3 numeros: ");

        System.out.print("Ingrese el número uno: ");
        var numeroUno = entrada.nextInt();
        System.out.print("Ingrese el número dos: ");
        var numeroDos = entrada.nextInt();
        System.out.print("Ingrese el número tres: ");
        var numeroTres = entrada.nextInt();

        // Promedio

        var promedio = (numeroUno + numeroDos + numeroTres) / 3;

        System.out.println("El promedio de los numeros anteriores es de " + promedio);

        entrada.close();

    }
}
