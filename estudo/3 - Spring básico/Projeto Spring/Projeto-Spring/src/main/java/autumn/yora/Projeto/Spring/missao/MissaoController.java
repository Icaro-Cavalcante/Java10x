package autumn.yora.Projeto.Spring.missao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missoes")

public class MissaoController {
    @GetMapping("/missao")
    public String boas_vindas() {
        return "Essa é sua missão";
    }
}
