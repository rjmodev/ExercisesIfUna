//entrar com nome, sexo e a idade de uma pessoa. Se a pessoa for do sexo feminino e tiver
//menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrario, imprimir nome e a
//mensagem: NÃO ACEITA.
import java.util.Scanner;

public class Alg104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o nome da pessoa: ");
        String name = in.nextLine();

        System.out.printf("Digite o sexo da pessoa (M/F): ");
        String sex = in.nextLine().toUpperCase();

        System.out.printf("Digite a idade da pessoa: ");
        int age = in.nextInt();

        if (sex.equals("F") && age < 25) {
            System.out.printf("%n%s: ACEITA", name);
        } else {
            System.out.printf("%n%s: NÃO ACEITA", name);
        }

        in.close();
    }
}
