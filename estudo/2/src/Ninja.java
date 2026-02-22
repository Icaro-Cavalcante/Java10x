public class Ninja {
    String nome;
    int idade;
    String aldeia;
    String patente;

    // Criando um metodo público

    // void não retorna nenhum valor
    public void sharingan() {
        System.out.println("Amaterasu!");
    }

    // String retorna uma string

    public String rasengan() {
        return "Rasengan";
    }

    public int ate_jonin(int missoes) {
        if (missoes < 50) {
            return 50 - missoes;
        }
        else {
            return 0;
        }
    }

    // int retorna um int
}