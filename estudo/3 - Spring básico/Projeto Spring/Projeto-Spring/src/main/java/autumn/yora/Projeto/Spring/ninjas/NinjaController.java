package autumn.yora.Projeto.Spring.ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")

public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boas-vindas")
    public String boas_vindas() {
        return "Bem vindo a sua primeira rota";
    }

    // CREATE
    @PostMapping("/criar_ninja")
    public NinjaModel criar_ninja(@RequestBody NinjaModel novo_ninja) { return ninjaService.criarNinja(novo_ninja); }

    // READ
    @GetMapping("/todos_ninjas")
    public List<NinjaModel> mostrar_todos_ninjas() { return ninjaService.listarNinjas(); }

    @GetMapping("/consultar_ninja/{id}")
    public NinjaModel consultar_ninja(@PathVariable Long id) { return ninjaService.consultarNinjaID(id); }

    // UPDATE
    @PutMapping("/alterar_ninja/{id}")
    public String alterar_ninja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        ninjaService.atualizarNinja(id, ninjaAtualizado);
        return "Ninja alterado";
    }

    // DELETE
    @DeleteMapping("/deletar_ninja/{id}")
    public String deletar_ninja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        return "Ninja deletado";
    }
}
