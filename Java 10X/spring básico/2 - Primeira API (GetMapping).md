O Backend serve como um intermediário entre o cliente e o banco de dados.

Aqui é o arquivo principal onde a aplicação é rodada

![[Pasted image 20260428121403.png]]
Quando rodar o arquivo, o Spring vai ser inicializado na porta 8080 (Pode ser outra também). Para acessar ela, é só abrir o navegador e digitar localhost:8080/

![[Pasted image 20260428123731.png]]

Acessando vamos ter erro de white label pois não temos nenhuma api para essa página. Uma api não é nada mais que um mapa de rotas

![[Pasted image 20260428124036.png]]

Para acessar ma rota você deve escrever localhost:8080/nome_da_rota

Então vamos criar um controlador para gerenciar essa api

## Controller

No mesmo diretório da aplicação vamos criar uma nova classe (a classe controladora) , que pode ter qualquer nome, mas vamos chamar de controller porque é uma convenção. Então vamos usar uma annotation para esse controlador

### Importe

```java
import org.springframework.web.bind.annotation.RestController;
```

### Use a annotation no começo do cotrolador

```java
@RestController
```

Isso é uma annotation de APIs rest. Além disso vamos usar outra annotation para mapeamento

### Importe

```java
import org.springframework.web.bind.annotation.RequestMapping;
```

### Use a annotation no começo do cotrolador

```java
@RequestMapping
```

Para essa aula vamos usar o método http get, que recebe informações. Para isso vamos usar outra annotation (Prometo que é a última nessa aula)

### Importe

```java
import org.springframework.web.bind.annotation.GetMapping;)
```

### Use a annotation

```java
@GetMapping("/boas-vindas")  
public String metodo() {  
    return "Bem vindo a sua primeira rota";  
}
```

Dentro dos parenteses de Getmapping vamos colocar um / junto com o nome da rota e depois vamos passar o método que vai retornar o valor para essa determinada rota

### Esse é o resultado

![[Pasted image 20260428132904.png]]


