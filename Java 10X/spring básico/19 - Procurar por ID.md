Em geral a função de buscar por ID no services se assemelha a isso

```java
    public UsuarioModel consultarUsuarioID(Long id) {
        Optional<UsuarioModel> usuario_consultado = usuarioRepository.findById(id);
        return usuario_consultado.orElse(null);
    }
```

Usamos o optional para evitar null pointer exceptions caso o resultado for nulo

Para chamar esse método no controller, vamos ter que usar path variaes para saber qual usuário vamos consultar.

```java
@GetMapping("/consultar_usuario/{id}")
    public UsuarioModel consultar_usuario(@PathVariable Long id) { return usuarioService.consultarUsuarioID(id); }
```

Colocamos a path variable entre chaves e para usá-la no método usamos a annotation @PathVariable

Assim quando essa rota for acessada com um determinado id na url, serão mostrados os dados do usuário caso ele exista