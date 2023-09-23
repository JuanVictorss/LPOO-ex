package exercicios;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String ti, String au, int to, Pessoa le) {
		this.titulo = ti;
		this.autor = au;
		this.totPaginas = to;
		this.leitor = le;
	}
	
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" 
				+ totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor.getNome() + "]";
	}

	
	public void abrir() {
		this.aberto = true;
	}

	public void fechar() {
		this.aberto = false;
	}


	public void folhear(int p) {
		this.pagAtual = p;
	}

	public void avancarPag() {
		this.pagAtual++;
	}

	public void voltarPag() {
		this.pagAtual--;
	}
}