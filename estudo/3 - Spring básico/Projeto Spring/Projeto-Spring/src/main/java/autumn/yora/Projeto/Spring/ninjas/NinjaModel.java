package autumn.yora.Projeto.Spring.ninjas;

import autumn.yora.Projeto.Spring.missao.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @Column(unique = true)
    private String email;
    // ManyToOne um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missao_id") // Foreign key
    private Long id_missao;

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
