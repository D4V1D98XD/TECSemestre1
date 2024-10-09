/*
PROBLEMA NUM 7
Maria quiere un pasaporte mexicano las tarifas tienen estas restricciones:
    costo por 3 años 1650.00, por 6 años 2275.00, por 10 años 3899.00
    tipo: ordinario, discapacidad 50% de descuento
    cuanto es el total a pagar
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float descuento=0, total=0, precio=0;
		
		System.out.println("Ingresa el tipo de pasaporte a adquirir: ");
		boolean esPassword = (scan.nextInt()==1);
		
		System.out.println("Ingresa la duracion: 1. 3 años 2. 6 años 3. 10 años");
		int durPase = scan.nextInt();
		if(durPase >= 1 && durPase <=3){
		    if(durPase==1){
		        precio = 1650.00f;
		    }
		    if(durPase==1){
		        precio = 2275.00f;
		    }
		    else{
		        precio = 3899.00f;
		    }
		}
		if(!esPassword){
		    descuento = precio * 0.50f;
		}
		
		total = precio - descuento;
		System.out.println("el tipo de pasaporte es:"+((esPassword)?"Ordinario" : "discapacidad"));
		System.out.println("total a pagar: "+total);
		System.out.printf("Precio Unitario de pasaporte: %.2f%n", precio);
        System.out.printf("Descuento: %.2f%n", descuento);
		
	}
}