package com.txurdi.inicio.excepciones;

import java.util.Scanner;

public class DAO {
	public static int ejecutar(Scanner sc) throws Exception {
		System.out.println("Ejecutando DAO");
		return Utilidades.pedirEdad(sc);
	}
}
