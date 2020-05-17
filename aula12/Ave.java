package aula12;

public class Ave extends Animal{
	//  Variáveis
	private String corPena;
	//  Métodos públicos
	public void fazerNinho() {System.out.println("Fazendo ninho...");}
	//  Métodos sobrepostos
	@Override
	public void locomover() {System.out.println("Voando...");}
	@Override
	public void alimentar() {System.out.println("Comendo minhocas...");}
	@Override
	public void emitirSom() {System.out.println("*Canto de pássaro*");}
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
	public String getCorPena() {return this.corPena;}
	public void setCorPena(String corPena) {this.corPena = corPena;}
}
