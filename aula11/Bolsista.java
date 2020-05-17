package aula11;

public class Bolsista extends Aluno {
	//  Variáveis
	private float bolsa;
	//  Métodos públicos
	public void renovarBolsa() {System.out.println("Renovando bolsa...");}
	//  Métodos sobrepostos
	@Override
	public void pagarMensalidade() {System.out.println("Pagando mensalidade mais barata...");}
	//  Métodos especiais
	public float getBolsa() {return this.bolsa;}
	public void setBolsa(float bolsa) {this.bolsa = bolsa;}
}
