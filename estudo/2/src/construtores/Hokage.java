package construtores;

public class Hokage {
    String nome;
    int idade;
    Boolean vivo_ou_nao;
    String poderes;
    String cla;

    public Hokage(Boolean vivo_ou_nao, String poderes, String cla, int idade, String nome) {
        this.vivo_ou_nao = vivo_ou_nao;
        this.poderes = poderes;
        this.cla = cla;
        this.idade = idade;
        this.nome = nome;
    }

    public Hokage() {
    }
}

