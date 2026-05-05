package autumn.yora.Projeto.Spring.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class MissaoController {
    @GetMapping("/missoes")
    public String boas_vindas() {
        return "Essa é sua missão";
    }
}
