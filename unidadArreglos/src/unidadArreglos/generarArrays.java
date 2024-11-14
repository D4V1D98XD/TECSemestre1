package unidadArreglos;

public class generarArrays {
	public static void main(String[] args) {
		int[] arr1 = Arreglos.crearArregloInt(20);
		Arreglos.imprimirArregloInt(arr1);
		System.out.println();
		
		int[] arr2 = Arreglos.crearArregloInt(20);
		Arreglos.imprimirArregloInt(arr2);
		System.out.println();
		
		//Guardar en un tercer arreglos la suma de los arreeglos arr1 y arr2
		if(arr1.length == arr2.length) {
			int[] sumArray = operacionesArreglos.sumarArrays(arr1, arr2);
			System.out.println("Tercer Arreglos");
			Arreglos.imprimirArregloInt(sumArray);
			int[] paroimparArray = operacionesArreglos.paroimparArray(arr1, arr2);
			System.out.println("Par o Impar");
			Arreglos.imprimirArregloInt(paroimparArray);
		//todo numero menor a 100 lo haremos un 0, y mayor a 100 un 200
		}
	}

}
