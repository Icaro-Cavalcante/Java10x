public abstract class Ninja implements estrategiaDeBatalha {
    String nome;
    int idade;
    String aldeia;
    Patente patente;
    int numero_missoes;

    // Criando um metodo público



    // String retorna uma string

    public int ate_jonin(int missoes) {
        if (missoes < 50) {
            return 50 - missoes;
        }
        else {
            return 0;
        }
    }

    public abstract String ataque_especial();



    public Ninja(Patente patente, String aldeia, int idade, String nome) {
        this.patente = patente;
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
    }

    // Sobrecarga de métodos, você não precisa redeclarar o construtor só novos atributos
    public Ninja(Patente patente, String aldeia, int idade, String nome, int numero_missoes) {
        this(patente, aldeia, idade, nome);
        this.numero_missoes = numero_missoes;
    }

    public Ninja() {

    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é a estratégia de batalha de " + nome);
    }

    // int retorna um int
}