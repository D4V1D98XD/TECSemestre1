/*
Escribe un programa que lea de teclado un número entero y regrese como resultado en pantalla
todos sus divisores.
*/
import java.util.*;
public class problema23{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++){
			if(num % i == 0){
				System.out.print(i +  " ");
			}
		}
	}
}