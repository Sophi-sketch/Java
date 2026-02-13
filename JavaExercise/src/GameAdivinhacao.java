/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou
menor do que o número gerado.*/


import java.util.Random;
import java.util.Scanner;

public class GameAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int palpite;

        System.out.println("\n------Seja bem-vinda(o) ao jogo da adivinhação!------");
        System.out.println("Escolha um número de 0 a 100, você tem 5 tentativas:\n");

        while(tentativas < 5){
            System.out.print("Digite o número ==> ");
            palpite = entrada.nextInt();
            tentativas++;

            if(palpite == numeroGerado){
                System.out.println("\nParabéns! Você achou o número secreto " + numeroGerado + " com " + palpite + " tentativas.");
                break;

            } else if (palpite < numeroGerado){
                System.out.println("O número secreto é maior que " + palpite + "\n");

            }else {
                System.out.println("O número secreto é menor que " + palpite + "\n");
            }
            if (tentativas == 5 && palpite != numeroGerado){
                //A condição com && ajuda a não ter erro de lógica.
                //Para caso o Usuário acerte na 5 tentativa, ele não vai receber essa mensagem de perda.
                System.out.println("\nQue pena! Suas chances acabaram. O número era: " + numeroGerado);
            }

            if (palpite < 0){
                System.out.println("Escolha um número que está de 0 e 100!!!");
                System.out.println("Inicie novamente.");
                break;
            }
        }

    }
}
