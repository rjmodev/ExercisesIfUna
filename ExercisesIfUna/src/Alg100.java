//ler um número inteiro de 4 casas e imprimir se é ou não multiplo de quatro o número formado
//pelos algarismos que estão nas casas das unidades de milhar e das centenas.
import java.util.Scanner;

public class Alg100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro de 4 dígitos: ");
        int number = in.nextInt();

        int thousand = number / 1000;
        int hundred = (number / 100) %10;
        int combineHundredThousand = thousand * 10 + hundred;

        if(combineHundredThousand % 4 == 0){
            System.out.printf("%nO número %d de %d é múltiplo de 4.%n", combineHundredThousand, number);
        } else {
            System.out.printf("%nO número %d de %d não é múltiplo de 4.%n", combineHundredThousand, number);
        }
        in.close();
    }
}
