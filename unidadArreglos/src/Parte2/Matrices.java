package Parte2;
import java.util.*;
public class Matrices { // crear y imprimir
	public static int [][] crearMatrizInt(int filas, int col){
		Random rnd = new Random();
		int [][] matInt = new int [filas][col]; 
		for (int i=0; i<matInt.length; i++) {
			for (int j=0; j< matInt[0].length; j++) {
				matInt[i][j] = rnd.nextInt(101);
			}
		}
		return matInt;
	}
	
	public static void imprimirMatriz(int [][] mat1, String matNom) {
		for (int i=0; i<mat1.length; i++) {
			for (int j=0; j< mat1[0].length; j++) {
				System.out.print(matNom +"["+i+"]["+j+"]=" + mat1[i][j] + "		"); 
			}
			System.out.println(""); 
		}
	}
	
	public static int[] crearArregloInt(int tamano) {
		Random random = new Random();
		int[] arrInt = new int[tamano];
		for(int i=0; i<arrInt.length; i++) {
			arrInt[i] = random.nextInt((30 - 20)+ 1) + 20;
		}
		return arrInt;
	}

	public static void imprimirArregloInt(int[] arrInt) {
		for(int i=0; i<arrInt.length; i++) {
			System.out.print(arrInt[i] + " ");
		}
		
	}
}