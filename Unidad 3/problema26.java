/*
Escribe un programa que lea de teclado un String y obtenga el total de caracteres que son dígitos.
(usa un for, por cada digito, tendrás que hacer uso de la clase Character para corroborarlo). 
*/
import java.util.*;
public class problema26{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		int largo = texto.length();
		int contador = 0;
		char caracter;
		for(int i=0; i<largo; i++){
			caracter = texto.charAt(i);

			if(Character.isDigit(caracter)){
				contador++;
			}
		}
		System.out.println("el texto tiene "+ contador + " digitos");
	}
}