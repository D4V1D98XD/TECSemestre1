/*
 La CFE desea obtener los recibos de pago de sus usuarios, la cantidad a pagar se calcula con base
a los kw consumidos en el periodo de acuerdo con la siguiente tabla, además de agregar el 16% de
iva. Escribe un programa para procesar los datos de 50 usuarios, Genera aleatoriamente la
lectura actual y la lectura anterior, (contempla que la diferencia entre estas dos no supere los
3000 kW). Imprimir por cada usuario
*/
import java.util.*;
public class problema27{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String usuario;
		int lecturaActual=0, lecturaAnterior=0;
		double kw = 0, subtotal=0, iva = 0, total=0;

		for(int i=0; i<50; i++){
			usuario = scan.next();
			lecturaActual = random.nextInt((3000 - 1 ) +1);
			lecturaAnterior = random.nextInt((3000 - 1 ) +1);
			kw = lecturaAnterior - lecturaActual;
			kw = Math.abs(kw);
			System.out.println("Lectura Anterior: "+ lecturaAnterior);
			System.out.println("Lectura Actual: " + lecturaActual);
			System.out.println("kilowatts: "+ kw);
			if(kw >0 && kw<=299){
				subtotal = kw * 0.45;
			}
			else if(kw >=300 && kw<=450){
				subtotal = kw * 0.68;
			}
			else if(kw >450 && kw<=999){
				subtotal = kw * 0.95;
			}
			else if(kw >= 1000){
				subtotal = kw * 2.51;
			}
			iva = subtotal * 0.16;
			total = subtotal + iva;
			System.out.printf("Total a Pagar: %.2f \n", total);
		}
	}
}