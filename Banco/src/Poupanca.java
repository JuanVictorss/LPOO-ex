
public class Poupanca extends Conta {
	private double juros;
	
	
	public Poupanca(int numero, Banco b, Cliente c, double s, double juros) {
		super(numero, b, c, s);
		this.juros = juros;
	}
	
	public void renderJuros() { 
		depositar(getSaldo() * this.juros);
	}
}