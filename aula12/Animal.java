package aula12;

public abstract class Animal {
	//  Variáveis
	protected float peso;
	protected int idade;
	protected int membros;
	//  Métodos abstratos
	protected abstract void locomover();
	protected abstract void alimentar();
	protected abstract void emitirSom();
	//  Métodos especiais
	protected abstract float getPeso();
	protected abstract void setPeso(float peso);
	protected abstract int getIdade();
	protected abstract void setIdade(int idade);
	protected abstract int getMembros();
	protected abstract void setMembros(int membros);
}
