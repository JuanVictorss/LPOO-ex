import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int number = read.nextInt();
		System.out.println(num(number));
		read.close();
	}
	
	public static String num(int n) {
		if (n % 2 == 0) {
			return "Esse numero e par.";
		}else {
			return "Esse numero e impar.";
		}
	}
}