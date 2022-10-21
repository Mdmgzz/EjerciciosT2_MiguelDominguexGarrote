package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// bloque de variables
		int numero,decena,unidad;						// guardamos el numero introducuido por el cliente
		String cifra1="",cifra2="";						//guardamos las cifras por separado 
		// creamos el Scnner y solicitamos al usuario el numero
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca un numero del 0-99: " );
		numero=sc.nextInt();
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
		cifra1="DIECI";							//si el numero es de una sola cifra y es un 1 devolvera UNO
		case 2->
		cifra1="VEINTI";						//si el numero es de una sola cifra y es un 2 devolvera DOS
		case 3->
		cifra1="TREINTA";						//si el numero es de una sola cifra y es un 3 devolvera TRES
		case 4->
		cifra1="CUARENTA";						//si el numero es de una sola cifra y es un 4 devolvera CUATRO
		case 5->
		cifra1="CINCUENTA";						//si el numero es de una sola cifra y es un 5 devolvera CINCO
		case 6->
		cifra1="SESENTA";						//si el numero es de una sola cifra y es un 6 devolvera SEIS
		case 7->
		cifra1="SIETENTA";						//si el numero es de una sola cifra y es un 7 devolvera SIETE
		case 8->
		cifra1="OCHENTA";						//si el numero es de una sola cifra y es un 8 devolvera OCHO
		case 9->
		cifra1="NOVENTA";						//si el numero es de una sola cifra y es un 9 devolvera NUEVE
		}
		
		if (numero<10 && numero>=0) {			//	mostrara el resultado si el numero es de una sola cirfra
		System.out.print(cifra2);
		}
		switch (numero) {
		case 10->
		System.out.print("DIEZ");
		case 11->
		System.out.print("ONCE");
		case 12->
		System.out.print("DOCE");
		case 13->
		System.out.print("TRECE");
		case 14->
		System.out.print("CATORCE");
		case 15->
		System.out.print("QUINCE");
		case 20->
		System.out.print("VEINTE");
		} 
		if ( decena==1 && unidad>0 ) {
			System.out.print(cifra1+cifra2);
		}else if ( decena==2 && unidad>0 ) {
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