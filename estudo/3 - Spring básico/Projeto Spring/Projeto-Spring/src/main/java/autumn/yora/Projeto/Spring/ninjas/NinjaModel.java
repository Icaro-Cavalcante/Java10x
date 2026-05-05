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
    // ManyToOne um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missao_id") // Foreign key
    private Long id_missao;

    public NinjaModel(String nome, int idade, String email, Long id_missao) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.id_missao = id_missao;
    }

    public Long getId() {
        return id;
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

    public Long getId_missao() {
        return id_missao;
    }

    public void setId_missao(Long id_missao) {
        this.id_missao = id_missao;
    }

    @Override
    public String toString() {
        return "NinjaModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", id_missao=" + id_missao +
                '}';
    }
}
