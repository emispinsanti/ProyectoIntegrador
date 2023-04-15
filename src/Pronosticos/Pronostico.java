package Pronosticos;

public class Pronostico {

	Partido partidoObj = new Partido();

	Equipo equipo = new Equipo("", "");

	public Pronostico() {

	}

	public ResultadoEnum resuldato() {

		ResultadoEnum res = ResultadoEnum.GANADOR;
		return res;

	}
	
	public int puntos() {
		return 0;
	}

}
