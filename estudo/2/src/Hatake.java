public class Hatake extends Ninja implements Sharingan, Anbu {
    @Override
    public String ataque_especial() {
        return "Raikiri";
    }

    public Hatake(String patente, String aldeia, int idade, String nome) {
        super(patente, aldeia, idade, nome);
    }

    @Override
    public void sharingan() {
        System.out.println("Kamui!");
    }

    @Override
    public void NinjaDeElite() {
        System.out.println("Você é um ninja de elite da anbu, agora pode ir em missões de elite.");
    }

    public Hatake() {

    }


}
