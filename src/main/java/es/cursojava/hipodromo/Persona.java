package es.cursojava.hipodromo;

public class Persona implements Participante {

	protected String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double correr() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void descansar() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getVictorias() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sumarVictoria() {
		// TODO Auto-generated method stub

	}

}
