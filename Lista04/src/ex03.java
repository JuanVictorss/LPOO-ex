import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex03 {
	static List<String> list = new ArrayList<>();
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite a quantidade de pessoas: ");
		int people = read.nextInt();
		
		System.out.println(overweight(people));
	}
	
	public static List<String> overweight(int people){
		for (int i = 0; i < people; i++) {
			System.out.println("Digite o nome da pessoa: ");
			String nome = read.next();
			System.out.println("Digite o peso em kg: ");
			float kg = read.nextFloat();
			System.out.println("Digite a altura em metros: ");
			float height = read.nextFloat();
			if(kg/(height*height) >= 25) {
				list.add(nome);
			}
		}
		return list;
	}
}