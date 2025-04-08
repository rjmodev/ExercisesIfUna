// entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa.
//Não se esqueça de verificar se o ano de nascimento é um ano válido
import java.util.Scanner;

public class Alg103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o ano de nascimento: ");
        int yearBirth = in.nextInt();

        System.out.print("Digite o ano atual: ");
        int yearCurrent = in.nextInt();

        if (yearBirth > 1900 && yearBirth <= yearCurrent) {
            int age = yearCurrent - yearBirth;
            System.out.printf("%nA pessoa tem %d anos de idade", age);
        } else {
            System.out.printf("%nAno de nascimento inválido.");
        }

        in.close();
    }
}
