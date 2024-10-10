//problema 8

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float porcentajeIVA=0.16f,IVA=0, msi=0, subtotal=0, total=0,descuento=0;
		System.out.println("Precio del celular:");
		int precio = scan.nextInt();
		System.out.println("cuantos telefonos desea comprar?");
		int cant = scan.nextInt();
		System.out.println("forma de pago: exhibicion o msi");
		String formaPago = scan.next();
		System.out.println("Con que va a pagar? cashi paypal o BBVA");
		String tipoPago = scan.next();
		
		if(formaPago.equalsIgnoreCase("exhibicion")){
		    if(tipoPago.equalsIgnoreCase("cashi")){
		        descuento = 0.90f;
		    }
		    else if(tipoPago.equalsIgnoreCase("paypal")){
		        descuento = 0.85f;
		    }
		    else if(tipoPago.equalsIgnoreCase("BBVA")){
		        descuento = 0.875f;
		    }
		} 
		if(formaPago.equalsIgnoreCase("msi")){
		    if(tipoPago.equalsIgnoreCase("BBVA")){
		        descuento = 0.95f;
		    }
		}
		subtotal = cant * precio;
		IVA = subtotal * porcentajeIVA;
		total = (subtotal + IVA) * descuento;
		
		System.out.println("Precio del celular: "+ precio);
		System.out.println("Cantidad de celulares a comprar: "+ cant);
		System.out.println("Forma de pago: "+ formaPago);
		System.out.println("tipo de pago: "+ tipoPago);
		System.out.printf("Cantidad del IVA %.2f%n", IVA);
		System.out.printf("Descuento: %.2f%n", descuento);
		System.out.printf("subtotal: %.2f%n", subtotal);
		System.out.printf("total: %.2f%n", total);
		
	}
}
/*
Oppo decide lanzar una promocion por lanzamiento de su nuevo dispositivo.
Dicha promocion consistia en promocionar un descuento del 10% al pagar con cashi;
un 15% con paypal y un 12.5% al pagar con BBVA. Siempre y cuando sea una sola exhibicion
si lo pagas a 6 meses sin interes solo recibiras el 5% de descuento con tarjetas BBVA.
cuanto vas a pagar por adquirir x telefonos? aplico descuento? cuanto?
*/