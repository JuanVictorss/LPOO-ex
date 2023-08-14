import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		List<Integer> list_a = new ArrayList<>();
		List<Integer> list_b = new ArrayList<>();
		for(int x = 1; x < 3; x++) {
			System.out.println("Digite os valores do vetor "+ x+".");
			for (int y = 0; y < 5; y++) {
				System.out.println("Digite o "+y+" valor");
				int value = read.nextInt();
				if (x == 1) {
					list_a.add(value);
				}else{
					list_b.add(value);
				}
			}
		}
		
		boolean equal = true;
		for (int pos = 0; pos < list_a.size(); pos++) {
			if(list_a.get(pos) != list_b.get(pos)) {
				equal = false;
				break;
			}
		}
		if (equal) {
			System.out.println("Os vetores sao iguais.");
		}else {
			System.out.println("Os vetores nao sao iguais.");
		}
		read.close();
	}

}
