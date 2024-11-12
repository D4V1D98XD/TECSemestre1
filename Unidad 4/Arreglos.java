package arreglos;
import java.util.*;
public class Arreglos {
	static Scanner scan = new Scanner(System.in);
	//create int
	public static int[] crearArregloInt(int tamano) {
		Random random = new Random();
		int[] arrInt = new int[tamano];
		for(int i=0; i<arrInt.length; i++) {
			arrInt[i] = random.nextInt(101);
		}
		return arrInt;
	}
	//print int
	public static void imprimirArregloInt(int[] arrInt) {
		for(int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i] + " ");
		}
	}
	//create String
	public static String[] crearArregloString(int tamano) {
		String[] arrString = new String[tamano];
		for(int i=0; i<arrString.length; i++) {
			arrString[i] = scan.nextLine();
		}
		return arrString;
	}
	//print String
	public static void imprimirArregloString(String[] arrString) {
		for(int i=0; i<arrString.length; i++) {
			System.out.println(arrString[i] + " - ");
		}
	}
	
	//create double
		public static double[] crearArregloDouble(int tamano) {
			double[] arrDouble = new double[tamano];
			for(int i=0; i<arrDouble.length; i++) {
				arrDouble[i] = scan.nextDouble();
			}
			return arrDouble;
		}
		//print double
		public static void imprimirArregloDouble(double[] arrDouble) {
			for(int i=0; i<arrDouble.length; i++) {
				System.out.println(arrDouble[i] + " ");
			} 
		}
		
		//create boolean
		public static boolean[] crearArregloBoolean(int tamano) {
			return new boolean[] {true, false, true, false, true, false, true, false, true, false};

}
