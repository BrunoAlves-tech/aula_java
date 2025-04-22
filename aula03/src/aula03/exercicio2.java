package aula03;

import java.util.Scanner;

public class exercicio2{

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

            System.out.println("Digite um Numero:");

        int numero = leia.nextInt();

        if (numero % 2 == 0 && numero > 0) {
            System.out.printf("O Numero, %d é par, e é positivo!", numero);
        }
        if (numero % 2 != 0 && numero < 0) {
            System.out.printf("O Numero %d é Impar, e é Negativo!:", numero);
        }
        if (numero % 2 == 0 && numero < 0) {
            System.out.printf("O Numero %d é Par, e é Negativo!:", numero);
        }
        if (numero  % 2 != 0 && numero > 0) {
            System.out.printf("O Numero %d é Impar, e é Positivo!:", numero);
        }
    }
}