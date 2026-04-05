package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Kunai kunai = new Kunai("Comum");
        Kunai kunai_grande = new Kunai("Grande");
        List<Kunai> kunais = new ArrayList<>();
        BolsaKunais bolsa = new BolsaKunais();

        bolsa.adicionar_kunai(kunai);
        bolsa.adicionar_kunai(kunai_grande);

        System.out.println(bolsa);

    }
}
