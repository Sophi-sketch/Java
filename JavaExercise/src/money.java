import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldo = 5000;
        int opcao = 0;
        double valor;
        String dados = """
                
                --Dados iniciais do cliente--
                
                Nome: Letícia Quixote
                Tipo de Conta: Conta Corrente
                Saldo Inicial: R$ 5000
               
               """;
        System.out.println(dados);

        String menu = """
                
                
                ---Digite sua opção---
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                """;


        while(opcao != 4){
            System.out.println(menu);
            System.out.print("==> ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(saldo);
                    break;

                case 2:
                    System.out.println("\nInforme o valor a receber: ");
                    valor = entrada.nextDouble();
                    saldo += valor;
                    System.out.printf("\nSaldo atualizado: R$ " + saldo );
                    break;

                case 3:
                    System.out.println("\nInforme o valor que deseja transferir: ");
                    valor = entrada.nextDouble();
                    saldo -= valor;
                    System.out.printf("\nSaldo atualizado: R$ " + saldo);
                    if (valor > saldo){
                        System.out.println("\nSaldo insuficiente!");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando programa.");

                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        }

    }
}
