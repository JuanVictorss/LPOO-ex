package ex03;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Circulo ci = null;
		while(true) {
			System.out.println("###Menu###");
			System.out.println("1-Criar um circulo");
			System.out.println("2-Calcular Area");
			System.out.println("3-Calcular Perimetro");
			System.out.println("0-Sair");
			int option = read.nextInt();
			if (option == 1) {
				System.out.println("Digite o valor do raio: ");
				float raio = read.nextFloat();
				ci = new Circulo(raio);
			}else if(option == 2) {
				if (ci != null) {
					ci.area();
				}else{
					System.out.println("Sem valores");
				}
			}else if(option == 3) {
				if (ci != null) {
					ci.perimetro();
				}else {
					System.out.println("Sem valores");
				}
			}else if(option == 0) {
				System.out.println("Saindo");
				break;
			}
		}
		read.close();
	}
}
