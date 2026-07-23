package autumn.yora.Projeto.Spring.ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas () {
        return ninjaRepository.findAll();
    }

    public NinjaModel consultarNinjaID(Long id) {
        Optional<NinjaModel> ninja_consultado = ninjaRepository.findById(id);
        return ninja_consultado.orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel novo_ninja) {
        return ninjaRepository.save(novo_ninja);
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }

    public void deletarNinja(Long id) {
        ninjaRepository.deleteById(id);
    }
}
