
public class Banco {
	private int numeroAgencia;
	private String nomeAgencia;
	
	public Banco(int numero, String nome) {
		this.numeroAgencia = numero;
		this.nomeAgencia = nome;
	}
	
	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}
	public String getNomeAgencia() {
		return this.nomeAgencia;
	}
	
	public void setNumeroAgencia(int numero) {
		this.numeroAgencia = numero;
	}
	public void setNomeAgencia(String nome) {
		this.nomeAgencia = nome;
	}
}
