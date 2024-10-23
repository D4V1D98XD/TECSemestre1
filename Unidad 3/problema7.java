import java.util.*;
public class problema7{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String membresia;
		double num=0, monedero=0, reembolso=0;
		do{
			System.out.println("Que membresia usa? clasica negocio premium benefits");
			membresia = scan.next();
			System.out.println("Cuanto dinero gasto?");
			num = scan.nextInt();
		}while(!(membresia.equalsIgnoreCase("negocio")  || 
		        membresia.equalsIgnoreCase("premium")   ||
		        membresia.equalsIgnoreCase("clasica")   || 
		        membresia.equalsIgnoreCase("benefits")));

		if(membresia.equalsIgnoreCase("negocio")){
			monedero = num * 0.02;
		}
		else if(membresia.equalsIgnoreCase("premium")){
			monedero = num * 0.05;
			reembolso = 100;
		}
		else if(membresia.equalsIgnoreCase("benefits")){
			monedero = num * 0.10;
			reembolso = num * 0.05;
		}
		System.out.printf("Monedero Electronico: %.2f \n", monedero);
		System.out.printf("reembolso: %.2f",reembolso);

	}
}
/******************************************************************************
problema 7
Sams Club premia a sus clientes, si tiene membresía clásica, no genera monedero electrónico. Si
tiene membresía negocio, le otorga un monedero del 2%. La membresía Premium, tiene genera un
5% de monedero electrónico y un reembolso de $100 pesos en efectivo. La membresía benefits
genera un 10% de monedero electrónico y el 5% de reembolso en efectivo. ¿Si un cliente compra N
pesos, cuanto será el beneficio que tendrá el cliente de acuerdo con la membresía que haya
adquirido?


*******************************************************************************/