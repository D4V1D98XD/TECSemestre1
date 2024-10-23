/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main{
    //problema8
	public static void main(String[] args) {
		Random random = new Random();
		double bono = 0;
		System.out.println("Cuanto vende el empleado: ");
		int venta = random.nextInt((20000 - 2000)+ 1) + 2000;
		System.out.println("El empleado vende: "+ venta);
		if(venta >= 10000){
		    bono = venta * 0.05;
		}else if(venta>5000 && venta <10000){
		    bono = venta * 0.03;
		}
		System.out.printf("El empleado recibira un bono de: %.2f", bono);
	}
}