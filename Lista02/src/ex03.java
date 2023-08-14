import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		List<Float> list = new ArrayList<>();
		Scanner read = new Scanner(System.in);
		
		for (int x = 1; x < 11; x++) {
			System.out.println("Digite a nota do "+x+" aluno.");
			float note = read.nextFloat();
			list.add(note);
		}
		
		int count = 0;
		int sum = 0;
		
		for (Float student : list) {
			if (student > 7) {
				count += 1;
			}
			sum += student;
		}
		
		System.out.println(count+" Alunos ficaram acima da media.");
		System.out.println("Media dos 10 alunos foi "+ (float)sum/10);
		read.close();
	}
}