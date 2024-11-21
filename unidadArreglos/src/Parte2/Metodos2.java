package Parte2;
public class Metodos2 {
	public static int [][] sumarMatriz(int [][] mat1, int [][]mat2){
		int [][] matS = new int [mat1.length][mat1[0].length];
		for (int i=0; i<mat1.length; i++) {
			for (int j=0; j< mat1[0].length; j++) {
				matS[i][j] = mat1[i][j] + mat2[i][j]; 
			}
 	}
	return matS;
	}
	//pense que era con matriz elpepe PROBLEMA 2
	public static int[] elementosComunes(int[] mat1,int[] mat2){
		int tamano = 0;
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1.length; j++) {
				if(mat1[i] == mat2[j]) {
					tamano++;
				}
			}
		}
		int[] comunes = new int[tamano];
		tamano = 0;
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1.length; j++) {
				if(mat1[i] == mat2[j]) {
					comunes[tamano] = mat1[i];
					tamano++;
				}
			}
		}

		return comunes;
	}
	
	
	
	public static int[] valoresDiferentes(int[] arr1, int[] arr2) {
		int tamano = 0;
		boolean encontrado = false;
		for(int i=0; i<arr1.length; i++) {
			encontrado = false;
			for(int j=0; j<arr1.length; j++) {
				if(arr1[i] != arr2[j]) {
					System.out.println("wep");
					encontrado = true;
					break;
				}
			}
			if(encontrado) {
				tamano++;
			}
		}
		System.out.println("tamano "+ tamano);
		System.out.println();
		int[] diferente = new int[tamano];
		tamano = 0;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr1[i] != arr2[j]) {
					diferente[tamano] = arr1[i];
					tamano++;
				}
			}
			
		}
		return diferente;
	}
}
