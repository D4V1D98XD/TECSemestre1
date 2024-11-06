/*
Escribe un programa que lea de teclado un dato entero y determine si este es o no un número primo.
Los números primos son aquellos que solo tienen dos divisores (ellos mismos y la unidad).
*/
import java.util.*;
public class problema25{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++){
			if(num % i == 0){
				System.out.print("Es Primo");
			}else{
				System.out.println("No es primo");
			}
		}
		
	}
}