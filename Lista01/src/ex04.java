import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner read = new Scanner(System.in);
		while (true) {
			System.out.println("Idade: ");
			int age = read.nextInt();
			total += age;
			if (age == 0) {
				break;
			}
			count += 1;
		}
		float average = total/count;
		System.out.println("Media: " +average);
		read.close();
	}
}