package es.cursojava.hipodromo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Caballo implements Participante,Imprimible, Avanzable {
	private String nombre;
	private double peso;
	private double velocidad;
	private double energia;
	private int experiencia;
	private int victorias;
	private Jinete jinete;
	private double metrosRecorridos;
	
	protected static final Logger log = LoggerFactory.getLogger(Caballo.class);
	
	public Caballo(String nombre, double peso, double velocidad, int experiencia, int victorias, Jinete jinete,
			double metrosRecorridos) {
		super();
		this.nombre = nombre;
		if (peso < 185) {
			peso = 185;
		}
		if (peso > 350) {
			peso = 350;
		}
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.victorias = victorias;
		this.jinete = jinete;
		this.metrosRecorridos = metrosRecorridos;
	}
	
	public Caballo(String nombre, double peso, double velocidad, int experiencia, Jinete jinete,
			double metrosRecorridos) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.jinete = jinete;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	public Jinete getJinete() {
		return jinete;
	}

	public void setJinete(Jinete jinete) {
		this.jinete = jinete;
	}

	public double getMetrosRecorridos() {
		return metrosRecorridos;
	}

	public void setMetrosRecorridos(double metrosRecorridos) {
		this.metrosRecorridos = metrosRecorridos;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	@Override
	public String imprimeDatos() {
		// TODO Auto-generated method stub
		return "Caballo [nombre=" + nombre + ", peso=" + peso + ", velocidad=" + velocidad + ", experiencia="
		+ experiencia + ", jinete=" + jinete + ", metrosRecorridos=" + metrosRecorridos + "]";
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public double correr() {
		return 0;
	}

	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sumarVictoria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularAvanceTurno() {
		double factorEnergia = 0.5 + (energia / 100.0) * 0.5;
		
		double baseAleatoria = 0.9 + Math.random() * 0.3;
		
		double factorPeso = peso * 0.025;
		
		double velocidadReal = baseAleatoria + velocidad + experiencia - factorPeso + experiencia ;   
		velocidadReal = Math.round(velocidadReal * 100.0)/100.0;
		
		double energiaAntes = energia;
		double desgaste = 8 + (int) Math.round(velocidadReal / 8.0);
		energia = energia - desgaste - factorPeso;
		if ( energia < 0) {
			energia = 0 ;
		}
		
		log.debug(nombre + " corre a velocidad " + velocidadReal + "km/h y su energia era " + energiaAntes + " y pasa a ser " + energia + " sobre 100");
		
		return velocidadReal;
	}

	@Override
	public void aplicarAvance() {
		// TODO Auto-generated method stub
		calcularAvanceTurno();
		
	}
	
	
	
	
	
	
	
	
	
	

}
