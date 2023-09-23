import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();
        int maxClientes = 10;

        while (true) {
            System.out.println("### MENU ###");
            System.out.println("1 - Cadastrar Conta ou Poupanca");
            System.out.println("2 - Realizar Deposito");
            System.out.println("3 - Render Juros");
            System.out.println("4 - Consultar Numero e Nome da Agencia");
            System.out.println("5 - Alterar Numero e Nome da Agencia");
            System.out.println("0 - Sair");

            int opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    if (contas.size() < maxClientes) {
                        System.out.println("Digite o nome do cliente: ");
                        String nomeCliente = read.next();
                        System.out.println("Digite o CPF do cliente: ");
                        String cpfCliente = read.next();
                        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

                        System.out.println("Escolha o tipo de conta:");
                        System.out.println("1 - Conta Corrente");
                        System.out.println("2 - Poupanca");
                        int tipoConta = read.nextInt();

                        System.out.println("Digite o numero da conta: ");
                        int numeroConta = read.nextInt();
                        System.out.println("Digite o numero da agencia: ");
                        int numeroAgencia = read.nextInt();
                        
                        System.out.println("Digite o nome da agencia: ");
                        String nomeAgencia = read.next();
                        Banco banco = new Banco(numeroAgencia, nomeAgencia);

                        System.out.println("Digite o saldo inicial: ");
                        double saldoInicial = read.nextDouble();

                        if (tipoConta == 1) {
                            contas.add(new Conta(numeroConta, banco, cliente, saldoInicial));
                        } else if (tipoConta == 2) {
                            System.out.println("Digite a taxa de juros: ");
                            double taxaJuros = read.nextDouble();
                            contas.add(new Poupanca(numeroConta, banco, cliente, saldoInicial, taxaJuros));
                        } else {
                            System.out.println("Tipo de conta invalido.");
                        }
                    } else {
                        System.out.println("Limite de clientes atingido (10 clientes).");
                    }
                    break;
                case 2:
                    System.out.println("Digite o CPF do cliente: ");
                    String cpfDeposito = read.next();
                    System.out.println("Digite o valor a depositar: ");
                    double valorDeposito = read.nextDouble();

                    for (Conta conta : contas) {
                        if (conta.getCliente().getCPF().equals(cpfDeposito)) {
                            conta.depositar(valorDeposito);
                            System.out.println("Deposito de R$" + valorDeposito + " realizado com sucesso.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o CPF do cliente: ");
                    String cpfJuros = read.next();

                    for (Conta conta : contas) {
                        if (conta instanceof Poupanca && conta.getCliente().getCPF().equals(cpfJuros)) {
                            Poupanca poupanca = (Poupanca) conta;
                            poupanca.renderJuros();
                            System.out.println("Juros rendidos. Novo saldo: R$" + poupanca.getSaldo());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeConsulta = read.next();

                    for (Conta conta : contas) {
                        if (conta.getCliente().getNome().equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("Numero da agencia: " + conta.getBanco().getNumeroAgencia());
                            System.out.println("Nome da agencia: " + conta.getBanco().getNomeAgencia());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do cliente: ");
                    String nomeAlteracao = read.next();

                    for (Conta conta : contas) {
                        if (conta.getCliente().getNome().equalsIgnoreCase(nomeAlteracao)) {
                            System.out.println("Digite o novo numero da agencia: ");
                            int novoNumeroAgencia = read.nextInt();
                       
                            System.out.println("Digite o novo nome da agencia: ");
                            String novoNomeAgencia = read.next();
                            conta.getBanco().setNumeroAgencia(novoNumeroAgencia);
                            conta.getBanco().setNomeAgencia(novoNomeAgencia);
                            System.out.println("Agencia alterada com sucesso.");
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Ate logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
            }
            read.close();
        }
    }
}