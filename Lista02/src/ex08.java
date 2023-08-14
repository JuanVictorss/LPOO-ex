import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite algo: ");
		String name = read.nextLine();
		name = name.replaceAll("\\s", "");
		System.out.println("Numero de letras "+name.length()+".");
		read.close();
	}

}