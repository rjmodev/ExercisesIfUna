//Entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o
//quadrado do número caso ele seja negativo

import java.util.Scanner;
import static java.lang.Math.*;

public class Alg93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%nDigite qualquer número inteiro: ");
        float number = in.nextInt();

        if(number < 0){
            number = (float)pow(number, 2);
            System.out.printf("O quadrado do número é %d%n", round(number));
        } else if (number > 0) {
            number = (float)sqrt(number);
            System.out.printf("A raiz quadrada do número é %.2f%n", number);
        }

    }

}

