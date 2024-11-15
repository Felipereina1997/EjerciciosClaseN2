public class Ejercicio1 {

    public static void main(String[] args) {
        
        int resultado = 6/2*(1+2);
        
        System.out.println("Este es el resultado:2" + resultado);
        /*

        1) El resultado correcto es 9, ya que la calculadora del celular interpreta que debe resolver primero lo que está dentro del paréntesis,
           luego la división, y finalmente la multiplicación, así:

           6 / 2*( 1 + 2)
           6 / 2 * 3        "la mult y la division están en el mismo nivel de jerarquía, pero se ejecuta de izq a der"
           3 * 3
           9

        2) la calculadora cientifica arroja 1 ya que esta asumiendo una multiplicacion implicita en la expresión interpretando " 2(1 + 2)" de esta manera:

        6 / (2* (1 + 2))
        6 / (2 + 4)
        6 / 6
        1
    
         Y esto sucede ya que en la expresión no se dijita *, en cambio está seguido de un paréntesis.

        */
    }
}