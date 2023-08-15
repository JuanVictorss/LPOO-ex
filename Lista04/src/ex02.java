import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex02 {
	static List<String> list = new ArrayList<>();
	static String[] names_aproved = new String[10];
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String[] names = new String[3];	
		int[] note_a = new int[3];
		int[] note_b = new int[3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Digite o nome: ");
			String name = read.next();
			names[i] = name;
			System.out.println("Digite a primeira nota: ");
			note_a[i] = read.nextInt();
			System.out.println("Digite a segunda nota: ");
			note_b[i] = read.nextInt();
		}
		System.out.println(aproved(names, note_a, note_b));
		read.close();
	}
	
	public static List<String> aproved(String[] name, int[] note_a, int[] note_b){
		
		for (int i = 0; i < note_a.length; i++) {
			if ((note_a[i] + note_b[i]) / 2 >= 7){
				list.add(name[i]);
			}
		}
		return list;
	}
}