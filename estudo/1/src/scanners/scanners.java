package scanners;

import java.util.Scanner;

public class scanners {
    public static void main(String[] args) {
        /*
        * Scanner - Um jeito de trazer o usuário para dentro da aplicação
        * Objetivo: O usuário vai criar um ninja e vamos validar os dados
         */

        // Abre o scanner
        Scanner texto = new Scanner(System.in);

        // Recebe uma string com nome do ninja
        System.out.println("Seu ninja favorito: ");
        String nome = texto.nextLine();
        System.out.println("Meu ninja favorito é o "+ nome);

        // Recebendo a idade do ninja
        System.out.println("\nA idade do seu ninja favorito: ");
        int idade = texto.nextInt();
        System.out.println(nome + " tem " + idade + " anos.");

        if (idade > 15) {
            System.out.println(nome + " tem mais de 15 anos, " + nome + " já pode ser jounin.");
        }
        else {
            System.out.println(nome + " pode ser apenas chunin.");
        }

        texto.close();
    }
}
