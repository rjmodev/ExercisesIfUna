//criar um algoritmo que deixe entrar com dois números e imprimir o quadrado do menor e a
//raiz quadrada do maior número
import java.util.Scanner;
import java.lang.Math;

public class Alg115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        if (n1 < n2){
            int powN1 = (int) Math.pow(n1, 2);
            double sqrtN2 = Math.sqrt(n2);
            System.out.printf("%nO quadrado de %d é %d.", n1, powN1);
            System.out.printf("%nA raiz quadrada de %d é %.2f.", n2, sqrtN2);
        } else {
            int powN2 = (int) Math.pow(n2, 2);
            double sqrtN1 = Math.sqrt(n1);
            System.out.printf("%nO quadrado de %d é %d.", n2, powN2);
            System.out.printf("%nA raiz quadrada de %d é %.2f.", n1, sqrtN1);
        }
        in.close();
    }
}
