public class ninja2 {
    public static void main(String[] args) {
        String nome = "Sasuke Uchiha";
        int idade = 13;

        String nome_missao = "Aprender chidori";
        String conclusao;
        char dificuldade_missao = 'B';
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
