public class ninja1 {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        int idade = 15;

        String nome_missao = "Aprender rasen shuriken";
        String conclusao;
        char dificuldade_missao = 'A';
        boolean status;

        if (idade < 15) {
            if (dificuldade_missao != 'C' || dificuldade_missao != 'D') {
                status = false;
            }
            else {
                status = true;
            }
        }
        else {
            status = true;
        }

        if (status == false) {
            conclusao = "Não foi concluída";
        }
        else {
            conclusao = "Foi concluída";
        }

        System.out.println("Nome do ninja: " + nome + "\n" + "Idade do ninja: " + idade);
        System.out.println("Nome da missão: " + nome_missao + "\n" + "Dificuldade: " + dificuldade_missao + "\n" + "Status: " + conclusao);
    }
}