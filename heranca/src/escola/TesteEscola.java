package escola;

public class TesteEscola {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Pito");
		a1.setIdade(22);
		a1.setSexo("M");
		
		System.out.println(a1.getNome());
	}
}