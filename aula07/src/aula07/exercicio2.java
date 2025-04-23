package aula07;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilhaDeLivros = new Stack<>();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    String livro = scanner.nextLine();
                    pilhaDeLivros.push(livro);
                    listarPilha(pilhaDeLivros);
                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        System.out.println("\nLista de Livros na Pilha:");
                        listarPilha(pilhaDeLivros);
                    }
                    break;

                case 3:
                    if (pilhaDeLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        pilhaDeLivros.pop();
                        listarPilha(pilhaDeLivros);
                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void listarPilha(Stack<String> pilha) {
        System.out.println("\nPilha:");
        for (String livro : pilha) {
            System.out.println(livro);
        }
    }
}

