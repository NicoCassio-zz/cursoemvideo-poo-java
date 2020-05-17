package aula04;

public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Ponta: " + c1.getPonta());
		System.out.println("Tampada: " + c1.isTampada());
	}
}
