/*
En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga
 en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€.
¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto. 
*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in); // Aqui creo mi objeto llamado lector para registrar la informacion
                                                 // suministrada por el usuario

        double ciengrPernil = 0.0595;
        double precioTotal = 0;

        System.out.println("Ingrese por favor su nombre:");
        String nombre = lector.nextLine();

        System.out.println(
                "Bienvenido a Tiendas Ara " + nombre + " es un gusto tenerte con nosotros ¿Cuántos gr deseas llevar?");
        double cantidadgr = lector.nextDouble();

        precioTotal = ciengrPernil * cantidadgr;

        System.out.printf("El precio por los %.1f gr equivale a %.2f euros", cantidadgr, precioTotal);// Aqui prendí a
                                                                                                      // cómo imprimir
                                                                                                      // valores con los
                                                                                                      // decimales que
                                                                                                      // yo quiera
                                                                                                      // utilizando
                                                                                                      // printf

        lector.close();

    }

}
