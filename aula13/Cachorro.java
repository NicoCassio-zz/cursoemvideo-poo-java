package aula13;

public class Cachorro extends Lobo {
	//  Métodos públicos
	public void reagir(String frase) {System.out.println("");}
	public void reagir(int hora, int min) {System.out.println("");}
	public void reagir(boolean dono) {System.out.println("");}
	public void reagir(int idade, float peso) {System.out.println("");}
	//  Métodos sobrepostos
	@Override
	public void emitirSom() {System.out.println("Au! Au! Au!");}
}
