package parte1;
import java.util.Scanner;
public class portafolio1 {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int opcion = 0;
		int tamano = 0;
		do {
			opcion = menu();
			switch(opcion) {
			case 1:
				System.out.println("Ingresa el tamaño de tu arreglo:");
				tamano = scan.nextInt();
				System.out.println();
				
				int[] arreglo = Arreglos.crearArregloInt(tamano);
				Arreglos.imprimirArregloInt(arreglo);
				int triple = Ejercicios.sumaTripleArreglo(arreglo);
				System.out.println("el triple de la suma es: " + triple);
				break;
			case 2:
				System.out.println("Ingresa el tamaño de tu arreglo:");
				tamano = scan.nextInt();
				System.out.println();
				
				int[] arreglo2 = Arreglos.crearArregloInt(tamano);
				Arreglos.imprimirArregloInt(arreglo2);
				int[] impares = Ejercicios.impares(arreglo2);
				System.out.println("Los numeros impares son: ");
				Arreglos.imprimirArregloInt(impares);
				break;
			case 3:
				break;
			case 4:
				System.out.println("Calificaciones: ");
				int[] cali = Arreglos.crearArregloInt(12);
				Arreglos.imprimirArregloInt(cali);
				System.out.println();
				
				int promedio = Ejercicios.promedios(cali);
				System.out.println("El promedio de calificaciones aprobatorias es: "+ promedio);
				break;
			}
			
		  }
		while (opcion >= 1 && opcion <=6);
		System.out.println("sali");
	}
		
		public static int menu() {
			System.out.println();
			System.out.println("Menu de opciones");
			System.out.println("1. triple de suma en un arreglo");
			System.out.println("2. Mostrar elementos de las posiciones del arreglo que sean impares");
			System.out.println("3. generar array String a partrir de una cadena");
			System.out.println("4. promedio de alumnos aprobados");
			System.out.println("5. arreglo de vocales a partir de una cadena");
			System.out.println("6. encontrar posicion de un numeroen un arreglo");
			System.out.println("ingresa una opcion valida");
			return scan.nextInt();
		}
}
