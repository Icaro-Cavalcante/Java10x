package tipos_dados;

public class dados_nao_primitivos {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos para ele
         */

        String nome = "Itachi Uchiha";
        String nometoUpperCase = nome.toUpperCase();
        System.out.println(nome + " - Nome normal");
        System.out.println(nometoUpperCase + " - Nome em upper case");

        String clan = "Uchiha";
        String clantoLowerCase = clan.toLowerCase();
        System.out.println(clantoLowerCase + " - Clan em caixa baixa");
    }
}
