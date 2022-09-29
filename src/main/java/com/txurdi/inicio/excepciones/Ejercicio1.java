package com.txurdi.inicio.excepciones;

import java.util.Scanner;

/**
 * Ejercicio basico para pedir por pantalla, sin capturar la excepcion que pueda
 * lanzar
 * 
 * @author Aitor Perez
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		String sEdad = sc.nextLine();
		int edad = Integer.parseInt(sEdad);
		
		System.out.printf("Tu edad es %s \n", edad);
		System.out.println("Agur");
		
		sc.close();
	}
}
