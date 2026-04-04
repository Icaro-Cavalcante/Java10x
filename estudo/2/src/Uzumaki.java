public class Uzumaki extends Ninja {

    public String ataque_especial() {
        return getNome() + " usou a esfera em espiral rasengan.";
    }

    public Uzumaki(Patente patente, String aldeia, int idade, String nome) {
        super(patente, aldeia, idade, nome);
    }

    public Uzumaki() {
    }
}
