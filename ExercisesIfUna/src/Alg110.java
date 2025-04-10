//criar um algoritmo que leia dois números e imprimir uma mensagem dizendo se são iguais
//ou diferentes

import java.util.Scanner;

public class Alg110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        if (n1 != n2) {
            System.out.printf("%nOs números %d e %d são diferentes.%n", n1, n2);
        } else {
            System.out.printf("%nOs números %d e %d são iguais.%n", n1, n2);
        }
        in.close();
    }
}
