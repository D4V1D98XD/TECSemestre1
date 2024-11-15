package parte1;
public class Ejercicios {
	//problema 1
	public static int sumaTripleArreglo(int [] arr) {
		int suma = 0, triple = 0;
		for(int i=0; i<arr.length; i++) {
			suma += arr[i];
		}
		triple = suma * 3;
		return triple;
	}
	//problema 2
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
	
	//problema 3
	public static String[] palabraPorPosicion(String palabras) {
		int espacios = 0;
		for(int i=0; i<palabras.length(); i++) {
			if(palabras.charAt(i) == ' ') {
				espacios++;
			}
		}
		int pos=0, espacioGuardado =0;
		String[] Arreglo = new String[espacios + 1]; //para poder guardar la ultima palabra + 1
		for(int i=0; i<palabras.length(); i++) {
			if(palabras.charAt(i) == ' ') {
				Arreglo[pos] = palabras.substring(espacioGuardado, i);
				pos++;
				espacioGuardado = i + 1;
			}
		}
		for(int i=espacioGuardado - 1; i<palabras.length(); i++) {
			if(palabras.charAt(i) == ' ') {
				Arreglo[pos] = palabras.substring(espacioGuardado, palabras.length());
			}
		}
		return Arreglo;
	}
	
	
	//problema 4
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
	//problema 5
	public static int[] frecuenciaVocales(String cadena) {
		int[] frecuencia = new int[5];
		//int a = 0,e = 1,I = 2,o = 3,u = 4; descartado pq es la misma si le pongo la posicion
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
				frecuencia[0]++;
			}
			else if(cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') {
				frecuencia[1]++;
			}
			else if(cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I') {
				frecuencia[2]++;
			}
			else if(cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O') {
				frecuencia[3]++;
			}
			else if(cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U') {
				frecuencia[4]++;
			}
		}
		return frecuencia;
	}
	
	
	//problema 6
	public static void posicionEnArreglo(int buscar, int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print((buscar == array[i])? "El numero se encuentra en la posicion: "+ (i + 1) + "\n" : "");
		}
		
	}
	
	/* en esta clase defines los metodos que resuelven cada uno de los problemas
	 * Un problema puede requerir mas de un metodo (No todos)
	 */
}