import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print("Ingresa tu nombre por favor: ");
        var nombre = lector.nextLine();

        System.out.println("Welcome " + nombre + " Cuánto has pagado por esta prenda?");
        var valorConDescuento = lector.nextInt();

        System.out.print(
                "¿Qué % de rebaja tiene el articulo? ¿15%, 30%, 50%? \nEscribe aqui el valor sin el simbolo % -->");
        var descuento = lector.nextInt();

        var porcentajePorHallar = 100 - descuento;

        // Regla de 3 para conocer el precio real//
        var precioReal = valorConDescuento * 100 / porcentajePorHallar;

        System.out.printf(
                "Felicitaciones %s, tienes un descuento del %d%%, este articulo cuesta %d, pero con el descuento queda en %d ",
                nombre, descuento, precioReal, valorConDescuento);

        lector.close();

    }

}
