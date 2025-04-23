package aula06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicios3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Set<Integer> valores = new HashSet<Integer>();
      
        System.out.println("numeros");
        
        System.out.print("\nQuantos números deseja digitar?: ");
        int quantosNumeros = leia.nextInt();

        for (int i = 1; i <= quantosNumeros; i++) {
            System.out.printf("Digite o %dº valor: ", i);
            int input = leia.nextInt();
            valores.add(input);
        }

        Iterator<Integer> iValores = valores.iterator();

        while (iValores.hasNext()) {
            System.out.println(iValores.next());
        }
        leia.close();
    }
}