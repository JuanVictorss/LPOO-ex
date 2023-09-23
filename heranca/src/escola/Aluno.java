package escola;

public class Aluno extends Pessoa {
	private String curso;
	private int matricula;
	
	public void cancelarMatricula() {
		this.matricula = 0;
	}
	
	public String getCurso() {
		return this.curso;
	}
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setCurso(String c) {
		this.curso = c;
	}
	public void setMatricula(int m) {
		this.matricula = m;
	}
}
