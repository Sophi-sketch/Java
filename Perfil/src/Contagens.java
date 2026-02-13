import java.util.Scanner;

public class Contagens {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0, num;

        System.out.print("Digite um número para a contagem progressiva==>");
        num =  entrada.nextInt();

        while (cont <= num) {
            System.out.print(cont+ " ");
            cont++;
        }
    }
}

