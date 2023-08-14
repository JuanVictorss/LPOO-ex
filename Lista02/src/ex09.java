import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String name = read.nextLine();
		name = name.replaceAll("[aeiouAEIOU]", "*");
		int count = 0;
		for (int pos = 0; pos < name.length(); pos++) {
			if (name.charAt(pos) == '*' ) {
				count++;
			}
		}	
		System.out.println("Quantidade de vogais e "+count+".");
		read.close();
	}

}
