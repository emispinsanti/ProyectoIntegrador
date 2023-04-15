package Pronosticos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Partido {
	// Constructor
	public Partido() {
	}

	// Variables
	String nombreEq1, nombreEq2;
	int golesEq1, golesEq2;

	// Getters and setters
	public String getNombreEq1() {
		return nombreEq1;
	}

	public void setNombreEq1(String nombreEq1) {
		this.nombreEq1 = nombreEq1;
	}

	public String getNombreEq2() {
		return nombreEq2;
	}

	public void setNombreEq2(String nombreEq2) {
		this.nombreEq2 = nombreEq2;
	}

	public int getGolesEq1() {
		return golesEq1;
	}

	public void setGolesEq1(int golesEq1) {
		this.golesEq1 = golesEq1;
	}

	public int getGolesEq2() {
		return golesEq2;
	}

	public void setGolesEq2(int golesEq2) {
		this.golesEq2 = golesEq2;
	}

	// Metodo resultado que devuelve un enum
	public ResultadoEnum resuldato(Equipo eq) {
		
		// solo esta dando una condicion de GANADOR (estaba trabajando en esto antes de terminar)
		//deveria comparar resultadod e partidos con Pronostico de persona y dar resultado segun comparacion
		//Ej: apuesta por boca gana a river --> resultado toma el equipo boca como parametro
		// y si sus goles son mayores a los del contrincante deberia devolver ganador si son iguales EMPATE y 
		// si son menores PERDEDOR
		
		ResultadoEnum res = ResultadoEnum.GANADOR;
		return res;
		
	}

}
