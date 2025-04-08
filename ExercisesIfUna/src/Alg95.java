//entrar com um número e informar se ele é ou não divisível por 5
import java.util.Scanner;

public class Alg95 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%nDigite um número inteiro: ");
        int number = in.nextInt();

        if(number % 3 == 0){
            System.out.printf("%nO %d é dívisível por 5.%n", number);
        }else{
            System.out.printf("%nO %d não é dívisível por 5.%n", number);
        }
        in.close();
    }
}