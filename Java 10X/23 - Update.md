> O update do CRUD atualiza informações das instâncias no banco de dados

```java
public UsuarioModel atualizarUsuario(Long id, UsuarioModel usuarioAtualizado) {
	if (usuarioRepository.existsById(id)) {
		usuarioAtualizado.setId(id);
		return usuarioRepository.save(usuarioAtualizado);
	}
	return null;
}
```

Na camada de serviço nós recebemos o id e o objeto com a instância com dados atualizados. Depois checamos se o ID existe e se sim nós pegamos o id informado e colocamos no objeto atualizado (esse é o único atributo vazio do objeto) e usamos o método save do usuário assim como fazíamos no create.


```java
@PutMapping("/alterar_usuario/{id}")
public String alterar_usuario(@PathVariable Long id, @RequestBody UsuarioModel usuarioAtualizado) {
	usuarioService.atualizarUsuario(id, usuarioAtualizado);
	return "Usuário alterado";
}
```

No controller nós usamos o método http put e assim como no delete usamos path variable e assim como no create nós usamos o request body. Nós passamos um json com os mesmos dados do create 

