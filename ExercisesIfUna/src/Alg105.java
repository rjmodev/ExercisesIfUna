/*
* entrar com a sigla do estado de uma pessoa e imprimir umas das mensagens:
o Carioca
o Paulista
o Mineiro
o Outro estado
* */
import java.util.Scanner;

public class Alg105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite a sigla do estado: ");
        String state = in.nextLine().toUpperCase();

        switch (state) {
            case "RJ":
                System.out.printf("%nCarioca%n");
                break;
            case "SP":
                System.out.printf("%nPaulista%n");
                break;
            case "MG":
                System.out.printf("%nMineiro%n");
                break;
            default:
                System.out.printf("%nOutro estado%n");
                break;
        }

        in.close();
    }
}
