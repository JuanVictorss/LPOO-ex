import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite algo: ");
		String name = read.nextLine();
		System.out.println(vowel(name));
		read.close();
	}
	
	public static int vowel(String x) {
		int count = 0;
		String isolate = x.replaceAll("[aeiouAEIOU]", "*");
		for (int i = 0; i < x.length(); i++) {
			char letter = isolate.charAt(i);
			if (letter == '*') {
				count += 1;
			}
		}
		return count;
	}
}