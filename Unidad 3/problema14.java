/*
Escribe un programa que lea de teclado un String y obtenga como resultado el número de palabras
que contiene.
*/
import java.util.*;
public class problema14{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador=1;
		System.out.println("Ingresa un texto");
		String texto = scan.nextLine();

		for(int i=0; i<texto.length(); i++){
			if(texto.charAt(i) == ' '){
				contador++;
			}
		}
		System.out.println("Contador: "+contador);
	}
}