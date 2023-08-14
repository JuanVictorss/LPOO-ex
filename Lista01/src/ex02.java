import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		float total = 0;
		System.out.println("Digite altura: ");
		Scanner read = new Scanner(System.in);
		for (int x = 0; x < 5; x++) {
			int alt = read.nextInt();
			total = total + alt;
		}
		System.out.println(total/5);
		read.close();
	}
}