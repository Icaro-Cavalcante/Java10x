A camada de serviço ou de negócio chama a camada de repository

Então para usarmos a camada de repository precisamos injetar sua dependência

Primeiramente, vamos colocar a annotation @Service em cima da classe de serviço

Em seguida podemos colocar o construtor ou a annotation @Autowired para injetar dependência

Quando injetar a dependência lembre de deixar o repository final para que ele seja imutável

```java
@Service
public class UsuarioService {
	@Autowired
    private final UsuarioRepository repository;
}
```

ou

```java
@Service
public class UsuarioService {
    private final UsuarioRepository repository;
    
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
}
```

A partir disso nós podemos agora realizar operações com a camada de repository. Por causa do JPA podemos interagir com o banco de dados de maneira mais abstrata sem usar SQL.

```java
    public List<UsuarioModel> listarUsuarios () {
        return repository.findAll();
    }
```

Em seguida podemos injetar a dependência de services no controller para usar essas operações. Ela é feita da mesma forma que injetamos a de repository


Então podemos chamar esse méodo de listarUsuarios no controller:

```java
public List<UsuarioModel> todosUsuarios () {
	return service.listarusuarios();
}
```

Se existirem erros de serialização podemos usar o json ignore