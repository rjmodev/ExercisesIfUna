//entrar com um número e imprimir uma das mensagens: é multiplo de 3 ou não é multiplo de 3

import java.util.Scanner;

public class Alg94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro: ");
        int number = in.nextInt();

        if(number % 3 == 0){
            System.out.printf("%nO %d é múltiplo de 3.%n", number);
        }else{
            System.out.printf("%nO %d não é múltiplo de 3.%n", number);
        }
        in.close();
    }
}
