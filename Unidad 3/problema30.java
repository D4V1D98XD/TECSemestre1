/*
Generador de contraseñas: Generar una contraseña aleatoria y permitir que el usuario decida si
quiere generar otra. 
*/
import java.util.*;
public class problema30{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String datos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!$#"; //todos los caracteres
		int tamanoContrasena = 0, bandera = 0;
		String contrasena = "";
		String resultado= "";
		do{
			tamanoContrasena = scan.nextInt();
			resultado = "";
			for(int i=0; i< tamanoContrasena; i++){
				resultado += datos.charAt(random.nextInt(datos.length()-1));
			}
			/*
			 //explicacion cabrona de esto: arriba se resetea resultado por si se tiene que generar otra contraseña,
			 dentro del for vemos += que resultado se esta autoigualando, asi para guardar los caracteres anteriores a cada vuelta
			 entonces usando el metodo charAt y con la clase Random genera un índice aleatorio que va de 0 a la longitud de datos menos uno.

			 osea, resultado obtiene un caracter aleatorio dentro del rango posible de datos
			*/
			contrasena = resultado;
			System.out.println("La contrasena es: "+contrasena+" - desea otra? 1 si 0 no");
			bandera = scan.nextInt();
		}while(bandera==1);
		
	}
}