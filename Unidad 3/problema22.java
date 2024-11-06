/*
Escribe un programa que lea de teclado 10 nombres de personas y obtenga como resultado
cuantos nombres inician con letra A
*/
import java.util.*;
public class problema22{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre= "";
		int contador = 0;
		for(int i=0; i<10; i++){
			System.out.println("Ingresa un nombre");
			nombre = scan.next();
			if(nombre.charAt(0) == 'a' || nombre.charAt(0) == 'A'){
				contador++;
			}
		}
		System.out.println("Nombres que empiezan con A: "+ contador);
	}
}