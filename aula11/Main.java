package aula11;

public class Main {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Nicolas");
		v1.setIdade(19);
		v1.setSexo("M");
		System.out.println(v1.toString());

		Aluno a1 = new Aluno();
		a1.setNome("Nicolas 2");
		a1.setIdade(20);
		a1.setSexo("F");
		a1.setMatricula(1111);
		a1.setCurso("Eletrônica");
		a1.pagarMensalidade();

		Bolsista b1 = new Bolsista();
		b1.setNome("Nicolas 3");
		b1.setIdade(21);
		b1.setSexo("M");
		b1.setMatricula(2222);
		b1.setCurso("Engenharia");
		b1.setBolsa(1);
		b1.renovarBolsa();
		b1.pagarMensalidade();
	}
}
