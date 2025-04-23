package aula07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		while(true) {
				System.out.println("************************************");
			 	System.out.println("\nMenu:");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Finalizar o programa");
	            System.out.println("\nDigite uma opção: ");
	            System.out.println("**************************************");
	            int opcao = leia.nextInt();
	            		
	            leia.nextLine();
	            
	            switch (opcao){
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("\nFila:");
                    for (String cliente : fila) {
                        System.out.println(cliente);
                    }
                    System.out.println("\nCliente Adicionado!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        System.out.println("\nLista de Clientes na Fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        fila.poll(); 
                        System.out.println("\nFila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                        System.out.println("\nO Cliente foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
		}
		
		
		}
	
	
			}
		
	}
