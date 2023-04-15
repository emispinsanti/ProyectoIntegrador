package Pronosticos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Ronda {
	// Constructor
	public Ronda(int n) {
		this.nro = n;
	}

	// Variables
	int nro;
	ArrayList<Partido> partidos = new ArrayList<>();

	// Getters and Setters
	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	// Metodos
	public ArrayList<Partido> leerArchivo(String archivo) {

		String equipo1, equipo2;
		int golesEquipo1, golesEquipo2;
		File file = new File(archivo);
		
		
		try (Scanner fileScn = new Scanner(file, StandardCharsets.UTF_8)) {

			while (fileScn.hasNextLine()) {

				String[] vector = (fileScn.nextLine()).split(",");
				equipo1 = vector[0];
				equipo2 = vector[1];
				golesEquipo1 = Integer.parseInt(vector[2]);
				golesEquipo2 = Integer.parseInt(vector[3]);

				Partido partido = new Partido();
				partido.nombreEq1 = equipo1;
				partido.nombreEq2 = equipo2;
				partido.golesEq1 = golesEquipo1;
				partido.golesEq2 = golesEquipo2;
				
				partidos.add(partido);

			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		
		return partidos;
	}
	
	//Falto este metodo que hay que sumar puntos por cada acierto
	// tengo que esperar este terminada la clase Pronostico por que 
	//Depende de ella
	public int puntos() {
		return 0;
	}

}
