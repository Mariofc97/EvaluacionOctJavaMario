package es.cursojava.hipodromo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jinete extends Persona implements Imprimible{
	
	
	private int aniosExperiencia;
	private Caballo caballo;

	protected static final Logger log = LoggerFactory.getLogger(Jinete.class);

	public Jinete(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Jinete(String nombre, int edad, int aniosExperiencia, Caballo caballo) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
		this.caballo = caballo;
	}
	
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public void setCaballo(Caballo caballo) {
		this.caballo = caballo;
	}

	public Caballo getCaballo() {
		return caballo;
	}

	@Override
	public String imprimeDatos() {
		// TODO Auto-generated method stub
		return "Jinete [nombre=" + nombre + ", aniosExperiencia=" + aniosExperiencia + ", caballo=" + caballo + "]";
	}
	
	public void motivarCaballo() {
		double energiaAntes = caballo.getEnergia();
		double energiaAhora = energiaAntes + (2 + aniosExperiencia / 3);
		if (energiaAhora > 100) {
			energiaAhora = 100;
		}
		energiaAhora = caballo.getEnergia();
		log.info(nombre + " motiva a " + caballo.getNombre() + " su energia era de " + energiaAntes + " y ahora es de " + energiaAhora + " sobre 100");
		
	}

	@Override
	public double correr() {
		double bonusExperiencia = 1.0 + (aniosExperiencia / 100.0);
		double velocidad = caballo.correr() * bonusExperiencia;
		velocidad = Math.round(velocidad * 100.0) / 100.0;
		log.debug(nombre + " corre con " + caballo.getNombre() + " a velocidad " + velocidad);
		return velocidad;
	}
	
}
