package aula08;

import java.util.Random;

public class Luta {
	//  Variáveis
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	//  Métodos públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) {
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		if(this.getAprovada()) {
			this.getDesafiado().apresentar();
			this.getDesafiante().apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
				case 0:
					System.out.println("Empatou!");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1:
					System.out.println(this.getDesafiado().getNome());
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
				case 2:
					System.out.println(this.getDesafiante().getNome());
					this.getDesafiado().perderLuta();
					this.getDesafiante().ganharLuta();
					break;
			}
		} else {System.out.println("Luta não pode acontecer");}
	}
	//  Métodos especiais
	public Luta() {}
	public Lutador getDesafiado() {return this.desafiado;}
	public void setDesafiado(Lutador desafiado) {this.desafiado = desafiado;}
	public Lutador getDesafiante() {return this.desafiante;}
	public void setDesafiante(Lutador desafiante) {this.desafiante = desafiante;}
	public int getRounds() {return this.rounds;}
	public void setRounds(int rounds) {this.rounds = rounds;}
	public boolean getAprovada() {return this.aprovada;}
	public void setAprovada(boolean aprovada) {this.aprovada = aprovada;}
}
