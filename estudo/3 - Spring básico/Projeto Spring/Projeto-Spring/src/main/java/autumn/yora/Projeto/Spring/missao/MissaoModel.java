package autumn.yora.Projeto.Spring.missao;

import autumn.yora.Projeto.Spring.ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "missoes")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dificuldade;
    private String descricao;
    private String nome;
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;

    public MissaoModel(String dificuldade, String descricao, String nome) {
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.nome = nome;
    }

    public MissaoModel() {

    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "MissaoModel{" +
                "id=" + id +
                ", dificuldade='" + dificuldade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
