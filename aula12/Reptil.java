package aula12;

public class Reptil extends Animal{
	//  Variáveis
	private String corEscama;
	//  Métodos sobrepostos
	@Override
	public void locomover() {System.out.println("Rastejando...");}
	@Override
	public void alimentar() {System.out.println("Comendo animais...");}
	@Override
	public void emitirSom() {System.out.println("*Som de réptil*");}
	//  Métodos especias
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
	public String getCorEscama() {return this.corEscama;}
	public void setCorEscama(String corEscama) {this.corEscama = corEscama;}
}
