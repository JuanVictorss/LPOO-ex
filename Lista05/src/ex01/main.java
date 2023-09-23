package ex01;

import java.util.Scanner;

public class main {

	public main(String[] args) {
		Scanner read = new Scanner(System.in);
		estudante aluno = null;
		while (true) {
			System.out.println("###MENU###");
			System.out.println("1-Criar um Estudante");
			System.out.println("2-Calcular Media");
			System.out.println("3-Obter numero de matricula");
			System.out.println("4-Obter Endereco");
			System.out.println("0-Sair");
			int opcao = read.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				String nome = read.next();
				System.out.println("Digite a matricula: ");
				int matricula = read.nextInt();
				System.out.println("Digite o endereco: ");
				String endereco = read.next();
				aluno = new estudante(nome, matricula, endereco);
				break;
			case 2:
				if(aluno == null) {
					System.out.println("Aluno nao cadastrado");
					break;
				}else{
					System.out.println("Digite a primeira nota: ");
					aluno.setNota1(read.nextFloat());
					System.out.println("Digite a segunda nota: ");
					aluno.setNota2(read.nextFloat());
					System.out.println("Digite a terceira nota: ");
					aluno.setNota3(read.nextFloat());
					System.out.println("Digite a quarta nota: ");
					aluno.setNota4(read.nextFloat());
					aluno.media();
					break;
				}
			case 3:
				if(aluno == null) {
					System.out.println("Matricula nao cadastrada");
					break;
				}else{
					aluno.getMatricula();
					break;
				}
			case 4:
				if(aluno == null) {
					System.out.println("Endereco nao cadastrado");
					break;
				}else{
				aluno.getEndereco();
				break;	
				}
			}
			read.close();
		}
	}
}
