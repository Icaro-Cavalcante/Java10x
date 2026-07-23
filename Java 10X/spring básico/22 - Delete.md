> O delete do CRUD deleta uma instância do banco de dados

No service ele fica assim:

```java
public void deletarUsuario(Long id) {
	usuarioRepository.deleteById(id);
}
```


No controller fazemos assim:

```java
@DeleteMapping("/deletar_usuario/{id}")
public String deletar_usuario(@PathVariable Long id) {
	ninjaService.deletarUsuario(id);
	return "Usuario deletado";
}
```

Assim como o find by id nós passamos o id como path variable