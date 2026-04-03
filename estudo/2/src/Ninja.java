public abstract class Ninja implements estrategiaDeBatalha {
    private String nome;
    private int idade;
    private String aldeia;
    private Patente patente;
    private int numero_missoes;

    // Getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public Patente getPatente() {
        return patente;
    }

    public int getNumero_missoes() {
        return numero_missoes;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public void setNumero_missoes(int numero_missoes) {
        this.numero_missoes = numero_missoes;
    }

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