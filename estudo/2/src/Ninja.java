public abstract class Ninja {
    String nome;
    int idade;
    String aldeia;
    String patente;

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

    // int retorna um int
}