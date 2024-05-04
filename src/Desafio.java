
import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Jhon Smith";
        String tipoConta = "Conta Corrente";
        double saldo = 3500.00;
        int opcao = 0;


        System.out.println("*****************************");


        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("saldo atual: R$ " + saldo);
        System.out.println("\n****************************");

        String operacoes = """
                **Escolha uma opção**
                1-Consultar Saldo
                2-Tranferir Valor
                3-Depósito
                4-Saque
                5-Sair
                """;


        Scanner leitura = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(operacoes);
            opcao = leitura.nextInt();
            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Digite um número entre 1 e 5.");
            }

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: R$" + saldo);

            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Não existe saldo sulficiente para realizar a transferência.");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Novo saldo: R$" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja depositar?");
                double valorDeposito = leitura.nextDouble();
                saldo += valorDeposito;
                System.out.println("Novo saldo é: R$" + saldo);
            } else if (opcao == 4) {
                System.out.println("Qual o Valor que deseja sacar?");
                double valorSaque = leitura.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("Não existe saldo suficiente para realizar essa operação.");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Saque efetuado com sucesso.");
                    System.out.println(" Novo saldo é: R$ " + saldo);
                }
            }
        }
    }
}
