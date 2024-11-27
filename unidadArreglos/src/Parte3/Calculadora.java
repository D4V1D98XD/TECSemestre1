package Parte3;
import java.util.Scanner;
public class Calculadora {
	static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int num1 =0, num2 = 0;
		int opcion;
		double resultado = 0;
		
		do{
			opcion = menu();
		
			switch(opcion) {
			case 1:
				System.out.println("Ingresa el primer numero");
				num1 = scan.nextInt();
				System.out.println("Ingresa el segundo numero");
				num2 = scan.nextInt();
				resultado = Calculadora.suma(num1, num2);
				System.out.println("resultado: "+ resultado);
			break;
			
			case 2:
				System.out.println("Ingresa el primer numero");
				num1 = scan.nextInt();
				System.out.println("Ingresa el segundo numero");
				num2 = scan.nextInt();
				resultado = Calculadora.resta(num1, num2);
				System.out.println("resultado: "+ resultado);
			break;
			
			case 3:
				System.out.println("Ingresa el primer numero");
				num1 = scan.nextInt();
				System.out.println("Ingresa el segundo numero");
				num2 = scan.nextInt();
				resultado = Calculadora.producto(num1, num2);
				System.out.printf("resultado: %.2f", resultado);
			break;
			
			case 4:
				System.out.println("Ingresa el primer numero");
				num1 = scan.nextInt();
				System.out.println("Ingresa el segundo numero");
				num2 = scan.nextInt();
				resultado = Calculadora.dividir(num1, num2);
				System.out.printf("resultado: %.2f", resultado);
			break;
			
			case 5:
				System.out.println("Ingresa el primer numero");
				num1 = scan.nextInt();
				System.out.println("Ingresa el segundo numero");
				num2 = scan.nextInt();
				resultado = Calculadora.residuo(num1, num2);
				System.out.printf("resultado: %.2f", resultado);
			break;
			
			case 6:
				System.out.println("Ingresa el primer numero");
				num1 = scan.nextInt();
				System.out.println("Ingresa el segundo numero");
				num2 = scan.nextInt();
				resultado = Calculadora.potencia(num1, num2);
				System.out.printf("resultado: %.2f", resultado);
			break;
				
			case 7:
				System.out.println("Ingresa el numero");
				num1 = scan.nextInt();
				resultado = Calculadora.raiz(num1);
				System.out.printf("resultado: %.2f", resultado);
			break;
			}
		}while(opcion >= 1 && opcion <= 7);
		
	}
	
	
	public static int menu() {
		System.out.println();
		System.out.println("Calculadora - elige que quieres calcular");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Residuo");
		System.out.println("6. Potencia");
		System.out.println("7. Raiz");
		System.out.println("Cualquier otro numero para salir. Ingresa una opcion: ");
		return scan.nextInt();
	}
	
	public static int suma(int n1, int n2) {
		return n1 + n2;
	}
	public static int resta(int n1, int n2) {
		return n1 - n2;
	}
	public static double producto(int n1, int n2) {
		return n1 * n2;
	}
	public static double dividir(int n1, int n2) {
		return n1 / n2;
	}
	public static double residuo(int n1, int n2) {
		return n1 % n2;
	}
	public static double potencia(int n1, int n2) {
		return Math.pow(n1, n2);
	}
	public static double raiz(int n1) {
		return Math.sqrt(n1);
	}

}
