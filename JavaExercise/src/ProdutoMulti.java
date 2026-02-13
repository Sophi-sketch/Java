/*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o
resultado em uma mensagem.*/
public class ProdutoMulti {
    public static void main(String[] args) {

        double precoProduto = 100.99;
        int quantidade = 5;
        double total = precoProduto * quantidade;
        System.out.println("O produto custa= R$" + precoProduto + "\nQuantidade desejada: " + quantidade + "\n");

        String mensagem = "O valor total dos " + quantidade + " produtos é: R$" + total;

        System.out.println(mensagem);

    }
}
