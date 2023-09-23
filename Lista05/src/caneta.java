
public class caneta {
	public String modelo;
	public String cor;
	public float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: "+ this.carga);
		System.out.println("Esta tampada? "+ this.tampada);
	}
	public caneta(){
		this.carga = 100;
		this.tampada = true;
	}
	
	
	void rabiscar() {
		if(this.tampada) {
			System.out.println("Erro! nao posso riscar");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
}
