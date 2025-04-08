//entrar com um número e informar se ele é divisível por 3 e por 7
import java.util.Scanner;

public class Alg96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro: ");
        int number = in.nextInt();

        if(number % 3 == 0 && number % 7 == 0){
            System.out.printf("%nO %d é dívisível por 3 e 7.%n", number);
        }else{
            System.out.printf("%nO %d não é dívisível por 3 e 7.%n", number);
        }
        in.close();
    }
}
