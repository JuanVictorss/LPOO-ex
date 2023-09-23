package controle;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ControleRemoto c1 = new ControleRemoto();
		c1.ligar();
		while (true){
			System.out.println();
			System.out.println("Escolha uma opcao:");
			System.out.println("1-Exibir Menu");
			System.out.println("2-Aumentar volume");
			System.out.println("3-Diminuir volume");
			System.out.println("4-Pausa");
			System.out.println("5-Play");
			System.out.println("6-Mutar");
			System.out.println("7-Desmutar");
			System.out.println("0-Desligar");
			int opcao = read.nextInt();
			if (opcao == 1) {
				c1.abrirMenu();
			}else if(opcao == 2) {
				c1.maisVolume();
			}else if(opcao == 3) {
				c1.menosVolume();
			}else if(opcao == 4) {
				c1.pause();
			}else if(opcao == 5) {
				c1.play();
			}else if(opcao == 6) {
				c1.ligarMudo();
			}else if(opcao == 7) {
				c1.desligarMudo();
			}else if(opcao == 0) {
				c1.desligar();
				break;
			}else{
				System.out.println("N/A");
			}
		}
		
	}

}
