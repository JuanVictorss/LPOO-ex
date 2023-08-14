import java.util.Scanner;
public class ex02 {
	
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Digite um valor: ");
	int number_a = read.nextInt();
	System.out.println("Digite outro valor: ");
	int number_b = read.nextInt();
	
	System.out.println("Escolha uma operacao");
	System.out.println("1. Retornar a soma entre dois numeros;");
	System.out.println("2. Retornar a subtracao entre dois numeros;");
	System.out.println("3. Retornar a multiplicacao entre dois numeros;");
	System.out.println("4. Retornar a divisao entre dois numeros;");
	int option = read.nextInt();
	if (option == 1) {
		System.out.println(sum(number_a, number_b));
	}else if(option == 2) {
		System.out.println(sub(number_a, number_b));
	}else if(option == 3) {
		System.out.println(mul(number_a, number_b));
	}else if(option == 4) {
		System.out.println(div(number_a, number_b));
	}else {
		System.out.println("Opcao invalida.");
	}
	read.close();
 }
	
	public static int sum(int x, int y) {
		return x + y;
	}
	public static int sub(int x, int y) {
		return x - y;
	}
	public static int mul(int x, int y) {
		return x * y;
	}
	public static int div(int x, int y) {
		return x / y;
	}
}
