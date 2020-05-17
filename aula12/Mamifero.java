package aula12;

public class Mamifero extends Animal {
	//  Variáveis
	private String corPelo;
	//  Métodos sobrepostos
	@Override
	public void locomover() {System.out.println("Caminhando...");}
	@Override
	public void alimentar() {System.out.println("Comendo carne...");}
	@Override
	public void emitirSom() {System.out.println("*Rugido*");}
	//  Métodos especiais
	@Override
	public float getPeso() {return this.peso;}
	@Override
	public void setPeso(float peso) {this.peso = peso;}
	@Override
	public int getIdade() {return this.idade;}
	@Override
	public void setIdade(int idade) {this.idade = idade;}
	@Override
	public int getMembros() {return this.membros;}
	@Override
	public void setMembros(int membros ) {this.membros = membros;}
	public String getCorPelo() {return this.corPelo;}
	public void setCorPelo() {this.corPelo = corPelo;}
}
