/*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a
essa variável, representando o preço original de um produto. Em seguida, declare
uma variável do tipo double percentualDesconto e atribua um valor percentual de
desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
aplique-o ao preço original e imprima o novo preço com desconto.*/

public class Desconto {
    public static void main(String[] args) {

        double precoOriginal = 50.10;
        double percentualDesconto = 20.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.format("Preço original: R$%.2f", precoOriginal);
        System.out.format("\nDesconto do produto: R$%.2f", valorDesconto);
        System.out.println("\nNovo preço: R$"+ novoPreco);

    }
}
