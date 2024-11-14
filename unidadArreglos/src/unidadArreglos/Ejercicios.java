package parte1;
public class Ejercicios {
	public static int sumaTripleArreglo(int [] arr) {
		int suma = 0, triple = 0;
		for(int i=0; i<arr.length; i++) {
			suma += arr[i];
		}
		triple = suma * 3;
		return triple;
	}
	
	public static int[] impares(int[] arr) {
		int contador = 0;
		int pos = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 != 0) {
				contador++;
			}
		}
		int[] impares = new int[contador];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 != 0) {
				impares[pos] = arr[i];
				pos++;
			}
		}
		return impares;
	}
	
	public static int promedios(int[] arr) {
		int promedio = 0, alumnos = arr.length;
		for(int i=0; i<alumnos; i++) {
			if(arr[i]>= 70) {
				promedio += arr[i];
			}
		}
		promedio /= alumnos;
		
		return promedio;
	}
	
	/* en esta clase defines los metodos que resuelven cada uno de los problemas
	 * Un problema puede requerir mas de un metodo (No todos)
	 */
}