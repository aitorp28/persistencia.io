package com.txurdi.inicio.excepciones;

import java.util.Scanner;

public class Service {

	public static int ejecutar(Scanner sc) throws Exception {
		System.out.println("Ejecutando SERVICE");
		int n1 = Utilidades.pedirEdad(sc);

		int n2 = DAO.ejecutar(sc);

		return n1 + n2;
	}
}
