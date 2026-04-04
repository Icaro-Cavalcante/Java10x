public class Hyuga extends Ninja {

    @Override
    public String ataque_especial() {
        return getNome() + " ativou o byakugan.";
    }

    public Hyuga(Patente patente, String aldeia, int idade, String nome) {
        super(patente, aldeia, idade, nome);
    }

    public Hyuga (){

    }


}
