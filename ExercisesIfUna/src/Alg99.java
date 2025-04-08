//ler um número inteiro de 3 casas decimais e imprimir se o algarismo de casa das centenas
//é par ou impar
import java.util.Scanner;

public class Alg99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro de 3 dígitos: ");
        int number = in.nextInt();

        int hundredNumber = number / 100;

        if (hundredNumber % 2 == 0){
            System.out.printf("%nA centena de %d é par.%n", number);
        }else {
            System.out.printf("%nA centena de %d é ímpar.%n", number);
        }
    in.close();
    }
}
