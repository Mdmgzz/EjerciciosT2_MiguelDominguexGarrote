package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// bloque de variables
		int num, resto;			// en la variable num se guardara el numero de dni y en el resto se guarda el ult numero
		char letra = ' ';		// aqui se guardara la letra que de como resultado y para ello hay que definir la variable antes para  que no de error

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero del DNI
		System.out.print("Introduzca su dni sin la letra");
		num = sc.nextInt();

		//comprobamos que el numero tenga 8 cifras
		if (num > 10000000 || num > 100000000) {
			System.out.println("El numero no es valido");
		} else {
			// Hacemos el modulo del numero entre 23 pa saber el resto y asi calculara la letra
			resto = num % 23;

			//Dependiendo del valor del resto la letra es uno u otra
			switch (resto) {
			case 0:
				letra = 'T';
				break;
			case 1:
				letra = 'R';
				break;
			case 2:
				letra = 'W';
				break;
			case 3:
				letra = 'A';
				break;
			case 4:
				letra = 'G';
				break;
			case 5:
				letra = 'M';
				break;
			case 6:
				letra = 'Y';
				break;
			case 7:
				letra = 'F';
				break;
			case 8:
				letra = 'P';
				break;
			case 9:
				letra = 'D';
				break;
			case 10:
				letra = 'X';
				break;
			case 11:
				letra = 'B';
				break;
			case 12:
				letra = 'N';
				break;
			case 13:
				letra = 'J';
				break;
			case 14:
				letra = 'Z';
				break;
			case 15:
				letra = 'S';
				break;
			case 16:
				letra = 'Q';
				break;
			case 17:
				letra = 'V';
				break;
			case 18:
				letra = 'H';
				break;
			case 19:
				letra = 'L';
				break;
			case 20:
				letra = 'C';
				break;
			case 21:
				letra = 'K';
				break;
			case 22:
				letra = 'E';
				break;

			}

			// mostramos el DNI con su letra
			System.out.print("El DNI completo es:"+ num + letra);
		}

		// Cerramos el escaner
		sc.close();

	}

	}
