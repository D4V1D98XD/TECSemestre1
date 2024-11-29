package Parte3;
import java.util.*;
public class problema234 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion=0, n1=0;
		
		do {
			System.out.println("Elige un problema 2, 3 o 4");
			opcion = scan.nextInt();
			switch(opcion) {
			case 2:
				System.out.println("Elige el tamano de tu arreglo");
				n1 = scan.nextInt();
				int[] array = problema234.crearArreglo(n1);
				problema234.imprimirArreglo(array);
				System.out.println();
				System.out.println("arreglo corregido");
				int[] resultado = problema234.problema2(array, n1);
				problema234.imprimirArreglo(resultado);
				System.out.println();
			break;
			case 3:
				int[][] matriz = problema234.crearMatriz(4, 4);
				problema234.imprimirMatriz(matriz);
				problema234.problema3(matriz);
			break;
			case 4:
				
			break;
			}
			
		}while(opcion >= 2 && opcion <= 4);
		
	}
	
	public static int[] problema2(int[] array, int tamano) {
		int temp;
		for(int i=0; i<tamano -1; i++) {
			for(int j=0; j<tamano - 1; j++) {
				if(array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j +1];
					array[j +1] = temp;
				}
			}
		}
		return array;
	}
	/* Notas para mi
	 * si para resolver este problema necesitamos comparar un elemento de la matriz con todos los demas
	 * si fuera arreglo fuera mas facil
	 * OK
	 * dejare el problema por mi propia salud mental
	 * hice un cochinero pero con eso ya queda
	 * para poder resolver el problema primero guarde el valor de la primera posicion y sin miedo al exito puse otros 2 for dentro de los 2 for ya hechos
	 * pero como de todos modos no estoy utilizando los indices de los primeros 2 no pasa nada, asi que los primeros 2 for se utilizan para
	 * guardar la posicion en la variable temporal, despues dentro de los 2 for posteriores hago la comparacion muy simple y incremento las veces que se
	 * repite ese numero. despues dentro del ciclo j hago la comparacion para saber si las veces que se repitio el numero es mas que el maximo
	 * despues nomas imprimo la moda y las posiciones
	 */
	public static void problema3(int[][] matriz) {
		int temp = 0, veces=0, moda = 0, max = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				temp = matriz[i][j];
				veces = 0;
				for(int k=0; k<matriz.length; k++) {
					for(int m=0; m<matriz[k].length; m++) {
						if(matriz[k][m] == temp) {
							veces++;
						}
					}
				}
				if(veces > max) {
					moda = temp;
					max = veces;
				}
			}
		}
		System.out.println("Moda "+ moda);
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j] == moda) {
					System.out.print("[" + i + "]" + "[" + j + "]");
				}
			}
		}
	}
	
	public static int[] crearArreglo(int tamano) {
		Random random = new Random();
		int[] array = new int[tamano];
		for(int i=0; i<tamano; i++) {
			array[i] = random.nextInt(21);
		}
		return array;
	}
	public static void imprimirArreglo(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static int[][] crearMatriz(int filas, int columnas) {
		Random random = new Random();
		int[][] matriz = new int[filas][columnas];
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				matriz[i][j] = random.nextInt(21);
			}
		}
		return matriz;
	}
	public static void imprimirMatriz(int[][] mat1) {
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1[0].length; j++) {
				System.out.println("Matriz [" + mat1[i][j] + "]");
			}
		}
	}

}
