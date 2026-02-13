import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 4; i++ ){
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }
        System.out.println("\nMédia das avaliações: " + mediaAvaliacao/4);
    }
}
