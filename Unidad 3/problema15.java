/*
Generar n números aleatorios entre 1 y 100 hasta que encuentre un número menor que cinco.
Imprimir cuantas veces se ejecutó el ciclo.
*/
import java.util.*;
public class problema15{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int num = 0;
		System.out.println("Ingresa un numero");
		int n = scan.nextInt();

		for(int i=0; i<=n; i++){
			num = random.nextInt((10 - 1) + 1) + 1;
			if(num < 5){
				System.out.println("El ciclo se ejecuto "+ i);
				break;
			}
		}

	}
}