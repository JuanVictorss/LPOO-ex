import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		String[] names = new String[10];
		int[] ages = new int[10];
		Scanner read = new Scanner(System.in);
		for (int pos = 0; pos < names.length; pos++) {
			System.out.println("Digite o nome: ");
			String name = read.next();
			names[pos] = name;
			System.out.println("Digite a idade: ");
			int age = read.nextInt();
			ages[pos] = age;
		}
		System.out.println("A pessoa mais velha e "+old(names, ages));
		read.close();
		System.out.println("A pessoa mais nova e "+young(names, ages));
		System.out.println("Numero de pessoas com mais de 18 anos "+eighteen(ages));
	}
	public static String old(String[] name, int[] age) {
		int more = 0;
		int index = 0;
		for (int i = 0; i < name.length; i++) {
			if (age[i] > more) {
				more = age[i];
				index = i;
			}
		}
		return name[index];
	}
	public static String young(String[] name, int[] age) {
		int less = age[0];
		int index = 0;
		for (int i = 0; i < name.length; i++) {
			if (age[i] < less) {
				less = age[i];
				index = i;
			}
		}
		return name[index];
	}
	
	public static int eighteen(int[] age) {
		int count = 0;
		for (int i = 0; i < age.length; i++) {
			if (age[i] > 18) {
				count += 1;
			}
		}
		return count;
		
	}
}
