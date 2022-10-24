package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * He hecho pruebas con:
		 *  -8 y 7 y deberia de salir INTRODUZCA VALOLRES CORRECTOS
		 *  -8 y -9 y deberia de salir INTRODUZCA VALOLRES CORRECTOS
		 *  8 y -7 y deberia de salir INTRODUZCA VALOLRES CORRECTOS
		 *  780 y 8 deberia de salir: 1950,00
		 *  890 y 6 deberia de salir: 2225,00
		 *  780 y 6 deberia de salir: 1950,00
		 *  900 y 9 deberia de salir : Ya que la distancia es mayor a 800km y la estancia mayor a 7 dias, se le aplica un 30% de descuento.
El total de su viaje es: 1575.0
		 */ 
		
		// Declaramos las variables
				int distancia, estancia;		// se guardaran los km de distancia y los dias de estancia
				final double precio = 2.5;		// es el precio fijo del billete
				double descuento, total;		// se guardara en el caso de que se haga descuento y el precio total del billete

				// Abrimos el scanner
				Scanner sc = new Scanner(System.in);

				// Pedimos la distancia que recorrera y los dias que se hospedará
				System.out.print("Introduzca la distancia del trayecto: ");
				distancia = sc.nextInt();
				System.out.print("¿Cuantos dias se va a hospedar?: ");
				estancia = sc.nextInt();

				// se calcula  el precio total del viaje
				total = distancia * precio;
				// si la distancia es mayor a 800 y la estancia mayor a 7 dias
				if (distancia<0 || estancia<0) {
					System.out.println("INTRODUZCA VALORES CORRECTOS");
				}else if (distancia > 800 && estancia > 7) {
					descuento = total * 0.3;				 //calculamos un 30% de descuento respecto al total
					total -= descuento; 					//Le restamos el descuento al total
					System.out.println("Ya que la distancia es mayor a 800km y la estancia mayor a 7 dias, se le aplica un 30% de descuento.");
					System.out.println("El total de su viaje es: "+ total);
					//Mostramos que se ha descuentado un 30% y mostramos el total del viaje
				} else { //Si no, el precio total no cambiaria
					System.out.printf("El total del viaje es: %.2f", total ); //Lo mostramos
				}

				// Cerramos el escaner
				sc.close();
			}

		

	}

