import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite a base do retangulo.");
		float base = read.nextFloat();
		System.out.println("Digite a altura do retangulo.");
		float height = read.nextFloat();
		
		System.out.println("Escolha uma opcao.");
		System.out.println("1. Calcular a area do retangulo");
		System.out.println("2. Calcular o perimetro do retangulo");
		int option = read.nextInt();
		if (option == 1) {
			System.out.println("A area e "+area(base, height)+".");
		}else if(option == 2) {
			System.out.println("O perimetro e "+perimeter(base, height)+".");
		}else {
			System.out.println("Opcao invalida.");
		}
		read.close();
	}
	
	public static float area(float x, float y) {
		return x * y;
	}
	public static float perimeter(float x, float y) {
		return 2 * x + 2 * y;
	}

}
