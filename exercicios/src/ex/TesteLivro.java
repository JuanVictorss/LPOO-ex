package ex;

public class TesteLivro {
	public static void main(String[] args) {
		Livro l[] = new Livro[2];
		Pessoa p[] = new Pessoa[2];
		
		p[0] = new Pessoa("Jose", 25, "M");
		p[1] = new Pessoa("Maria", 18, "F");
		
		l[0] = new Livro("Broken Heart", "pit", 345, p[0]);
		l[1] = new Livro("Magc", "GER", 245, p[1]);
		
		System.out.println(l[0].detalhes());
	}

}
