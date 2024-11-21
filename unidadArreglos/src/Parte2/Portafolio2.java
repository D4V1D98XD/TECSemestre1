package Parte2;
import java.util.Scanner;
public class Portafolio2 {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int opcion = 0;
		int filas = 5, columnas = 5;
		do {
			opcion = menu();
			switch(opcion) {
			
			case 1:

			break;
			
			case 2:
				int[] arr1 = Matrices.crearArregloInt(filas);
				Matrices.imprimirArregloInt(arr1);
				System.out.println();
				int[] arr2 = Matrices.crearArregloInt(filas);
				Matrices.imprimirArregloInt(arr2);
				System.out.println();
				int[] comunes = Metodos2.elementosComunes(arr1,arr2);
				Matrices.imprimirArregloInt(comunes);
			break;
			
			case 3:
				int[] array1 = Matrices.crearArregloInt(filas);
				Matrices.imprimirArregloInt(array1);
				System.out.println();
				int[] array2 = Matrices.crearArregloInt(filas);
				Matrices.imprimirArregloInt(array2);
				System.out.println();
				int[] diferente = Metodos2.valoresDiferentes(array1, array2);
				Matrices.imprimirArregloInt(diferente);
			break;
			
			case 4:

			break;
			
			case 5:
				
			break;
				
			case 6:

			break;
			
			case 7:

			break;
			
			case 8:

			break;
			
			case 9:

			break;
			}
			
		  }
		while (opcion >= 1 && opcion <=9);
		System.out.println("sali");
	}
		
		public static int menu() {
			System.out.println();
			System.out.println("Menu de opciones");
			System.out.println("1. Intercambiar mitades de un vector");
			System.out.println("2. Elementos comunes de dos vectores");
			System.out.println("3. Elementos que no se repiten");
			System.out.println("4. Recorrer posiciones de un arreglo");
			System.out.println("5. Generar arreglo de pares e impares");
			System.out.println("6. Suma de matrices");
			System.out.println("7. Diagonal princial y su suma");
			System.out.println("8. Transpuesta de una matriz");
			System.out.println("9. Valor mayor al cuadrado de una matriz");	
			System.out.println("Cualquier otro numero para salir. Ingresa una opcion: ");
			return scan.nextInt();
		}
}
