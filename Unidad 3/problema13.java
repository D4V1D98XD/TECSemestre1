/*
Escribe un programa que presente un menú de opciones (usar bucle infinito. Condicionar que
termine el programa hasta que se seleccione la opción salir) y obtenga el área de la figura,
(homologa el nombre de las medidas: ejemplo: longitud, magnitud, num2, radio, apotema) a
máximo 3 variables para calcular el perímetro y el área de las figuras, de acuerdo con el número
que ingrese en el menú de opciones.
1 triángulo
2 cuadrado
3 circulo
4 Pentagono
5 salir

*/
import java.util.*;
public class problema13{
	static Scanner scan = new Scanner(System.in);
	static Random random = new Random();
	public static void main(String[] args) {
		int menu, num1=random.nextInt(100), num2=random.nextInt(100), num3=random.nextInt(100);
		double resultado=0, perimetro = 0;
		boolean bandera = true;
		while(bandera){
			menu = problema13.menu();
			switch(menu){
				case 1:
					resultado = problema13.triagulo(num1, num2);
					System.out.println("base "+ num1);
					System.out.println("altura "+ num2);
					perimetro = num3 + num3 + num3;
					System.out.println("lados "+ num3);
					break;
				case 2:
					resultado = problema13.cuadrado(num1);
					System.out.println("Lado "+ num1);
					perimetro = num1 * 4;
					System.out.println("perimetro "+ perimetro);
					break;
				case 3:
					resultado = problema13.circulo(num1);
					System.out.println("radio "+ num1);
					perimetro = Math.PI * 2 * num1;
					System.out.println("perimetro "+ perimetro);
				
					break;
				case 4:
					resultado = problema13.pentagono(num1, num2);
					System.out.println("perimetro "+ num1);
					System.out.println("apotema "+ num2);
					break;
				case 5:
				bandera = false;
				break;
			}
			System.out.println("Area "+ resultado);
		}	
	}
		

	public static int menu(){
		System.out.println("Elige una opcion 1 triagulo 2 cuadrado 3 circulo 4 Pentagono 5 salir");
		int opc = scan.nextInt();
		return opc;
	}

	public static double triagulo(int num1, int num2){
		return (num1 / 2) * num2;
	}
	public static double cuadrado(int num1){
		return num1 * num1;
	}
	public static double circulo(int num1){
		return Math.PI * (num1 * num1);
	}
	public static double pentagono(int num1, int num2){
		return (num1 * num2) / 2;
	}
}