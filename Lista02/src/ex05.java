import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		System.out.println("Digtie a quantidade de pessoas que vai cadastrar.");
		int times = read.nextInt();
		
		for (int x = 0; x < times; x++) {
			System.out.println("Digite um nome: ");
			String name = read.next();
			list.add(name);			
		}
		System.out.println("Digite o nome que deseja procurar: ");
		String search = read.next();
		for (String value : list) {
			if (value.equals(search)){
				System.out.println("Nome esta na lista.");
				break;
			}
		read.close();
		}
	}

}
