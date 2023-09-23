package aulaget;

public class caneta {
	private String modelo;
	private Float ponta;
	private boolean tampada;
	private String cor;
	
	
	public caneta(String m, String c, Float p) {
		this.setModelo(m);
		this.setPonta(p);
		this.cor = c;
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public Float getPonta() {
		return this.ponta;
	}
	public void setPonta(Float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("modelo: "+ this.getModelo());
		System.out.println("Ponta: "+ this.getPonta());
		System.out.println("Cor: "+ this.cor);
		System.out.println("Esta: "+ this.tampada);
	}
}