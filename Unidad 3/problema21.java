/*
Escribe un programa que lea de teclado nombre y sexo de 10 personas y obtén como resultado el
total de hombres y el total de mujeres.
*/
import java.util.Scanner;
public class problema21{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nombre, sexo;
		int hombres=0, mujeres=0;
		for(int i = 0; i<10; i++){
			System.out.println("Ingresa el nombre");
			nombre = scan.next();
			System.out.println("Ingresa el sexo m masculino f femenino");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("m")){
				hombres++;
			}
			if(sexo.equalsIgnoreCase("f")){
				mujeres++;
			}
		}
		System.out.printf("Hombres: %d \n", hombres);
		System.out.printf("Mujeres: %d", mujeres);
	}
}