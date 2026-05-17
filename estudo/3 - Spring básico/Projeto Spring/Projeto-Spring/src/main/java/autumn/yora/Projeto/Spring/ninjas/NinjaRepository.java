package autumn.yora.Projeto.Spring.ninjas;

import autumn.yora.Projeto.Spring.missao.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<MissaoModel, Long> {

}
