public class Uchiha extends Ninja {

    // void não retorna nenhum valor
    public void sharingan() {
        System.out.println("Amaterasu!");
    }

    @Override // Anotação para sobrescrever e fazer polimorfismo
    public void ataque_especial() {
        System.out.println("Meu nome é " + nome + " e esse é meu poder especial de Uchiha do estilo fogo.");
    }
}
