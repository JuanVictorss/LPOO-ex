import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex01 {
	static List<String> list = new ArrayList<>();
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o numero de funcionarios.");
		int number = read.nextInt();
		for (int i = 0; i < number-1; i++) {
			names();
		}
		System.out.println(names());
	}
	public static List<String> names() {
		System.out.println("Digite o nome do funcionario: ");
		String name = read.next();
		System.out.println("Digite o salario do funcionario: ");
		float wage = read.nextFloat();
		if (wage > 5000) {
			list.add(name);
		}
		return list;
	}
}