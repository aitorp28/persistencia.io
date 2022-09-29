package com.txurdi.inicio.excepciones;

import java.util.Scanner;

/**
 * Es un ejemplo para practicar con el debugger y las excepciones Este metodo
 * main llamara a la clase Service que a su vez llama a la clase DAO En
 * cualquier momneto se puede producir una excepcion y debemos saber como se
 * propagan
 * 
 * @author Aitor Perez
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("Comenzamos");

		try (Scanner sc = new Scanner(System.in)) {
			int resultado = Service.ejecutar(sc);
			System.out.printf("El resultado es %s \n", resultado);
		} catch (Exception e) {
			System.out.printf("Exception %s \n", e.getMessage());
			e.printStackTrace();
		}
		// Service.ejecutar();
		System.out.println("Finalizamos");

	}

}
