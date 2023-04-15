package Pronosticos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Equipo {
	// Constructor
	public Equipo(String name, String desc) {
		this.nombre = name;
		this.descripcion = desc;
	}

	String nombre, descripcion;

	// Getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
