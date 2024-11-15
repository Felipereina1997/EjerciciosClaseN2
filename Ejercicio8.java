/*Ejercicio 8: Área y Perímetro de un Rectángulo
Crea un programa que calcule el área y el perímetro de un rectángulo.
Solicita al usuario la longitud y el ancho del rectángulo.*/

import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        System.out.println("Calcula el área y el perímetro de una rectangulo"); 
        System.out.println("");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Para calcular el área de un rectangulo necesitaré la base y la altura.\nPor favor ingrese el valor de la base (Valores solo numéricos): ");
        var base = entrada.nextInt();
        System.out.print("Por favor ingrese el valor de la altura (Valores solo numéricos): ");
        var altura = entrada.nextInt();

        var area = base * altura;
        var perímetro = (base + altura)*2;

        System.out.println("El área del rectangulo es: "+area);
        System.out.println("El perímetro del rectángulo es: "+perímetro);

        entrada.close();

        
    }
}
