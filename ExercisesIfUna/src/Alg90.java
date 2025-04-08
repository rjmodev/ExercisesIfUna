//Entrar com um número e imprimi-lo caso seja maior que 20
import java.util.Scanner;

public class Alg90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número para verificação: ");
        int number =in.nextInt();

        if(number > 20){
            System.out.printf("%nO número %d é maior que 20!%n", number);
        }
        in.close();
    }
}
