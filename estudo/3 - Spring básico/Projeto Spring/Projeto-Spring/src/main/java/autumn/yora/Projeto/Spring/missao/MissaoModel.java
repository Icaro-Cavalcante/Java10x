package autumn.yora.Projeto.Spring.missao;

import autumn.yora.Projeto.Spring.ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "dificuldade")
    private String dificuldade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "missao")
    @JsonIgnore
    private List<NinjaModel> ninjas;

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
