
O JPA serve como abstração de queries do banco de dados. Para usar ele como repository vamos fazer assim

```java
import org.springframework.data.jpa.repository.JpaRepository;
```

```java
public interface nome_interface extends JpaRepository<NomeClasse, tipo_de_dado_do_id>
```

## O que é uma query?

> Basicamente são operações que a gente faz no banco de dados, como select create update delete

## O que é um ORM

> Object Relational Maping, é uma forma de abstrair as operações do banco de dados. Nós podemos interagir com o banco de dados usando classes objetos e métodos sem precisar escrever sql
