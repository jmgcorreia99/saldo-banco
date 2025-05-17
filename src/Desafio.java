import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("****************************************************");
        System.out.println("Nome do cliente:                  " + nome);
        System.out.println("Tipo de conta:                    " + tipoConta);
        System.out.println("Saldo atual:                      " + saldo);
        System.out.println("**************************************************** \n");

        String menu = """
                *** Digite sua opção ***
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é de: R$" + saldo + "\n");
            } else if (opcao == 2) {
                System.out.println("Qual valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo Insuficiente \n");
                }else {
                    saldo -= valor;
                    System.out.println("Tranferencia realizada com sucesso!");
                    System.out.println("Seu saldo atualizado é de: R$" + saldo + "\n");
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Tranferencia recebida com sucesso!");
                System.out.println("Seu saldo atualizado é de: R$" + saldo + "\n");
            } else if (opcao != 4){
                System.out.println("Opção invalida! \n");
            }
        }
    }
}
