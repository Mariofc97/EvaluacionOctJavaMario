package es.cursojava.hipodromo;

public interface Participante { // implementa en Caballo y Jinete
	
	abstract String getIdentificador();
	double correr();
	void descansar();
	int getVictorias();
	void sumarVictoria();

}
