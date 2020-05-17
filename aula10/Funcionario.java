package aula10;

public class Funcionario extends Pessoa {
	//  Variáveis
	private String setor;
	private boolean trabalhando;
	//  Métodos públicos
	public void mudarTrabalho() {this.setTrabalhando(!this.isTrabalhando());}
	//  Métodos especiais
	public String getSetor() {return this.setor;}
	public void setSetor(String setor) {this.setor = setor;}
	public boolean isTrabalhando() {return this.trabalhando;}
	public void setTrabalhando(boolean trabalhando) {this.trabalhando = trabalhando;}
}
