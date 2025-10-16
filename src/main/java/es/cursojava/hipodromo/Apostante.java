package es.cursojava.hipodromo;

public class Apostante extends Persona implements Imprimible {

	private double saldo;

	public Apostante(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public Apostante(String nombre, double saldo) {
		super(nombre);
		this.saldo = saldo;
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String imprimeDatos() {
		// TODO Auto-generated method stub
		return "Apostante [nombre = " + nombre + "saldo=" + saldo + "]";
	}

}
