import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		banco c1 = new banco();
		
		System.out.println("numero da conta: ");
		c1.setnumConta(read.nextInt());
		
		System.out.println("Dono da conta: ");
		c1.setDono(read.next());
		
		System.out.println("Tipo da conta CC/CP: ");
		c1.abrirConta(read.next());
		
		System.out.println("Depositar:");
		c1.depositar(read.nextFloat());
		
		c1.estadoAtual();
		
		System.out.println("Sacar: ");
		c1.sacar(read.nextFloat());
		
		c1.estadoAtual();
	}

}
