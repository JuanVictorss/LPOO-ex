package ex;

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
		return "Livro [titulo=" + this.titulo + ", autor=" + autor 
				+ ", totPaginas=" + this.totPaginas + ", pagAtual=" + this.pagAtual
				+ ", aberto=" + this.aberto + ", leitor=" + this.leitor.getNome() + "]";
	}

	public void abrir() {
		this.aberto = true;
	}

	public void fechar() {
		this.aberto = false;
	}

	public void folhear(int p) {
		this.avancarPag();
	}

	public void avancarPag() {
		this.pagAtual++;
	}

	public void voltarPag() {
		this.pagAtual--;
	}
}
