package ex01;


public class estudante {
	String nome;
	int matricula;
	String endereço;
	float nota1, nota2, nota3, nota4;
	
	//construtor
	public estudante(String nome, int matricula, String endereco) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereço = endereco;
	}
	
	//nome
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	
	//matricula
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int m) {
		this.matricula = m;
	}
	
	//endereço
	public String getEndereco() {
		return this.endereço;
	}
	public void setEndereco(String e) {
		this.endereço = e;
	}
	
	//notas
	public float getNota1() {
		return this.nota1;
	}
	public void setNota1(float n1) {
		this.nota1 = n1;
	}
	
	public float getNota2() {
		return this.nota2;
	}
	public void setNota2(float n2) {
		this.nota2 = n2;
	}
	
	public float getNota3() {
		return this.nota3;
	}
	public void setNota3(float n3) {
		this.nota3 = n3;
	}
	
	public float getNota4() {
		return this.nota4;
	}
	public void setNota4(float n4) {
		this.nota4 = n4;
	}
	
	//media
	public void media(){
		float media = (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
		if (media >= 7) {
			System.out.println("Aluno aprovado: "+ media);
		}else{
			System.out.println("Aluno reprovado: "+ media);
		}
	}
}
