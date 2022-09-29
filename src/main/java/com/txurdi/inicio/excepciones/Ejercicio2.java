package com.txurdi.inicio.excepciones;

import java.util.Scanner;

/**
 * Ejercicio basico para pedir por pantalla, sin capturar la excepcion que pueda
 * lanzar y solucitamos de nuevo la edad
 * 
 * La edad debe estar comprendida 0 y 120 años
 * 
 * @author Aitor Perez
 *
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
		try {
			
			System.out.println("Dime tu edad");
			String sEdad = sc.nextLine();
			int edad = Integer.parseInt(sEdad);
			
			if( edad > 0 && edad <= 120) {
				System.out.printf("Tu edad es %s \n", edad);
				flag = false;
			}else {
				System.out.println("No es correcta la edad rango de edad 0 Y 120");
				
			}
		
			
			
		}catch(Exception NumberFormatException) {
			System.out.println("No es correcta la edad rango de edad 0 Y 120");
			
			
			
		}
		}while(flag);
		
		
		System.out.println("Agur");
		flag = false;
		sc.close(); // Es un recurso Autoclosable y se cierra solo al declararlo en el TRY
		
		
			
	

		}
	}

