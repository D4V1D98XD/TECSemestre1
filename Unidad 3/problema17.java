/*
Escribe un programa que lea de teclado x números enteros hasta que el número leído sea 0.
Imprimir cuantos múltiplos de 3 hubo en el bucle infinito.
*/
import java.util.*;
public class problema17{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0, contador=0;
		do{
			System.out.print("Ingresa un numero \n");
			num = scan.nextInt();
			if(num % 3 == 0){
				contador++;
			}
		}while(!(num==0));
		System.out.println("numero de multiplos de 3: "+ contador);
	}
}