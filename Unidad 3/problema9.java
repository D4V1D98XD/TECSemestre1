
import java.util.*;
public class Main{
    //problema 9
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero del 0 al 10");
		int num = scan.nextInt();
		String numero = "";
		switch(num){
		    case 0:
		        numero = "cero";
		    break;
		    case 1:
		        numero = "uno";
		    break;
		    case 2:
		        numero = "dos";
		    break;
		    case 3:
		        numero = "tres";
		    break;
		    case 4:
		        numero = "cuatro";
		    break;
		    case 5:
		        numero = "cinco";
		    break;
		    case 6:
		        numero = "seis";
		    break;
		    case 7:
		        numero = "siete";
		    break;
		    case 8:
		        numero = "ocho";
		    break;
		    case 9:
		        numero = "nueve";
		    break;
		    case 10:
		        numero = "diez";
		    break;
		    
		}
		System.out.println("El numero es "+ numero);
	}
}
