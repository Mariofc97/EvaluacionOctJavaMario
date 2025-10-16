package es.cursojava.hipodromo;

import java.util.List;

public class Carrera {
	
	private String nombre;
	private double distanciaObjetivo;
	private List<Participante> participantes;
	private Participante ganador;
	List<Apuesta> apuestas;
	
	public Carrera(String nombre, double distanciaObjetivo, List<Participante> participantes, Participante ganador,
			List<Apuesta> apuestas) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.participantes = participantes;
		this.ganador = ganador;
		this.apuestas = apuestas;
	}
	
	public Carrera(String nombre, double distanciaObjetivo, List<Participante> participantes,
			List<Apuesta> apuestas) {
		super();
		this.nombre = nombre;
		this.distanciaObjetivo = distanciaObjetivo;
		this.participantes = participantes;
		this.apuestas = apuestas;
	}
	
	
	

}
