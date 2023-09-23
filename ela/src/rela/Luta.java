package rela;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;
	
	//getters and setters
	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void setDesafiante(Lutador de) {
		this.desafiante = de;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if (this.aprovada) {
			desafiado.apresentar();
			System.out.println("-------VS-------");
			desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("###Resultado###");
			switch(vencedor){
			case 0:
				System.out.println("Empatou");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				break;
			case 1:
				System.out.println("vitoria"+ this.desafiado);
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
			case 2:
				System.out.println("Vitoriaa" + this.getDesafiante());
				desafiado.perderLuta();
				desafiante.ganharLuta();
				break;
			}
		}else{
			System.out.println("Luta nao pode aconteccer");
		}
	}
}
