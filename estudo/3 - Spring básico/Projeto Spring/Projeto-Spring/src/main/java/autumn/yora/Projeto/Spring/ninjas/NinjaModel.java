package autumn.yora.Projeto.Spring.ninjas;

import autumn.yora.Projeto.Spring.missao.MissaoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;
    private List<MissaoModel> lista_missoes;

    public NinjaModel(String nome, int idade, String email, List<MissaoModel> lista_missoes) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.lista_missoes = lista_missoes;
    }

    public NinjaModel() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MissaoModel> getLista_missoes() {
        return lista_missoes;
    }

    public void setLista_missoes(List<MissaoModel> lista_missoes) {
        this.lista_missoes = lista_missoes;
    }

    @Override
    public String toString() {
        return "NinjaModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", lista_missoes=" + lista_missoes +
                '}';
    }
}
