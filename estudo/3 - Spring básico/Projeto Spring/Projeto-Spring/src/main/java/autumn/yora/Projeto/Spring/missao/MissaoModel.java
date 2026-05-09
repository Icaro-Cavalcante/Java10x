package autumn.yora.Projeto.Spring.missao;

import autumn.yora.Projeto.Spring.ninjas.NinjaModel;
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
    private Long id;
    private String dificuldade;
    private String descricao;
    private String nome;
    @OneToMany(mappedBy = "missao")
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
