> Tipo especial de classe que ajuda a diminuir a quantidade de código

Em records todos os atributos são final por padrão e ele não tem setters. Isso torna as classes imutáveis.

Ele cria automaticamente o construtor, os getters, equals, hashcode e toString

Os getters tem o mesmo nome do atributo (ex: nome())

## Sintaxe:

```java
public record Pessoa(String nome, int idade, String email, String senha) {

}
```

Só com essa linha tudo que já é criado