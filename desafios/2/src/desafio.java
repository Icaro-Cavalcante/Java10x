import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int tamanho = 10;
        int numero_ninjas = 0;
        Scanner scanf = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String[] array = new String[10];
        int posicao = -1;
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Sistema de cadastro de ninjas\n------------------\n1 - Cadastrar ninja\n2 - Listar ninjas\n3 - Sair\nSua escolha: ");
            escolha = scanf.nextInt();
            System.out.println("");
            switch (escolha) {
                case 1:
                    if (tamanho != 0) {
                        posicao++;
                        System.out.println("Diga o nome do seu ninja: ");
                        String nome_ninja = input.nextLine();
                        array[posicao] = nome_ninja;
                        System.out.println("Ninja criado.");
                        tamanho--;
                        numero_ninjas++;
                        System.out.println("Você pode cadastrar mais " + tamanho + " ninjas.\n");
                        break;
                    } else {
                        System.out.println("Não é possível cadastrar mais ninjas\n");
                        break;
                    }
                case 2:
                    if (array[0] != null) {
                        for (int i = 0; i < numero_ninjas; i++) {
                            System.out.println("Ninja " + (i+1) + ": " + array[i]);
                        }
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Nenhum ninja cadastrado.\n");
                        break;
                    }
                case 3:
                    break;
                default:
                    System.out.println("Faça uma escolha válida.");
            }
        }
    }
}
