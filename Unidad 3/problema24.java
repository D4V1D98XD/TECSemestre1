/*
Escribe un programa que lea de teclado un String y regrese un mensaje indicando si el String es un
palíndromo. Ejemplo: Reconocer
*/
import java.util.*;
public class problema24{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String invertido = "";

		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		int ultimo = texto.length();

		for(int i=ultimo - 1; i>=0; i--){
			invertido = invertido + texto.charAt(i);
		}
		if(invertido.equalsIgnoreCase(texto)){
			System.out.println("Es palindromo");
		}else{
			System.out.println("No es palindromo");

		}
	}
}