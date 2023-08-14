import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		for (int x = 1; x < 11; x++) {
			System.out.println("Digite o "+x+" numero.");
			int number = read.nextInt();
			list.add(number);
	}
		for (int num_list : list) {
			sum += num_list;
		}
		System.out.println("Soma da lista " + sum);
		read.close();
 }
}