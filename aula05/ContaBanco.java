package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	public void status() {
		System.out.println("Número da Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo == "CC") {
			this.setSaldo(50);
		} else if(tipo == "CP") {
			this.setSaldo(150);
		}
	}
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			this.setStatus(false);
		}
	}
	public void depositar(float deposito) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + deposito);
		} else {
			System.out.println("Impossível depositar");
		}
	}
	public void sacar(float saque) {
		if(this.getStatus()) {
			if(this.getSaldo() > saque) {
				this.setSaldo(this.getSaldo() - saque);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível sacar");
		}
	}
	public void pagarMensal() {
		float mensal = 0;
		if(this.getTipo().equals("CC")) {
		
		} else if(this.getTipo().equals("CP")) {
			mensal = 20;
		}
		if(this.getStatus()) {
			if(this.getSaldo() > mensal) {
				this.setSaldo(this.getSaldo() - mensal);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossível pagar");
		}
	}
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
