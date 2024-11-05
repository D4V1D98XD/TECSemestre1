/*
 Leer un valor String. Mostrar la cadena invertida palabra por palabra. Presentarla en consola
invertida letra a letra
*/
import java.util.*;
public class problema18{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String invertido = "";

		System.out.print("Introduce un texto: ");
		String texto = scan.nextLine();
		int ultimo = texto.length();

		System.out.println("Largo: "+ultimo);
		for(int i=ultimo - 1; i>=0; i--){
			invertido = invertido + texto.charAt(i);
		}
		System.out.println("Texto invertido: "+invertido);
	}
}