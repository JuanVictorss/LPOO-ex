import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o seu salario: ");
		float wage = read.nextFloat();
		System.out.println("Valor do imposto "+tax(wage)+"R$.");
		read.close();
	}

	public static float tax(float x) {
		if (x <= 2000) {
			return (float) (0);
		}else if(x > 2000 && x <= 3500) {
			return (float) (x * 0.15);
		}else if(x > 3500 && x <= 5000) {
			return (float) (x * 0.22);
		}else if(x > 5000) {
			return (float)(x * 0.3);
		}
		return 0;
	}
}