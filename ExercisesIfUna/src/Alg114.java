//entrar com dois números e imprimi-los em ordem decrescente
import java.util.Scanner;

public class Alg114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        if (n1 < n2) {
            System.out.printf("%nA ordem decrescente dos  números é: %n%d %n%d %n", n2, n1);
        } else {
            System.out.printf("%nA ordem decrescente dos  números é: %n%d %n%d %n", n1, n2);
        }
        in.close();
    }
}
