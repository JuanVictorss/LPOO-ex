import java.util.Scanner;

public class ex07 {
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o tamanho do vetor: ");
		int size = read.nextInt();
		int[] vector = new int[size];
		
		System.out.println(media(vector));
		read.close();
	}
	
	public static float media(int[] vector) {
		for(int i = 0; i < vector.length; i++) {
			int value = read.nextInt();
			vector[i] = (int) value;
		}
		float sum = 0;
		for (int pos : vector) {
			sum += pos;
		}
		return sum / vector.length;
	}

}
