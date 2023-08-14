import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o ano de nascimento: ");
		int born = read.nextInt();
		System.out.println("Informe o ano atual: ");
		int current = read.nextInt();
		int age = current - born;
		System.out.println(age);
		read.close();
	}

}