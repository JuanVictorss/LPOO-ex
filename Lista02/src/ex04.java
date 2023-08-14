import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		
		for (int x = 1; x < 11; x++) {
			System.out.println("Digite o "+x+" numero.");
			int number = read.nextInt();
			list.add(number);
		}
		for (int pos = list.size() - 1; pos >= 0; pos--) {
			int value = list.get(pos);
			System.out.println(value);
		}
		read.close();
	}

}
