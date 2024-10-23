/******************************************************************************

Escribe un programa que lea de teclado un numero entero y si esta entre 0 y 99
obtenga el numero de decenas que contiene

*******************************************************************************/
import java.util.*;
public class Main{
    //problema 10
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int num = scan.nextInt();
		int decenas = 0;
		do{
		    num = num / 10;
		    decenas++;
		}while(!(num > 0 && num <100));
		System.out.println("Numero de decenas: "+ decenas);
		
	}
}