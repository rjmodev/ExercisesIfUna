//entrar com o nome de uma pessoa e só imprimi-lo se o prenome for JOSE
import java.util.Scanner;

public class Alg107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o nome completo: ");
        String nameFull = in.nextLine();

        String[] partsName = nameFull.trim().split(" ");
        if (partsName.length > 0 && partsName[0].equalsIgnoreCase("JOSE")) {
            System.out.printf ("%nNome com o primeiro nome JOSE: %s", nameFull);
        }

        in.close();
    }
}
