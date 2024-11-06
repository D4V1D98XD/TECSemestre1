/*
Juego de adivinar el número: Hacer que el usuario adivine un número entre 1 y 100, mostrando si
el número ingresado es mayor o menor que el número a adivinar. Detener el ciclo hasta adivinar el
número. 
*/
import java.util.*;
public class problema28{
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int adivinar = random.nextInt((100 - 1) + 1);
		System.out.println(adivinar);
		int num = 0;
		boolean bandera = true;
		while(bandera){
			System.out.println("Ingresa un numero");
			num = scan.nextInt();
			if(num < adivinar){
				System.out.println("es mayor");	
			}
			if(num > adivinar){
				System.out.println("es menor");	
			}
			if(num == adivinar){
				System.out.println("JUEGO TERMINADO ADIVINASTE");
				bandera = false;	
			}
		}
	}
}