/*
Elabora un programa en el cual leas diez nombres de personas, genera su edad de manera aleatoria
(edad máxima 100 años). Mostrar. Persona mas longeva: nombre y edad y Persona más joven:
nombre y edad;
*/
import java.util.*;
public class problema12{
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		String nombre, nombreMayor = "", nombreMenor = "";
		int edad, edadMenor=0, edadMayor=0, edadRepuesto=0, edadRepuesto2=0;
		for(int i=0; i<10; i++){
			edad = random.nextInt(100);
			System.out.println("Ingresa un nombre: ");
			nombre = scan.next();
			if(i==1){
			    edadMenor = edad;
			}
			System.out.println("la edad de "+nombre+" es : "+edad);
			if(edad > edadRepuesto){
				if(edadMayor < edad){
					edadMayor = edad;
					nombreMayor = nombre;
				}
			}else{
			    if(edadMenor > edad){
		        edadMenor = edad;
		        nombreMenor = nombre;
			    }
			}
		
			edadRepuesto2 = edadRepuesto;
			edadRepuesto = edad;
		}
		System.out.println("La edad mayor es '"+ edadMayor + "' su nombre es "+ nombreMayor);
		System.out.println("La edad menor es '"+ edadMenor+ "' su nombre es "+nombreMenor);
	}
}