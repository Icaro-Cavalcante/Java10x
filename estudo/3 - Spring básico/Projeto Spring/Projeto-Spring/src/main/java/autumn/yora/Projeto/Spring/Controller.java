package autumn.yora.Projeto.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controller {
    @GetMapping("/boas-vindas")
    public String boas_vindas() {
        return "Bem vindo a sua primeira rota";
    }
}
