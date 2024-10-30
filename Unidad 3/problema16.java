/*
Ingresa un número. Imprimir las tablas desde 1 hasta ese número. Por cada cambio de tabla, dejar
un renglón en blanco.
*/
import java.util.*;
public class problema16{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("Ingresa un numero");
		int n = scan.nextInt();

		for(int i=1; i<=n; i++){
			System.out.println("Tabla del "+ i);
			for(int j=1; j<=10; j++){
				System.out.println(i + "x"+ j + " = " + (i * j));
			}
			System.out.print("\n");
		}

	}
}
