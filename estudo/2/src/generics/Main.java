package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Equipamento kunai = new Equipamento("Kunai comum");
        Equipamento kunai_grande = new Equipamento("Kunai grande");
        BolsaGenerica bolsa = new BolsaGenerica();

        bolsa.adicionarEquipamento(kunai);
        bolsa.adicionarEquipamento(kunai_grande);

        System.out.println(bolsa);

    }
}
