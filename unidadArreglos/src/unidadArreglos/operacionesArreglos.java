package unidadArreglos;

public class operacionesArreglos {
	public static int[] sumarArrays(int[] n1, int[] n2){
		int[] sumArray = new int[n1.length];
		for(int i=0; i<n1.length; i++) {
			sumArray[i] = n1[i] + n2[i];
		}
		return sumArray;
	}
	
}
