package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		/*
		 * He hecho pruebas con las siguientes cifras:
		 * -2       deberia salir: Introduce un numero valido. 
		 * 88889898 deberia salir: Introduce un numero valido.
		 * 0        deberia salir: El numero ES capicua
		 * 9999     deberia salir: El numero ES capicua
		 * 22       deberia salir: El numero ES capicua
		 * 333      deberia salir: El numero ES capicua
		 * 343      deberia salir: El numero ES capicua
		 * 2332     deberia salir: El numero ES capicua
		 * 2233     El numero NO es capicua
		 */
		// Declaramos las variables
				int numero,cifra1, cifra2, cifra3, resto;

				// Abrimos el escaner
				Scanner sc = new Scanner(System.in);

				// sloicitamos el numero al usuario
				System.out.print("Dime un numero entre 0 y 9999 y te dire si es capicua: ");
				numero = sc.nextInt();
				// antes de comparar los numeros, vamos a separar la ultima cifra del numero en una variable
				resto = numero % 10;
				// Comprobamos que este entre esos numeros
				if (numero < 0 || numero > 10000) {						//Si el numero es menor que 1 y mayor que 9999 no es valido
					System.out.println("Introduce un numero valido. ");
				} else if (numero >= 1 && numero < 10) {				//si el numero unicamente tiene una cifra es capicua
					System.out.println("El numero ES capicua");
				} else if (numero >= 10 && numero < 100) { 				//si el numero tiene 2 cifras
					cifra1 =  (numero / 10); 								//Dividimos entre 10 y sacamos la parte entera, mediante un casting, que es la primera cifra
					if (cifra1 == resto) { 								//Si las 2 cifras son iguales, es un numero capicua
						System.out.println("El numero ES capicua");
					} else {											 //Si no, no es capicua
						System.out.println("El numero NO es capicua");
					}
				} else if (numero >= 100 && numero < 1000) { 			//Si el numero tiene 3 cifras
					cifra1 =  (numero / 100); 								//Dividimos entre 100 y sacamos la parte entera, mediante un casting, que es la primera cifra
					if (cifra1 == resto) { 								//Si la primera y la tercera cifra son iguales es capicua
						System.out.println("El numero ES capicua");
					} else { 											//Si no, no es capicua
						System.out.println("El numero NO es capicua");
					}
				} else { 												//Si no se cumple ninguno de los casos anteriores tiene 4 cifras
					cifra1 =  (numero / 1000); 							//Dividimos entre 1000 y sacamos la parte entera, mediante un casting, que es la primera cifra
					cifra2 =  (cifra1 / 100) % 10;							//Dividimos entre 100 y sacamos la parte entera y esa parte entera le hacemos el modulo de 10 y nos dar?? la segunda cifra
					cifra3 =  (cifra1 / 10) % 10; 							//Dividimos entre 10 y sacamos la parte entera y esa parte entera le hacemos el modulo de 10 y nos dar?? la tercera cifra
					if (cifra1 == resto && cifra2 == cifra3) { 			//Si la primera y cuarta cifra y la sgunda y tercera cifra son iguales, es un numero capicua
						System.out.println("El numero ES capicua");
					} else { 											//si no, no es capicua
						System.out.println("El numero NO es capicua");
					}
				}

				//Cerramos el scanner
				sc.close();

			}

		

	}


