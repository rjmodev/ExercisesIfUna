//construir um algoritmo que indique se o número digitado está compreendido entre 20 e 90
//ou não.
import java.util.Scanner;

public class Alg101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite um número inteiro: ");
        int number = in.nextInt();

        if (number >= 20 && number <= 90){
            System.out.printf("%nO número %d está entre 20 e 90.%n", number);
        } else {
            System.out.printf("%nO número %d não está entre 20 e 90.%n", number);
        }
    in.close();
    }
}
