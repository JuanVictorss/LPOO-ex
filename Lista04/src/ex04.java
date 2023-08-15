import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ex04 {
	
	static List<String> list_name = new ArrayList<>();
	static List<Float> list_wage = new ArrayList<>();
	
	static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true){
			System.out.println("Escollha uma opcao");
			System.out.println("1. Cadastrar funcionario");
			System.out.println("2. Calcular imposto");
			System.out.println("0. Sair");
			int option = read.nextInt();
			
			if(option == 1) {
				register();
			}else if(option == 2) {
				System.out.println(tax());
			}else if(option == 0) {
				break;
			}
		}
	}
	
	public static void register() {
		System.out.println("Digite o nome: ");
		String name = read.next();
		System.out.println("Digite o salario: ");
		float wage = read.nextFloat();
		if (wage <= 0) {
			System.out.println("Valor invalido!");
		}else {
			list_name.add(name);
			list_wage.add(wage);
	}
}
	
	public static float tax() {
		System.out.println("Digite o nome que deseja procurar: ");
		String name = read.next();
		if(list_name.contains(name)) {
			int index = list_name.indexOf(name);
			float value = list_wage.get(index);
			
			if (value <= 2000) {
				return 0;
			}else if(value > 2000 && value <= 3500) {
				return (float) (value * 0.15);
			}else if(value > 3500 && value <= 5000) {
				return (float) (value * 0.22);
			}else if(value > 5000) {
				return (float) (5000 * 0.3);
			}
		}else {
			System.out.println("Nome nao encontrado.");
		}
		return 0;
		}
	}

