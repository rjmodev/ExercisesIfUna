//entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou
//menor do que 20
import java.util.Scanner;

public class Alg102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro: ");
        int number = in.nextInt();

        if (number > 20){
            System.out.printf("%nO número %d é maior do que 20.%n", number);
        } else if (number == 20) {
            System.out.printf("%nO número %d é igual a 20.%n", number);
        }else {
            System.out.printf("%nO número %d é menor do que 20.%n", number);
        }
    in.close();
    }
}
