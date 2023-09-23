
public class Conta {
	private int numero;
	private Banco banco;
	private Cliente cliente;
	private double saldo;
	
	public Conta(int numero, Banco b, Cliente c, double s) {
		this.numero = numero;
		this.banco = b;
		this.cliente = c;
		this.saldo = s;
	}
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public Banco getBanco() {
		return this.banco;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
}
