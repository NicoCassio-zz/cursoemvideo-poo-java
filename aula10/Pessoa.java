package aula10;

public class Pessoa {
	//  Variáveis
	private String nome;
	private int idade;
	private String sexo;
	//  Métodos públicos
	public void fazerAniver() {this.setIdade(this.getIdade() + 1);}
	//  Metódos sobrepostos
	@Override
	public String toString() {return "Pessoa{nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + "}";}
	//  Métodos especiais
	public String getNome() {return this.nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getIdade() {return this.idade;}
	public void setIdade(int idade) {this.idade = idade;}
	public String getSexo() {return this.sexo;}
	public void setSexo(String sexo) {this.sexo = sexo;}
}
