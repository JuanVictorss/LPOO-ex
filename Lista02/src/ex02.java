import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		
		for (int x = 1; x < 11; x++) {
			System.out.println("Digite o "+x+" numero");
			int value = read.nextInt();
			list.add(value);
		}
		
		int bigger = list.get(0);
		int smaller = list.get(0);
		int total = 0;
		
		for(int number : list) {
			if (bigger < number) {
				bigger = number;
			}
			if (smaller > number) {
				smaller = number;
			}
			total += number;
		}
		
		System.out.println("Maior valor digitado "+ bigger);
		System.out.println("Menor valor digitado "+ smaller);
		System.out.println("Media dos valores digitados "+ total/10);
		read.close();
		
	}
}
