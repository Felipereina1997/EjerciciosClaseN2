import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del computador");
        var precio = entrada.nextInt();

        var descuento = precio * 0.10;
        var valorNuevo= precio - descuento;

        System.out.println("¿Sabías que hoy estamos de descuento?\n Si pagas hoy tendrás un 10% de descuento, asi que en realidad te puedes llevar esta gran maquina por tan solo " +  valorNuevo + " euros");

        entrada.close();
    }
    
}
