/******************************************************************************

Escribe un programa que lea de teclado un numero entero y si esta entre 0 y 99
obtenga el numero de decenas que contiene

*******************************************************************************/
import java.util.*;
public class problema10{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, decenas=0;
		do{
			System.out.println("Ingresa un numero: ");
			num = scan.nextInt();	
		}while(!(num >= 0 && num <= 99));
		decenas = num / 10;
		System.out.println("Numero de decenas: "+ decenas);

	}
}
