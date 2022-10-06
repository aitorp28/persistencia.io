package com.txurdi.persistencia.pojo;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	

	private String nombre;
	private int edad;

	public Persona() {
		super();
	
		this.nombre="";
		this.edad=0;
	}

	public Persona( String nombre, int edad) {
		this();	
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
