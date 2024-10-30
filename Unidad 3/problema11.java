/*
Escribe un programa que lea un dato numérico y dependiendo del rango donde se encuentre
obtenga el resultado (No usar ni switch ni if, usar operador ternario
Rango resultado
 0-5 Malo
 6-7 Regular
 8-9 Bueno
 10 Excelente
*/
import java.util.*;
public class problema11{
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(11);
		System.out.println("Numero: "+ num);
		System.out.print((num <= 5)? "Malo" : "");
		System.out.print((num >= 6 && num <= 7)? "Regular" : "");
		System.out.print((num >= 8 && num <= 9)? "Bueno" : "");
		System.out.print((num == 10)? "Excelente" : "");
			
	}
}