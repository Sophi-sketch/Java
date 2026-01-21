public class CastingEx {
    public static void main(String[] args) {
        /*Declare uma variável do tipo double e uma variável do tipo int.
        Faça o casting da variável double para int e imprima o resultado.*/
        double decimal = 18.5;

        int Inteiro = (int) decimal; //o número em decimal foi mudado para inteiro por meio do casting.
        //quando se utiliza o casting de double para int, o número depois da vírgula é excluído.

        System.out.println(Inteiro);

    }
}
