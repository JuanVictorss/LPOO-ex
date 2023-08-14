import java.util.Scanner;
public class ex06 {
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Escolha uma opcao.");
		System.out.println("1. Transformar de Fahrenheit para Celsius");
		System.out.println("2. Transformar de Kelvin para Celsius");
		int option = read.nextInt();
		if (option == 1) {
			System.out.println(fah());
		}else if(option == 2) {
			System.out.println(kel());
		}else {
			System.out.println("Opcao invalida.");
		}

	}
	
	public static float fah() {
		System.out.println("Digite a temperatura em Fahrenheit: ");
		float temp = read.nextFloat();
		return (5 * (temp-32)) / 9;
	}
	public static float kel() {
		System.out.println("Digite a temperatura em Kelvin: ");
		float temp = read.nextFloat();
		return temp - 273;
	}

}
