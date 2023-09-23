import java.util.Scanner;

public class oo {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		caneta c1 = new caneta();
		System.out.println("Digite o modelo da caneta: ");
		c1.modelo = read.next();
		
		System.out.println("Digite a cor da caneta: ");
		c1.cor = read.next();
		
		System.out.println("Digite a ponta da caneta: ");
		c1.ponta = read.nextFloat();
		
		while (true){
			System.out.println("Deseja usar a caneta? ");
			String resposta = read.next();
			
			if (resposta.equals("sim")) {
				c1.destampar();
				System.out.println("Deseja rabiscar?");
				String res = read.next();
				if (res.equals("sim")) {
					c1.rabiscar();
					c1.carga = c1.carga - 5;
				}
			}else if(resposta.equals("nao")) {
				if(c1.tampada) {
					System.out.println("A caneta ja esta tampada, pode guardar.");
				}else {
					c1.tampar();
					System.out.println("Tampando caneta.");
					break;
				}
			}else {
				System.out.println("INVALIDO");
			}
			System.out.println("Deseja ver o status da caneta?");
			String re = read.next();
			if (re.equals("sim")) {
				c1.status();
			}
		}
		System.out.println("Status da caneta");
		c1.status();
		read.close();
	}
}
