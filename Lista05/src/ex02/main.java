package ex02;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Retangulo re = null;
		while(true) {
			System.out.println("###Menu###");
			System.out.println("1-Criar retangulo");
			System.out.println("2-Calcular area");
			System.out.println("3-Calcular perimetro");
			System.out.println("0-Sair");
			int opcao = read.nextInt();
			if (opcao == 0) {
				break;
			}
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor da base: ");
				float base = read.nextFloat();
				System.out.println("Digite o valor da altura: ");
				float altura = read.nextFloat();
				re = new Retangulo(base, altura);
				break;
			case 2:
				if (re == null) {
					System.out.println("Sem valores");
					break;
				}else {
					re.area();
					break;
				}
			case 3:
				if (re == null) {
					System.out.println("Sem valores");
					break;
				}else {
					re.perimetro();
					break;
				}
			}
		}
		read.close();
	}
}
