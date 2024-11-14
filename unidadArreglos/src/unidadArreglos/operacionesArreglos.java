package unidadArreglos;

public class operacionesArreglos {
	public static int[] sumarArrays(int[] n1, int[] n2){
		int[] sumArray = new int[n1.length];
		for(int i=0; i<n1.length; i++) {
			sumArray[i] = n1[i] + n2[i];
		}
		return sumArray;
	}

	public static int[] paroimparArray(int[] n1, int[] n2){
		int[] paroimpar = new int[n1.length];
		for(int i=0; i<n1.length; i++) {
			if(n1[i] % 2 == 0) {
				paroimpar[i] = n1[i];
			}
			if(n2[i] % 2 == 0) {
				paroimpar[i] = n2[i];
			}
		}
		return paroimpar;
	}
}
