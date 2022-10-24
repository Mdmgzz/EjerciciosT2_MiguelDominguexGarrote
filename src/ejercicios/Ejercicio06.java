package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * he probado haciendo la suma mal y haciendo la suma bien
	 * si la haces bien saldrá: CORRECTO
	 * si la hacer mal saldrá: INCORRECTO
	 */

	public static void main(String[] args) {
		//bloque de variables 
		int num1,num2;			// aqui se guardaran los numero aleatrorios de la suma 
		int resultado;			// se guarda el resukltado de la suma 
		
		// creamos el scanner
		Scanner sc=new Scanner(System.in);
		
		// declaramo los numeros aleatorios
		num1 = (int) (Math.random()*99+1);								// con esto se crea un numero aleatorio entre 1 y 99
		    System.out.println("El primer sumando es: " + num1);		// muestra el primer sumando
		num2 = (int) (Math.random()*99+1);
		    System.out.println("El segundo sumando es: " + num2);		//muestra el segundo sumando
		    
		// preguntamos el usuario por el resultado de la suma 
		System.out.println("¿Cual es el resultado de la suma?: ");		//preguntamos y guardamos en la variable resultado
		resultado = sc.nextInt();
		
		// Comprobamos si el resultado es correcto
		if (resultado==num1+num2) {
			System.out.println("CORRECTO");								// si el resultado es igual a la suma de num1 y num2 correcto
		}else {															// si no lo es entonces incorrecto
			System.out.println("INCORRECTO");
		}
	sc.close();
	
	}

}
