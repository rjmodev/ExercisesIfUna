/*
* A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estaduais. O
* valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que
* permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não
* ser concedido
* */
import java.util.Scanner;

public class Alg98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite o salário bruto: R$ ");
        double grossSalary = in.nextDouble();

        System.out.printf("Digite o valor da prestação: R$ ");
        double installmentValue = in.nextDouble();

        double limit = grossSalary * 0.30;

        if (installmentValue <= limit) {
            System.out.printf("%nO empréstimo pode ser concedido de acordo com os requisitos exigidos.%n");
        } else {
            System.out.printf("%nO empréstimo não pode ser concedido, pois não atende os requisitos exigidos.%n");
        }
    in.close();
    }
}
