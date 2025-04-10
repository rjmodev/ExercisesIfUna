//entrar com três números e imprimi-lo em ordem decrescente
//Obs: Usando arrays e sort fica muito mais performatico e legível que o código explicito aqui
//Mas por ser uma tarefa em IF optei por fazer dessa forma
import java.util.Scanner;

public class Alg119 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = in.nextInt();

        if(n1 > n2 && n1 > n3){
            if (n3 > n2){
                System.out.printf("%nOs números em ordem decrescente são: %d, %d, %d", n1, n3, n2);
            }else{
                System.out.printf("%nOs números em ordem decrescente são: %d, %d, %d", n1, n2, n3);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n3 > n1){
                System.out.printf("%nOs números em ordem decrescente são: %d, %d, %d", n2, n3, n1);
            }else{
                System.out.printf("%nOs números em ordem decrescente são: %d, %d, %d", n2, n1, n3);
            }
        }else if (n3 > n1 && n3 > n2) {
            if (n1 > n2){
                System.out.printf("%nOs números em ordem decrescente são: %d, %d, %d", n3, n1, n2);
            }else{
                System.out.printf("%nOs números em ordem decrescente são: %d, %d, %d", n3, n2, n1);
            }
        }else{
            System.out.printf("%nOs números estão digitados errados ou iguais.");
        }
        in.close();
    }
}
