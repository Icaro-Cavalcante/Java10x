import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        int opcao;
        int indice;
        Scanner entrada = new Scanner(System.in);

        int ativo = 1;
        LinkedList<Ninja> lista_ninjas = new LinkedList<>();
        while (ativo == 1) {
            System.out.println("===Cadastro de ninjas===");
            System.out.println("1 - Cadastrar ninja\n2 - Remover ninja\n3 - Mostrar lista\n4 - Mostrar ninja\n5 - Sair\nEscolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o nome do seu ninja: ");
                    String nome = entrada.nextLine();

                    System.out.println("\nInforme a idade do seu ninja: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("\nInforme a vila do seu ninja: ");
                    String vila = entrada.nextLine();

                    lista_ninjas.add(new Ninja(nome, idade, vila));

                    System.out.println("\nNinja criado com sucesso!\n");

                    break;

                case 2:
                    System.out.println("\nInforme o índice do ninja que deseja remover: ");
                    indice = entrada.nextInt();
                    entrada.nextLine();

                    Ninja ninja_removido = lista_ninjas.remove(indice);
                    System.out.println(ninja_removido.getNome() + " foi removido.\n");

                    break;

                case 3:
                    System.out.println(lista_ninjas);
                    break;

                case 4:
                    System.out.println("\nInforme o índice do ninja que deseja mostrar: ");
                    indice = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println(lista_ninjas.get(indice));

                    break;

                case 5:
                    ativo = 0;

                    break;
            }
        }
        entrada.close();
    }
}