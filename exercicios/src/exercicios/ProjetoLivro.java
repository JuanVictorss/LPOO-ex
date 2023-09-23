package exercicios;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

			p[0] = new Pessoa("Pedro", 22, "M");
			p[1] = new Pessoa("Maria", 25, "F");
			
			l[0] = new Livro("Aprendendo Java", "Jose da silva", 300, p[0]);
			l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 450, p[1]);
			l[2] = new Livro("JAVA av", "Mario armario", 530, p[0]);
	}

}
