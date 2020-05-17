package aula03;

public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.escrever();
		c1.rabiscar();
		c1.pintar();
	}
}
