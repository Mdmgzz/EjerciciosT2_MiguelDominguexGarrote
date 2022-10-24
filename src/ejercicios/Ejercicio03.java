package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	
	/*
	 * He hecho pruebas con:
	 * 20,4,20 Deberia salir: Dipone de suficiente comida y la racion de cada animal será de: 5.0Kg
	 * 5,4,10  Deberia salir; No Dipone de suficiente comida y la racion de cada animal será de: 0.5Kg
	 */

	public static void main(String[] args) {
		// bloque de variables
		double kgtotales,racion;					//se guardan la cantidad de comida que come cada animal
		double nºanimales,cantidadcomida;	// se guarda el nº de animales que hay y la cantidad de comida comprada
		
		// creamos el Scanner y solicitamos al usuario los valores
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca la cantidad de comida comprada: ");		//preguntamos por la cantidad de comida comprada 
		cantidadcomida=sc.nextInt();
		System.out.print("Introduzca la cantidad de animales que hay: ");		// preguntamos por la cantidad de animales que hay
		nºanimales=sc.nextInt();
		System.out.print("Introduzca los kg que comen en total: ");				// preguntamos por los kg totales que comen
		kgtotales=sc.nextInt();
		
		//comprobamos si hay comida suficiente o no
		if (cantidadcomida>=kgtotales/nºanimales) {								// si la cantidad de comida es mayor o igual que los kg entre los animales
			racion=kgtotales/nºanimales;										// da el valor de lo que come cada animal a la variable racion
			System.out.print("Dipone de suficiente comida y la racion de cada animal será de: "+ racion +"Kg");		// lo muestra
		}else {		
			racion=cantidadcomida/nºanimales;									// si no es mayor entonces calcula la racion de comida que le toca a cada animal
			System.out.print("No Dipone de suficiente comida y la racion de cada animal será de: "+ racion +"Kg");
		}
		//cerramos el scanner
		sc.close();
	}
}
