/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou
menor do que o número gerado.*/


import java.util.Random;
import java.util.Scanner;

public class GameAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        char novoJogo;
        
//O 'do-while' permite que haja um loop para perguntar ao usuário se ele deseja continuar
       
import java.util.Random;
import java.util.Scanner;

public class GameAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();
        char novoJogo;

        do {

            int numeroGerado = new Random().nextInt(101);
            int tentativas = 0;
            int palpite;
            boolean acertou = false;

            System.out.println("\n------Seja bem-vinda(o) ao novo jogo da adivinhação!------");
            System.out.println("Escolha um número de 0 a 100, você tem 5 tentativas:\n");

            while (tentativas < 5) {
                System.out.print("Digite o número ==> ");
                palpite = entrada.nextInt();

                if (palpite < 0 || palpite > 100) {
                    System.out.println("\nErro! Você deve digitar um número de 0 a 100.");
                    System.out.println("Essa tentativa não será contada.\nTente novemente!\n\n");
                    continue;
                }

                tentativas++;

                if (palpite == numeroGerado) {
                    System.out.println("\nParabéns! Você achou o número secreto " + numeroGerado + " com " + tentativas + " tentativas.");
                    acertou = true;
                    break;

                } else if (palpite < numeroGerado) {
                    System.out.println("O número secreto é maior que " + palpite + "\n");

                } else {
                    System.out.println("O número secreto é menor que " + palpite + "\n");
                }

                }
            //foca no resultado após o jogo
            if (!acertou){
                System.out.println("\nQue pena! Suas chances acabaram.");
                System.out.print("O número secreto era: " + numeroGerado);

            }

            System.out.print("\nDeseja jogar novamente?(s/n): ");
            novoJogo = entrada.next().toLowerCase().charAt(0);

        } while (novoJogo == 's');

            System.out.println("\nObrigado por jogar! Até a próxima.");
            entrada.close();

    }
}

