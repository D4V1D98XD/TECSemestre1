/*
 Conversión de binario a decimal: Pedir al usuario que introduzca un número binario y convertirlo
a decimal. (usar ciclos). 
*/
import java.util.*;

public class problema29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String binario;
        int decimal = 0;
        int exponente = 0;
        char pos;

        System.out.println("Ingresa un numero binario:");
        binario = scan.next();

        for (int i=binario.length()-1; i>=0; i--) {
            pos = binario.charAt(i); //le asigno a el char el caracter y lo guarda
            if (pos == '1') { //compara para saber si es 1
                decimal += Math.pow(2, exponente); //decimal se iguala a si mismo y se pone dos a nuestro exponente
            }
            exponente++; //0 1 2 3 4 5 6 7 8
        } // queda como 2 elevado a 0 = 0, 2 elevado a 1 = 2 y asi

        System.out.println("El numero decimal es: " + decimal);
    }
}
