package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//bloque de variable
		int horas,minutos,segundos;			// creamos la variable en la que guardamos los segundos,minutos,horas
		
		// creamos el Scanner 
		Scanner sc=new Scanner (System.in);			
		
		//solicitamos la hora, minuto y segundo 
		System.out.print("Introduzca un numero horas: ");
		horas=sc.nextInt();										// se guardan el numero de horas
		System.out.print("Introduzca un numero minutos: ");
		minutos=sc.nextInt();									// se guardan el numero de minutos
		System.out.print("Introduzca un numero segundos: ");
		segundos=sc.nextInt();									// se guardan el numero de segundos
		
		//calculamos el valor de cada variable dsp de sumarle 1 segundo
		if (segundos+1==60) {
			segundos=0;
			minutos=minutos+1;
			if(minutos==60) {
				minutos=0;
				horas=horas+1;
		}
			}else {
				segundos=segundos+1;
			}
		System.out.println("Las horas tras un segundo es: "+horas);
		System.out.println("Los minutos tras un segundo es: "+minutos);
		System.out.println("Los segundos tras un segundo es: "+segundos);
		
		//cerramos el Scanner
		sc.close();
	}

}
