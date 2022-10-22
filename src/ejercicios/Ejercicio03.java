package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// bloque de variables
		double kgtotales,racion;					//se guardan la cantidad de comida que come cada animal
		double nºanimales,cantidadcomida;	// se guarda el nº de animales que hay y la cantidad de comida comprada
		
		// creamos el Scanner y solicitamos al usuario los valores
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca la cantidad de comida comprada: ");
		cantidadcomida=sc.nextInt();
		System.out.print("Introduzca la cantidad de animales que hay: ");
		nºanimales=sc.nextInt();
		System.out.print("Introduzca los kg que comen en total: ");
		kgtotales=sc.nextInt();
		
		//comprobamos si hay comida suficiente o no
		if (cantidadcomida>=kgtotales/nºanimales) {
			racion=kgtotales/nºanimales;
			System.out.print("Dipone de suficiente comida y la racion de cada animal será de: "+ racion +"Kg");
		}else {
			racion=cantidadcomida/nºanimales;
			System.out.print("No Dipone de suficiente comida y la racion de cada animal será de: "+ racion +"Kg");
		}
		//cerramos el scanner
		sc.close();
	}
}
