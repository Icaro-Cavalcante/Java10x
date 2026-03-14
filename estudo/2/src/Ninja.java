public class Ninja {
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

    public void ataque_especial() {
        System.out.println("Meu nome é " + nome + " e esse é meu poder especial de ninja.");
    }

    // int retorna um int
}