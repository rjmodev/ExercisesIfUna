//efetuar a leitura de cinco números inteiros diferentes e identificar o maior e o menor valor

import java.util.Scanner;

public class Alg121 {
    public static void main(String[] args) {

        Scanner inSc = new Scanner(System.in);
        int inNumber, forNumber, smaller = 0;

        System.out.printf("%nDigite o 1° número: ");
        inNumber = inSc.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.printf("Digite o %d° número: ", i);
            forNumber = inSc.nextInt();

            if (forNumber > inNumber) {
                inNumber = forNumber;
            } else if (smaller > forNumber || smaller == 0) {
                smaller = forNumber;
            }
        }
        if (inNumber < 0 && smaller < 0) {
            System.out.printf("%nOs números digitados estão errados.");
        } else if (inNumber == smaller) {
            System.out.printf("%nOs números digitados estão iguais.");
        } else {
            System.out.printf("%nO maior número é %d e o menor número é %d.%n", inNumber, smaller);
        }

        inSc.close();
    }
}
