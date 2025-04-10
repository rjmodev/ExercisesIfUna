//entrar com três números e armazená-los em três variáveis com os seguintes nomes: maior,
//intermediario e menor
import java.util.Scanner;

public class Alg120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior, intermediario, menor;

        System.out.printf("%nDigite o primeiro número inteiro: ");
        int n1 = in.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = in.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = in.nextInt();

        if(n1 > n2 && n1 > n3){
            maior = n1;
            if(n2 >= n3){
                intermediario = n2;
                menor = n3;
                System.out.printf("%nMaior = %d%nIntermediario = %d%nMenor = %d%n", maior, intermediario, menor);
            }else{
                intermediario = n3;
                menor = n2;
                System.out.printf("%nMaior = %d%nIntermediario = %d%nMenor = %d%n", maior, intermediario, menor);
            }
        }else if(n2 > n1 && n2 > n3){
            maior = n2;
            if(n3 >= n1){
                intermediario = n3;
                menor = n1;
                System.out.printf("%nMaior = %d%nIntermediario = %d%nMenor = %d%n", maior, intermediario, menor);
            }else{
                intermediario = n1;
                menor = n3;
                System.out.printf("%nMaior = %d%nIntermediario = %d%nMenor = %d%n", maior, intermediario, menor);
            }
        }else if(n3 > n1 && n3 > n2){
            maior = n3;
            if(n2 >= n1){
                intermediario = n2;
                menor = n1;
                System.out.printf("%nMaior = %d%nIntermediario = %d%nMenor = %d%n", maior, intermediario, menor);
            }else{
                intermediario = n1;
                menor = n2;
                System.out.printf("%nMaior = %d%nIntermediario = %d%nMenor = %d%n", maior, intermediario, menor);
            }
        }else{
            System.out.printf("%nOs números estão digitados errados ou iguais.");
        }
    in.close();
    }
}
