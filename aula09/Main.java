package aula09;

public class Main {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

		p[0] = new Pessoa("Nicolas", 19, "M");
		p[1] = new Pessoa("Claudia", 22, "F");

		l[0] = new Livro("Livro 1", "Autor 1", 100, p[0]);
		l[1] = new Livro("Livro 2", "Autor 2", 200, p[1]);
		l[2] = new Livro("Livro 3", "Autor 1", 300, p[0]);

		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());
	}
}
