//entrar com três números e armazenar o maior número na variável de numero maior

import java.util.Scanner;

public class Alg117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            n3 = n1;
            System.out.printf("%nO 3º número agora é o maior com o valor de %d.%n", n3);
        } else if (n2 > n1 && n2 > n3) {
            n3 = n2;
            System.out.printf("%nO 3º número agora é o maior com o valor de %d.%n", n3);
        } else if (n3 > n1 && n3 > n2) {
            System.out.printf("%nO %d é maior que %d e %d.%n", n3, n2, n1);
        } else {
            System.out.printf("%nOs números estão digitados errados ou iguais.");
        }
        in.close();
    }
}
