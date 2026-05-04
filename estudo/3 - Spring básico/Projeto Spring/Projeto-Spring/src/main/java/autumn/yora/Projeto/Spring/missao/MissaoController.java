package autumn.yora.Projeto.Spring.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class MissaoController {
    @GetMapping("/boas-vindas")
    public String boas_vindas() {
        return "Bem vindo a sua primeira rota";
    }
}
