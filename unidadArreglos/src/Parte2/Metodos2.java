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
	//pense que era con matriz elpepe
	public static int[] elementosComunes(int[] mat1,int[] mat2){
		int tamano = 0;
		for(int i=0; i<mat1.length; i++) {
			if(mat1[i] == mat2[i]) {
				tamano++;
			}
		}
		int[] comunes = new int[tamano];
		tamano = 0;
		for(int i=0; i<mat1.length; i++) {
			if(mat1[i] == mat2[i]) {
				comunes[tamano] = mat1[i];
				tamano++;
			}
		}

		return comunes;
	}
}
