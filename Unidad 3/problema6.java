import java.util.*;
public class problema6
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double comision=0, subtotal=0, total=0;
		String aceite, tarjeta;
		do{ // las variables tienen que ser creadas afuera del do
    		System.out.println("Que aceite desea usar? tayron Bardahl chevron");
    		aceite = scan.next();
    		System.out.println("Va a pagar con tarjeta? si o no");
    		tarjeta = scan.next();
    		//va a estar en repeticion hasta que se cumpla una de las 2
		}while(!(aceite.equalsIgnoreCase("Bardahl") || 
		        aceite.equalsIgnoreCase("tayron")   || 
		        aceite.equalsIgnoreCase("chevron")) || // tiene 3 opciones aceite, y ocupamos nomas 1
		        !(tarjeta.equalsIgnoreCase("si")    || 
		        tarjeta.equalsIgnoreCase("no")));// tiene otro ! porque son diferentes variables y ocupamos que se cumplan las 2
		
		if(aceite.equalsIgnoreCase("Bardahl")){
    	    subtotal = 1300;
        }
    	else if(aceite.equalsIgnoreCase("tayron")){
    	    subtotal = 900;
    	}
    	else if(aceite.equalsIgnoreCase("chevron")){
    	    subtotal = 1700;
    	}
    	if(tarjeta.equalsIgnoreCase("si")){
    	    comision = subtotal * 0.03;
    	}
		total = subtotal + comision;
		System.out.printf("Total a pagar: %.2f", total);
	}
}
/******************************************************************************
problema 6
Un taller mecánico tiene 3 tarifas para afinaciones dependiendo de la marca del aceite. La
afinación usando marca tayron cuesta $900, con la marca Bardahl cuesta $1300 y con la marca
chevron cuesta $1700. Si paga con tarjeta, se aumenta un 3% de comisión. Cuanto será el total a
pagar


*******************************************************************************/