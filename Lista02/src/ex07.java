import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite algo: ");
		String name = read.nextLine();
		String sum = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char letter = name.charAt(i);
			sum += letter;
		}
		System.out.println(sum);
		read.close();
	}

}
