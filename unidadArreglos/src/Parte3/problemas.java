package Parte3;
import java.util.*;
import parte1.Arreglos; //añadidos para perder tiempo creando los mismos metodos
import Parte2.Matrices;
public class problemas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion=0, n1=0;
		
		do {
			System.out.println("Elige un problema 2, 3, 4, 5, 6");
			opcion = scan.nextInt();
			switch(opcion) {
			case 2:
				System.out.println("Elige el tamano de tu arreglo");
				n1 = scan.nextInt();
				int[] array = Arreglos.crearArregloInt(n1);
				Arreglos.imprimirArregloInt(array);
				System.out.println();
				System.out.println("arreglo corregido");
				int[] resultado = problemas.problema2(array, n1);
				Arreglos.imprimirArregloInt(resultado);
				System.out.println();
			break;
			case 3:
				int[][] matriz = Matrices.crearMatrizInt(4, 4);
				Matrices.imprimirMatriz(matriz, "Matriz ");
				problemas.problema3(matriz);
			break;
			case 4:

			break;
			case 5:
				problemas.automoviles();
				
			break;
			case 6:
				
			break;
			}
			
		}while(opcion >= 2 && opcion <= 4);
		
	}
	
	public static int[] problema2(int[] array, int tamano) {
		int temp;
		for(int i=0; i<tamano -1; i++) {
			for(int j=0; j<tamano - 1; j++) {
				if(array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j +1];
					array[j +1] = temp;
				}
			}
		}
		return array;
	}
	
	/* Notas para mi
	 * si para resolver este problema necesitamos comparar un elemento de la matriz con todos los demas
	 * si fuera arreglo fuera mas facil
	 * OK
	 * dejare el problema por mi propia salud mental
	 * hice un cochinero pero con eso ya queda
	 * para poder resolver el problema primero guarde el valor de la primera posicion y sin miedo al exito puse otros 2 for dentro de los 2 for ya hechos
	 * pero como de todos modos no estoy utilizando los indices de los primeros 2 no pasa nada, asi que los primeros 2 for se utilizan para
	 * guardar la posicion en la variable temporal, despues dentro de los 2 for posteriores hago la comparacion muy simple y incremento las veces que se
	 * repite ese numero. despues dentro del ciclo j hago la comparacion para saber si las veces que se repitio el numero es mas que el maximo
	 * despues nomas imprimo la moda y las posiciones
	 */
	public static void problema3(int[][] matriz) {
		int temp = 0, veces=0, moda = 0, max = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				temp = matriz[i][j];
				veces = 0;
				for(int k=0; k<matriz.length; k++) {
					for(int m=0; m<matriz[k].length; m++) {
						if(matriz[k][m] == temp) {
							veces++;
						}
					}
				}
				if(veces > max) {
					moda = temp;
					max = veces;
				}
			}
		}
		System.out.println("Moda "+ moda);
		System.out.println();
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				if(matriz[i][j] == moda) {
					System.out.print("[" + i + "]" + "[" + j + "]");
				}
			}
		}
	}
	
	public static void automoviles() {
		Automovil[] auto = new Automovil[8];
		auto[0] = crearCarro("Toyota", "Corolla", "Rojo", "Estandar", "Automatica", 2010);
        auto[1] = crearCarro("Ford", "Focus", "Azul", "Deportiva", "Manual", 2021);
        auto[2] = crearCarro("Chevrolet", "Spark", "Verde", "Estandar", "Automatica", 2012);
        auto[3] = crearCarro("Nissan", "Altima", "Negro", "Deportiva", "Automatica", 2003);
        auto[4] = crearCarro("Hyundai", "Tucson", "Beige", "SUV", "Automatica", 2001);
        auto[5] = crearCarro("Honda", "Civic", "Lila", "Estandar", "Manual", 2001);
        auto[6] = crearCarro("Mazda", "CX-5", "Rojo", "SUV", "Automatica", 2012);
        auto[7] = crearCarro("Volkswagen", "Jetta", "Azul", "Estandar", "Automatica", 2025);
        System.out.println("Vehiculos");
        for(int i=0; i<auto.length; i++) {
        	System.out.println(auto[i]);
        }
        
		for(int i=0; i<auto.length; i++) {
			if(auto[i].modelo.contains("a")){
				auto[i].modelo = "Deluxe";
			}
		}
		System.out.println("Carro modificado");
		for(int i=0; i<auto.length; i++) {
            if (auto[i].modelo.equals("Deluxe")) {
                System.out.println(auto[i]);
            }
        }
	}
	
	public static Automovil crearCarro(String marca, String modelo, String color, String version, String transmision, int anoEdicion) {
		Automovil auto = new Automovil();
		auto.marca = marca;
		auto.modelo = modelo;
		auto.color = color;
		auto.version = version;
		auto.transmision = transmision;
		auto.anoEdicion = anoEdicion;
		return auto;
	}

}
