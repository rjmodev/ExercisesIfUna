//ler três números e imprimir se eles podem ou não ser lados de um triangulo
import java.util.Scanner;

public class Alg122 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o 1° valor: ");
        int n1 = in.nextInt();

        System.out.print("Digite o 2° valor: ");
        int n2 = in.nextInt();

        System.out.print("Digite o 3° valor: ");
        int n3 = in.nextInt();

        if(n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1){
            System.out.printf("%nOs valores %d cm, %d cm e %d cm, são lados de um triâgulo", n1, n2, n3);
        } else {
            System.out.printf("%nOs valores %d cm, %d cm e %d cm, não são lados de um triâgulo", n1, n2, n3);
        }
    in.close();
    }
}
