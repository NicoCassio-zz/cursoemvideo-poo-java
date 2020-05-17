package aula11;

public class Aluno extends Pessoa {
	//  Variáveis
	private int matricula;
	private String curso;
	//  Métodos públicos
	public void pagarMensalidade() {System.out.println("Pagando mensalidade...");}
	//  Métodos especias
	public int getMatricula() {return this.matricula;}
	public void setMatricula(int matr) {this.matricula = matricula;}
	public String getCurso() {return this.curso;}
	public void setCurso(String curso) {this.curso = curso;}
}
