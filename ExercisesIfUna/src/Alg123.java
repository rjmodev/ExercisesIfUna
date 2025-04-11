//ler três números, os possíveis lados de um triângulo, e imprimir a classificação segundo os
//lados
import java.util.Scanner;

public class Alg123 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o 1° valor: ");
        int n1 = in.nextInt();

        System.out.print("Digite o 2° valor: ");
        int n2 = in.nextInt();

        System.out.print("Digite o 3° valor: ");
        int n3 = in.nextInt();

        if(n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1){
            System.out.printf("%nOs valores %d cm, %d cm e %d cm, são lados de um triâgulo do tipo:", n1, n2, n3);

            if(n1 == n2 && n1 == n3){
                System.out.printf(" Equilátero%n");
            }else if(n1 == n2 || n1 == n3 || n2 ==n3){
                System.out.printf(" Isóceles%n");
            }else{
                System.out.printf(" Escaleno%n");
            }
        } else {
            System.out.printf("%nOs valores %d cm, %d cm e %d cm, não são lados de um triâgulo", n1, n2, n3);
        }
        in.close();
    }
}