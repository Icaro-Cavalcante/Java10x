public class Uchiha extends Ninja implements Sharingan {
    String mangekyou;

    // void não retorna nenhum valor

    //TODO: Mangekyou atributo

    public void sharingan() {
        System.out.println(getNome() + " ativou o sharingan e agora possui a habilidade de percepção aguçada e pode copiar jutsus.");
    }

    @Override // Anotação para sobrescrever e fazer polimorfismo
    public String ataque_especial() {
        return ("Meu nome é " + getNome() + " e esse é meu poder especial de Uchiha do estilo fogo.");
    }

    public void ativarMangekyou() {
        System.out.println(getNome() + " ativou sua habilidade " + mangekyou + " do seu Mangekyou Sharingan.");
    }

    public void ativarMangekyou(String olho_esquerdo, String olho_direito) {
        System.out.println(getNome() + " ativou sua habilidade " + olho_esquerdo + " do seu Mangekyou Sharingan no olho esquerdo.");
        System.out.println(getNome() + " ativou sua habilidade " + olho_direito + " do seu Mangekyou Sharingan no olho direito.");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(Patente patente, String aldeia, int idade, String nome, int numero_missoes) {
        super(patente, aldeia, idade, nome, numero_missoes);
    }

    public Uchiha(Patente patente, String aldeia, int idade, String nome, int numero_missoes, String mangekyou) {
        super(patente, aldeia, idade, nome, numero_missoes);
        this.mangekyou = mangekyou;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nPatente: " + getPatente() + "\nIdade: " + getIdade() + "\nNumero de missões: " + getNumero_missoes() + "\nMangekyou: " + mangekyou;
    }
}
