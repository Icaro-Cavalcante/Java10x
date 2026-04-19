import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        int opcao, idade, indice;
        String nome, vila;
        Ninja ninja_removido;

        Scanner entrada = new Scanner(System.in);

        int ativo = 1;
        LinkedList<Ninja> lista_ninjas = new LinkedList<>();
        while (ativo == 1) {
            System.out.println("===Cadastro de ninjas===");
            System.out.println("1 - Cadastrar ninja\n2 - Cadastrar ninja no inicio\n3 - Remover ninja por indice\n4 - Remover ninja no inicio\n5 - Mostrar lista\n6 - Mostrar ninja\n7 - Sair\nEscolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o nome do seu ninja: ");
                    nome = entrada.nextLine();

                    System.out.println("\nInforme a idade do seu ninja: ");
                    idade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("\nInforme a vila do seu ninja: ");
                    vila = entrada.nextLine();

                    lista_ninjas.add(new Ninja(nome, idade, vila));

                    System.out.println("\nNinja criado com sucesso!\n");

                    break;

                case 2:
                    System.out.println("\nInforme o nome do seu ninja: ");
                    nome = entrada.nextLine();

                    System.out.println("\nInforme a idade do seu ninja: ");
                    idade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("\nInforme a vila do seu ninja: ");
                    vila = entrada.nextLine();

                    lista_ninjas.push(new Ninja(nome, idade, vila));

                    System.out.println("\nNinja criado com sucesso!\n");

                    break;

                case 3:
                    System.out.println("\nInforme o índice do ninja que deseja remover: ");
                    indice = entrada.nextInt();
                    entrada.nextLine();

                    ninja_removido = lista_ninjas.remove(indice);
                    System.out.println(ninja_removido.getNome() + " foi removido.\n");

                    break;

                case 4:
                    ninja_removido = lista_ninjas.pop();
                    System.out.println(ninja_removido.getNome() + " foi removido.\n");

                    break;

                case 5:
                    System.out.println(lista_ninjas);
                    break;

                case 6:
                    System.out.println("\nInforme o índice do ninja que deseja mostrar: ");
                    indice = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println(lista_ninjas.get(indice));

                    break;

                case 7:
                    ativo = 0;

                    break;
            }
        }
        entrada.close();
    }
}