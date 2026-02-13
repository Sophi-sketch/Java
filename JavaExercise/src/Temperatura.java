public class Temperatura {

    public static void main(String[] args) {
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);

        System.out.println(mensagem); // imprime o valor/conteúdo da variável mensagem, no console

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);

    }

}
