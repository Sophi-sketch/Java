/*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa
variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

public class DolarConversao {
    public static void main(String[] args) {

        double valorEmDolares = 250.50;
        double taxaDoDolar = 4.94;
        double valorEmReais = valorEmDolares * taxaDoDolar;

        System.out.format("A conversão do dólar para real deu: " + valorEmReais);

    }
}
