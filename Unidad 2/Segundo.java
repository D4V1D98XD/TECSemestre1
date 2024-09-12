//Leonardo David Garcia Leyva 4-5 pm
//Problema 1.- Pedir nombre completo, edad y numero de control y mostrarlo
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		String nombreCompleto, numcontrol;
		int edad;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa nombre completo:");
		nombreCompleto = scan.nextLine();
	    System.out.println("Ingresa tu numero de control: ");
	    numcontrol = scan.nextLine();
	    System.out.println("Ingresa tu edad: ");
	    edad = scan.nextInt();
	    System.out.println("El alumno: "+nombreCompleto + " con el numero de contol:"
	    + numcontrol +" su edad: "+ edad);
	    
	}
}