//criar um algoritmo que entre com dois nomes e imprimi-los em ordem alfabética
import java.util.Scanner;
import java.util.Arrays;

public class Alg109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[2];

        System.out.printf("%nDigite o nome da primeira pessoa: ");
        names[0] = in.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        names[1] = in.nextLine();

        Arrays.sort(names);

        if (names[0].isEmpty() || names[1].isEmpty()) {
            System.out.printf("%nErro: Nome não pode estar vazio.%n");
        } else if (names[0].equalsIgnoreCase(names[1])) {
            System.out.printf("%nErro: Os nomes não podem ser iguais.%n");
        } else {
            Arrays.sort(names);
            System.out.printf("%nNomes em ordem alfabética:%n");
            System.out.println(names[0]);
            System.out.println(names[1]);
        }

        in.close();
    }
}
