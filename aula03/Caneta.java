package aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada: " + this.tampada);
	}
	public void escrever() {
		if(this.tampada) {
			System.out.println("ERRO");
		} else {
			System.out.println("Escrevendo...");
		}
	}
	public void rabiscar() {
		if(this.tampada) {
			System.out.println("ERRO");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	public void pintar() {
		if(this.tampada) {
			System.out.println("ERRO");
		} else {
			System.out.println("Pintando...");
		}
	}
	private void tampar() {
		this.tampada = true;
	}
	private void destampar() {
		this.tampada = false;
	}
}
