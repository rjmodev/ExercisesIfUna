// Contruir um algoritmo que leia dois números e efetue a adição. Caso o valor somado seja
// maior que 20, este deverá ser apresentado somando-se ele mais 8; caso o valor seja menor ou igual
// a 20, este deverá ser apresentado subtraindo-se 5
import java.util.Scanner;

public class Alg92 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.printf("%nDigite o primeiro número inteiro: ");
    int n1 = in.nextInt();

    System.out.printf("Digite o segundo número inteiro: ");
    int n2 = in.nextInt();

    int sum = n1 + n2;

        if (sum > 20){
            System.out.printf("%nA soma dos valores inseridos é %d somando-se com 8 resulta em %d", sum, sum+8);
        } else {
            System.out.printf("%nA soma dos valores inseridos é %d e subtraindo por 8 resulta em %d%n", sum, sum-8);
        }
        in.close();
    }
}
