package Pronosticos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Ronda ronda = new Ronda(1);	
		
		String archRonda1 = "C:\\Users\\Emi\\git\\proyectoIntegrador\\src\\Pronosticos\\archivos\\resultados.csv";
		
		ArrayList<Partido> partidos1 = ronda.leerArchivo(archRonda1);
		
		Pronostico pronosticos = new Pronostico ();
		
		String archPronostico1 = "C:\\Users\\Emi\\git\\proyectoIntegrador\\src\\Pronosticos\\archivos\\pronostico.csv";

		ArrayList<Partido> pronosticos1 = pronosticos.leerArchivo_usuario(archPronostico1);
		
		boolean acierto = false;
		
		System.out.println("Resultados Ronda " + ronda.nro + ": ");
		
			
		for (int i=0; i< partidos1.size(); i++) {
			System.out.println("\n" + partidos1.get(i).getEq1() +  " " + partidos1.get(i).getGolesEq1() + " - " + partidos1.get(i).getEq2() + " " + partidos1.get(i).getGolesEq2());
			System.out.println("El usuario pronostico que " + pronosticos1.get(i).Eq1.nombre + " seria " + pronosticos1.get(i).resultado);
			System.out.println("El equipo salio " + partidos1.get(i).resultado(pronosticos1.get(i).Eq1));
			
			if (pronosticos1.get(i).resultado == partidos1.get(i).resultado(pronosticos1.get(i).Eq1)) {
				acierto = true;
			} else {
				acierto = false;
			}
			
			System.out.println("Puntaje: " + pronosticos.puntos(acierto));
		}
		
		System.out.println("\n*******************");
		System.out.println("Puntaje total: " + pronosticos.puntos_usuario);
	}

}
