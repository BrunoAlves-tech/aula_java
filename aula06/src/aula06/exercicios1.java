
package aula06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exercicios1 {
    public static void main(String[] args) {
    	
    	Scanner leia = new Scanner(System.in);
      
    	List<String> listaDeCores = new ArrayList<>();
        

        for(int i= 0; i<5 ;i++ ) {
        	System.out.println("Digite o nome da cor:");
        	String input = leia.next();
        	listaDeCores.add(input);
        }
        System.out.println("Todas as cores:");
        for (String cor : listaDeCores) {
            System.out.println(cor);
        }

        
        Collections.sort(listaDeCores);

        
        System.out.println("\nCores ordenadas:");
        for (String cor : listaDeCores) {
            System.out.println(cor);
        }
    }
}