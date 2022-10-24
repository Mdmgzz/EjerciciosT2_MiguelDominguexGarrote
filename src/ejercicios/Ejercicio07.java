package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

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
		
		//sumamos 1 segundo
		segundos=segundos+1;
		
		//comparamos si los los valores estan permitidos
		
		//calculamos el valor de cada variable despues de sumarle 1 segundo
		if (segundos>=60) {						// si los segundos +1 = 60 ponemos los segundos a 0
			segundos=0;								// y sumamos 1 minuto
			minutos=minutos+1;
			if(minutos>=60) {						// si tras sumar el minuto este es =60 se suma 1 hora y se pone los minutos a 0
				minutos=0;
				horas=horas+1;
		}
		}
		
		if (segundos>=60) {
			System.out.println("ERROR");			// si los valores introducidos estan por encima de 60 ERROR
		}else if (minutos>=60) {
			System.out.println("ERROR");
		}
		
		else if (minutos<60 && segundos<60) {
				System.out.println("Las horas tras un segundo es: "+horas);
				System.out.println("Los minutos tras un segundo es: "+minutos);		// se muestra el resultado
				System.out.println("Los segundos tras un segundo es: "+segundos);
		}
		
		//cerramos el Scanner
		sc.close();
	}

}
