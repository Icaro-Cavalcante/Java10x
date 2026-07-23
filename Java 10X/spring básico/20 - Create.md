
Create é a operação C do CRUD, a qual cadastra uma entidade no banco de dados

```java
    public UsuarioModel criarUsuario(UsuarioModel novo_usuario) {
        return ninjaUsuario.save(novo_usuario);
    }
```

Assim é a forma que cadastramos um usuário dentro da seção service de uma aplicação, o método save presente no repository demanda um objeto e salva a entidade no banco de dados.

```java
@PostMapping("/criar_usuario")
    public UsuarioModel criar_ninja(@RequestBody UsuarioModel novo_usuario) { return usuarioService.criarUsuario(novo_usuario); }

```

No controller usamos o método http post, o qual permite a criação. dentro do parâmetro do método usamos a annotation request body para solicitar um body em json para criar a entidade com base nos atibutos do seu objeto. E nós retornamos o método do services com o parâmetro esse objeto que foi criado a partir do json recebido