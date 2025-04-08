//entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não é divisível
//por nenhum destes

import java.util.Scanner;

public class Alg97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro: ");
        int number = in.nextInt();

        boolean divisible = false;

        if(number % 10 == 0 ){
            System.out.printf("%nO %d é dívisível por 10.%n", number);
            divisible = true;
        }
        if (number % 5 == 0) {
            System.out.printf("%nO %d é dívisível por 5.%n", number);
            divisible = true;
        }
        if (number % 2 == 0) {
            System.out.printf("%nO %d é dívisível por 2.%n", number);
            divisible = true;
        }
        if (!divisible){
            System.out.printf("%nO %d não é dívisível por 10, 5 ou 2.%n", number);
        }
        in.close();
    }
}