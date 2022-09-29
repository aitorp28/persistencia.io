package com.txurdi.inicio;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es tu nombre");
		String nombre = sc.nextLine();
		String apellido = sc.nextLine();
		System.out.printf("Hola %s %s. hasta luego" , nombre, apellido);
		
		sc.close();

	}

}
