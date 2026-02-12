package condicionais;

import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        /*
        * Switch case: Servem para gerar casos especificos
        * Objetivo: Pedir pro usuário escolher entre ninjas
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um ninja:");
        System.out.println("------------------");
        System.out.println("1 - Nagato Uzumaki");
        System.out.println("2 - Itachi Uchiha");
        System.out.println("3 - Deidara\n");

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Nagato Uzumaki foi um shinobi de Amegakure e descendente do clã Uzumaki, conhecido principalmente pelo seu pseudônimo Pain (ペイン), líder da Akatsuki.  Ele cresceu em meio à Segunda Guerra Shinobi, após perder os pais em conflitos com ninjas de Konoha. Juntou-se a outros órfãos, Yahiko e Konan, e foi treinado por Jiraiya, que lhe ensinou ninjutsu.  Após a morte de Yahiko — causada por Hanzo, com a ajuda de Danzo Shimura —, Nagato adotou o nome de Pain e assumiu a liderança da Akatsuki, acreditando que a paz só poderia ser alcançada por meio do medo e da dor. ");
                break;

            case 2:
                System.out.println("A verdadeira motivação por trás do massacre foi revelada posteriormente: Itachi agiu sob ordens dos conselheiros da Vila da Folha para impedir um golpe de Estado do clã Uchiha, que poderia desencadear uma guerra civil e destruir a vila. Ao se tornar um renegado e entrar para a Akatsuki, Itachi atuou como espião, protegendo Konoha em segredo, o que o torna um shinobi leal até o fim.");
                break;
            case 3:
                System.out.println("Deidara (デイダラ) é um ninja renegado de Rank S de Iwagakure e membro da Akatsuki em Naruto Shippuden. Conhecido por sua filosofia artística — \"A arte é uma explosão\" —, ele utiliza argila explosiva combinada com seu chakra, manipulando-a por meio de bocas em suas mãos e peito.  Essa habilidade deriva da Liberação de Explosão (Bakuton), uma Kekkei Genkai que combina naturezas de chakra de Terra e Raio.");
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
    }
}
