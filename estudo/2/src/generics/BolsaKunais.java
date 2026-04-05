package generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunais {
    private List<Kunai> lista_kunais;

    public List<Kunai> getLista_kunais() {
        return lista_kunais;
    }

    public void setLista_kunais(List<Kunai> lista_kunais) {
        this.lista_kunais = lista_kunais;
    }

    public BolsaKunais() {
        this.lista_kunais = new ArrayList<>();
    }

    public void adicionar_kunai(Kunai kunai) {
        lista_kunais.add(kunai);
    }

    @Override
    public String toString() {
        return "Bolsa de kunais: " + lista_kunais;
    }
}
