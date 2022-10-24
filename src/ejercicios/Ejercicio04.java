package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	/*
	 * He hecho pruebas con:
	 * 10  Deberia salir: DIEZ
	 * 20  Deberia salir: VEINTE
	 * 89  Deberia salir: OCHENTA Y NUEVE
	 * 444 Deberia salir: Introduce un numero valido.
	 */
	
	
	public static void main(String[] args) {
		// bloque de variables
		int numero,decena,unidad;						// guardamos el numero introducuido por el cliente
		String cifra1="",cifra2="";						//guardamos las cifras por separado 
		// creamos el Scnner y solicitamos al usuario el numero
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca un numero del 0-99: " );
		numero=sc.nextInt();
		
		if (numero<10 && numero>=0) {			//	mostrara el resultado si el numero es de una sola cirfra
			System.out.print(cifra2);
			}
		switch (numero) {						// esta parte son  los casos especiales 
			case 10->
			System.out.print("DIEZ");				// cuando el numero sea 10 decolvera DIEZ
			case 11->
			System.out.print("ONCE");				// cuando el numero sea 11 decolvera ONCE		
			case 12->
			System.out.print("DOCE");				// cuando el numero sea 12 decolvera DOCE
			case 13->
			System.out.print("TRECE");				// cuando el numero sea 13 decolvera TRECE
			case 14->
			System.out.print("CATORCE");			// cuando el numero sea 14 decolvera CATORCE
			case 15->
			System.out.print("QUINCE");				// cuando el numero sea 15 decolvera  quince
			case 20->
			System.out.print("VEINTE");				// cuando el numero sea 20 decolvera veinte
			} 
		// comprobamos si el numero esta dentro de los valores
		if (numero<0 || numero>99) {
			System.out.print("Introduce un numero valido.");
			}
			// si el numero es de una sola cifra nos devolvera un numero concreto
			unidad=numero%10;						//con esto obtenemos la segunda cifra del num
			decena=numero/10;						// con esto obtenemos la primera cifra del numero
		switch (unidad) {	
			case 0->
			cifra2="CERO";							//si el numero es de una sola cifra y es un 0 devolvera CERO
			case 1->
			cifra2="UNO";							//si el numero es de una sola cifra y es un 1 devolvera UNO
			case 2->
			cifra2="DOS";							//si el numero es de una sola cifra y es un 2 devolvera DOS
			case 3->
			cifra2="TRES";							//si el numero es de una sola cifra y es un 3 devolvera TRES
			case 4->
			cifra2="CUATRO";						//si el numero es de una sola cifra y es un 4 devolvera CUATRO
			case 5->
			cifra2="CINCO";							//si el numero es de una sola cifra y es un 5 devolvera CINCO
			case 6->
			cifra2="SEIS";							//si el numero es de una sola cifra y es un 6 devolvera SEIS
			case 7->
			cifra2="SIETE";							//si el numero es de una sola cifra y es un 7 devolvera SIETE
			case 8->
			cifra2="OCHO";							//si el numero es de una sola cifra y es un 8 devolvera OCHO
			case 9->
			cifra2="NUEVE";							//si el numero es de una sola cifra y es un 9 devolvera NUEVE
			}
		switch (decena) {
			case 1->
			cifra1="DIECI";							//si la decena es 1 será DIECI
			case 2->
			cifra1="VEINTI";						//si la decena es 2 será VEINTE
			case 3->
			cifra1="TREINTA";						//si la decena es 3 será TREINTA
			case 4->
			cifra1="CUARENTA";						//si la decena es 4 será CUARENTA
			case 5->
			cifra1="CINCUENTA";						//si la decena es 5 será CINCUENTA
			case 6->
			cifra1="SESENTA";						//si la decena es 6 será SESENTA
			case 7->
			cifra1="SIETENTA";						//si la decena es 7 será SETENTA
			case 8->
			cifra1="OCHENTA";						//si la decena es 8 será OCHENTA
			case 9->
			cifra1="NOVENTA";						//si la decena es 9 será NOVENTA
			}
		
		
		if ( decena==1 && unidad>0 && numero>=16) {					// esto concatena la primera cifra con la segunda para formar el numero completo
				System.out.print(cifra1+cifra2);
			}else if ( decena==2 && unidad>0 && numero>=21) {
				System.out.print(cifra1+cifra2);
			}else if ( decena==3 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if ( decena==4 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if ( decena==5 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if ( decena==6 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if ( decena==7 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if ( decena==8 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if ( decena==9 && unidad>0 ) {
				System.out.print(cifra1+" Y "+cifra2);
			}else if (unidad== 0 ) {
				System.out.print(cifra1);
			}
		
		
	//cerramos el scanner
	sc.close();
	}

}