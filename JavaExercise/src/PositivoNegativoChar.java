//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo,
// exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;
import java.util.InputMismatchException;
public class PositivoNegativoChar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        char resposta;

        do{
            try {
                System.out.println("Digite um número, podendo ser negativo:");
                System.out.print("==> ");
                numero = entrada.nextInt();

                if (numero == 0) {
                    System.out.println("\nNúmero Neutro");
                } else if (numero >= 1) {
                    System.out.println("\nNúmero Positivo");
                } else {
                    System.out.println("\nNúmero Negativo");
                }
            }catch (InputMismatchException e){
                System.out.println("Erro: Você precisa digitar um número inteiro válido!");
                entrada.next();
            }

            System.out.print("Gostaria de continuar? (s/n): ");
            resposta = entrada.next().toLowerCase().charAt(0);

        }while(resposta == 's');

        System.out.println("\nPrograma encerrado.");
        entrada.close();
    }
}
