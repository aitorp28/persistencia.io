package com.txurdi.inicio.excepciones;

import java.util.Scanner;

public class Utilidades {

	/**
	 * Solicita edad por pantalla
	 * 
	 * @param sc
	 * @return edad en formato int
	 * @throws Exception Exception si no es un numero entero
	 */
	public static int pedirEdad(Scanner sc) throws Exception {
		int edad = -1;
		try {
			System.out.println("Dime tu edad");
			String sEdad = sc.nextLine();
			edad = Integer.parseInt(sEdad);
			// sc.close();
		} catch (Exception e) {
			throw new Exception("Lanzamos exception, error:" + e.getMessage());
		}

		return edad;
	}
}
