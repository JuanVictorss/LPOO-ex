import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex06 {

	public static void main(String[] args) {
		List<Float> list = new ArrayList<>();
		
		Scanner read = new Scanner(System.in);
		for (int x = 0; x < 5; x++) {
			System.out.println("Digite a alutura em metros: ");
			float height = read.nextFloat();
			System.out.println("Digite o peso em kg: ");
			float weight = read.nextFloat();
			float imc = weight / (height * height);
			list.add(imc);
		}
		int below = 0, ideal = 0, above = 0;
		for (Float element : list) {
			if (element < 18.5) {
				below += 1;
			}else if(18.5 < element && element < 25) {
				ideal += 1;
			}else if(element >= 25) {
				above += 1;
			}
		}
		System.out.println("Pessoas abaixo do peso: " + below);
		System.out.println("Pessoas no peso ideal: " + ideal);
		System.out.println("Pessoas acima do peso: " + above);
		read.close();
	}

}
