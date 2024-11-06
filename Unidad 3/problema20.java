/*
Escribe un programa que lea de teclado un numero de 0 a 10 y obtenga su factorial.
*/
import java.util.Scanner;
public class problema20{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int factor = 1; // se inicia en 1 porque si lo inicias en 0 se va a multiplicar por 0
		System.out.println("Ingresa un numero del 0 al 10");
		int numero = scan.nextInt();
		for(int i=1; i<=numero; i++){ //no queremos multiplicar por 0 asi que i empieza en 1
			factor *= i;
		}
		
		System.out.println("factorial: "+ factor);
	}
}