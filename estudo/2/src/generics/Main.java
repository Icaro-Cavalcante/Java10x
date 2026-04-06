package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Kunai kunai = new Kunai("Kunai comum");
        Kunai kunai_grande = new Kunai("Kunai grande");

        Shuriken shuriken_comum = new Shuriken("Shuriken comum");
        Shuriken shuriken_chakra = new Shuriken("Shuriken de chakra");

        Pergaminho gamabunta = new Pergaminho("Pergaminho de invocação gamabunta");
        Pergaminho selamento = new Pergaminho("Pergaminho de selamento");



        BolsaGenerica bolsa = new BolsaGenerica();

        bolsa.adicionarEquipamento(kunai);
        bolsa.adicionarEquipamento(kunai_grande);

        bolsa.adicionarEquipamento(shuriken_comum);
        bolsa.adicionarEquipamento(shuriken_chakra);

        bolsa.adicionarEquipamento(gamabunta);
        bolsa.adicionarEquipamento(selamento);




        System.out.println(bolsa);

    }
}
