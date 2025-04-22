//Exercicio2
package aula05;

import java.util.Scanner;

public class operaçõescomvetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	
		System.out.printf("Digite o tamanho do vetor: ");
		int tamanhoVetor = leia.nextInt();
		
		float media = 0;
		int auxPar = 0,indexPar = 0, soma = 0, i;
		int vetor[] = new int[tamanhoVetor];
		
		System.out.println("############################");
		System.out.println("--- Opera��es com VETOR ---");
		System.out.println("############################");
		
		
	
		for(i = 0; i < vetor.length;  i++) {
			System.out.printf("Digite o %d� valor: " , i+1);
			vetor[i] = leia.nextInt();
			

			soma += vetor[i];
	
			if(vetor[i]%2==0) 
				auxPar++;	
		}
		
		media = soma/vetor.length;
        
		
		int vetPar[] = new int[auxPar];
		
		
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i]%2==0) {
				vetPar[indexPar] = vetor[i];
				indexPar++;
			}
		}
		
		System.out.print("\nElementos nas posi��es �mpares:\n");
		for (i = 0; i < vetor.length; i += 2) {
		    System.out.print(vetor[i] + " ");
		}


	
		System.out.print("\n\nElementos pares:\n");
		for (i = 0; i < vetPar.length; i++) {
		    System.out.print(vetPar[i] + " ");
		}

		
		System.out.printf("\n\nSoma: %d\n", soma);
		System.out.printf("M�dia: %.2f\n", media);	
		
		leia.close();
		
	}

}