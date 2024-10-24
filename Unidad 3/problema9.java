/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main{
    //problema 9
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero del 0 al 10");
		int num = scan.nextInt();
		switch(num){
		    case 1:
		        System.out.println("uno");
		    break;
		    case 2:
		        System.out.println("dos");
		    break;
		    case 3:
		        System.out.println("tres");
		    break;
		    case 4:
		        System.out.println("cuatro");
		    break;
		    case 5:
		        System.out.println("cinco");
		    break;
		    case 6:
		        System.out.println("seis");
		    break;
		    case 7:
		        System.out.println("siete");
		    break;
		    case 8:
		        System.out.println("ocho");
		    break;
		    case 9:
		        System.out.println("nueve");
		    break;
		    case 10:
		        System.out.println("diez");
		    break;
		    
		}
	}
}