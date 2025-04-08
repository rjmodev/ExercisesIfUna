// contruir um algoritmo que leia dois valores numéricos inteiros e efetue a
// adição; caso o resultado seja maior que 10, apresentá-lo

import java.util.Scanner;

public class Alg91 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.printf("%nDigite o primeiro número inteiro: ");
    int n1 = in.nextInt();

    System.out.printf("Digite o segundo número inteiro: ");
    int n2 = in.nextInt();

    int sum = n1 + n2;

    if(sum > 10){
        System.out.printf("%nA soma de %d e %d tem resultado %d, sendo %d > 10%n", n1, n2, sum, sum);
        in.close();
    }
    }
}
