public class Uchiha extends Ninja{
    String habilidadeEspecial;

    @Override
    void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nMissão: " + missao + "\nNivel de dificuldade: " + nivelDificuldade + "\nStatus da missão: " + statusMissao + "\nHabilidade especial: " + habilidadeEspecial + "\n");
    }
}
