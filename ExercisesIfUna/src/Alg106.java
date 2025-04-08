//entrar com o nome e imprimi-lo se o primeiro caractere for a letra A (considerar letra
//maiuscula ou minuscula)
import java.util.Scanner;

public class Alg106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o nome da pessoa: ");
        String name = in.nextLine();

        if (!name.isEmpty() && Character.toUpperCase(name.charAt(0)) == 'A') {
            System.out.printf("%nA pessoa começa com a vogal A e se chama: %s%n", name);
        }

        in.close();

    }
}
