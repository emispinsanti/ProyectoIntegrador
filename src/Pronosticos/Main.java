package Pronosticos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Ronda ronda = new Ronda(1);	
		
		
		
		
		System.out.println("Leyendo archivo de resultados de la ronda "+ ronda.nro);
		
		System.out.println("\n*******************\n");
		
		String archRonda1 = "C:\\\\Users\\\\Matias\\\\eclipse-workspace\\\\Integrador\\\\PronosticosDeportivos\\\\src\\\\Pronosticos\\\\archivos\\\\ronda1.txt";
		
		ArrayList<Partido> partidos = ronda.leerArchivo(archRonda1);
		
		System.out.println("Resuldados ronda " + ronda.nro + ": ");
		
		for (Partido partido : partidos) {
			System.out.println("\n" + partido.golesEq1 +  " " + partido.nombreEq1 + " - " + partido.nombreEq2 + " " + partido.golesEq2);
			
			//PROBANDO SI ANDABA LA FUNCION ResultadoEnum
			//Equipo equipo = new Equipo(partido.nombreEq1,"Xeneixe");
			//System.out.println(partido.resuldato(equipo));
		}
		
		
		String archPronostico1 = "C:\\\\Users\\\\Matias\\\\eclipse-workspace\\\\PronosticosDeportivos\\\\src\\\\Pronosticos\\\\archivos\\\\pronosticoUser1.txt";

		
	
	}

}
