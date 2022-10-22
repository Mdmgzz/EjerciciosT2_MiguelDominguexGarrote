package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// bloque de variables
		int numero; 					// se reguistra el numero que introduzca el cliente
		
		//abrimos el scanner y solicitamos al usuario un numero
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		numero=sc.nextInt();
		
		/* 
		 * una vez guardemos el numero en la variable vamos a utilizar un operador ternario
		 * para devolver el valor absoluto del numero introducido
		 */
		numero = numero<0 ? -(numero) : numero; 	// si el valor de numero es menor que 0 devuelve el numero introducido en positivo y si es mayor que 0 lo devuelve igual

		// le mostramos el resultado al cliente
		System.out.print("El valor absoluto del numero introducido es: "+numero);
		
		
		// cerramos el scanner
		sc.close();
	}

}
