package aula10;

public class Professor extends Pessoa {
	//  Variáveis
	private String especialidade;
	private float salario;
	//  Métodos públicos
	public void receberAum(float aum) {this.setSalario(this.getSalario() + aum);}
	//  Métodos especias
	public String getEspecialidade() {return this.especialidade;}
	public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}
	public float getSalario() {return this.salario;}
	public void setSalario(float salario) {this.salario = salario;}
}
