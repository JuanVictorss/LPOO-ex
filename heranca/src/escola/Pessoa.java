package escola;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazAniversario() {
		this.idade++;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public String getSexo() {
		return this.sexo;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public void setIdade(int i) {
		this.idade = i;
	}
	public void setSexo(String s) {
		this.sexo = s;
	}
}
