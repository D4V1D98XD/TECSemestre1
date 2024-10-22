
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//problema 3
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int num = scan.nextInt();
		System.out.println((num % 2 == 0)? "VERDADERO" : "FALSO");
		
		//problema 4
		int cali;
		do{
		    System.out.println("ingresa la calificacion del alumno: ");
		    cali = scan.nextInt();
		}
		while(!(cali>= 0 && cali <= 100)); // se va
		
		System.out.println((cali >= 70)? "APROBADO" : "REPROBADO");
		
		//problema 5
		num = 0;
		System.out.println("ingresa un numero: ");
		num = scan.nextInt();
		double residuo = num % 10;
		double elevado = 0;
		if(residuo < 4){
		    residuo = num / 2;
		    System.out.println("entre");
		    }else if(residuo >= 4 && residuo <= 7){
		        elevado = Math.pow(residuo, 2); // cuadrado
		        System.out.println("cuadrado");
		    }else{
		        elevado = residuo * 20; // 20 veces su valor
		        System.out.println("20 veces");
		    }
		System.out.println("Resultado: "+ elevado);
	}
}

/******************************************************************************
Escribe un programa que lea de teclado un numero entero y determine
si es par o impar, Mostrar un valor boolean como resultado en su impresion
operador alternario ?

Escribe un programa que lea una calificacion de un alumno y obtenga como salida
obtenga como salida un mensaje si fue aprobado o reprobado (70 o mas aprobado)

Escribe un programa que lea un numero y si divido entre diez su residuo es menor
a 4 obtenga su mitad, si su residuo se ubica entre 4 y 7 obtenga su cuadrado
En caso contrario obtener 20 veces su valor. Mostrar el resultado en pantalla
*******************************************************************************/
