package generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> lista;

    public BolsaGenerica() {
        this.lista = new ArrayList<>();
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public void adicionarEquipamento(T equipamento) {
        lista.add(equipamento);
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + lista;
    }
}
