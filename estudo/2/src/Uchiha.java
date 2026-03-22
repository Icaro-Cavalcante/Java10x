public class Uchiha extends Ninja {

    // void não retorna nenhum valor
    public void sharingan() {
        System.out.println("Amaterasu!");
    }

    @Override // Anotação para sobrescrever e fazer polimorfismo
    public String ataque_especial() {
        return ("Meu nome é " + nome + " e esse é meu poder especial de Uchiha do estilo fogo.");
    }

    public Uchiha(String patente, String aldeia, int idade, String nome) {
        super(patente, aldeia, idade, nome);
    }

    public Uchiha() {
    }
}
