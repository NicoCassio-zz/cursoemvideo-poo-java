package aula04;

public class Caneta {
	public String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	public Caneta(String modelo, String cor, float ponta) {
		this.tampar();
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return this.tampada;
	}
	public void tampar() {
		this.tampada = true;
	}
}
