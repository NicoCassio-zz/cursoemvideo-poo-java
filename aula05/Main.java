package aula05;

public class Main {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Nicolas");
		p1.abrirConta("CC");

		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Claudia");
		p2.abrirConta("CP");

		p1.depositar(100);
		p2.depositar(500);

		p1.status();
		p2.status();
	}
}
