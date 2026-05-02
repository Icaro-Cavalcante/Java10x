## O que é uma entidade?

> Algo físico no banco de dados


## Vamos primeiro criar a classe ninja

Pra isso vamos criar uma classe chamada ninja model. Além do mais os atributos dessa classe vão ser colunas do banco de dados, então devemos adicionar um atributo chamado id para poder diferenciar cada uma das entidades no nosso banco.

## Como trabalhar com o id

Nesse caso não vamos usar esse atributo nos construtores e getters e setters, pois o próprio java vai autoincrementar o id nas tabelas do banco de dados.

## Vamos adicionar o entity

O entity serve para criarmos entidades e termos persistência de dados dentro da nossa aplicação. No entanto, temos que baixar a dependência. O spring initializer salva os projetos recentes que você salvou então você pode ir lá e adicionar novas dependências

## Adicionando o JPA

![[Pasted image 20260430141910.png]]

O JPA (Java Persistence API) é a dependência que precisamos. Depois de adicionar vamos ir em explore.

![[Pasted image 20260430142440.png]]

E vamos achar no pom.xml a dependência do jpa e podemos copiar ela

![[Pasted image 20260430142559.png]]

No IntelliJ, vamos colar a dependência e clicar nessa opção

![[Pasted image 20260430142724.png]]

Assim podemos adicionar novas dependências no projeto sem problema

## Importe a biblioteca

```java
import jakarta.persistence.*;
```

## Usando o entity

```java
@Entity
public class nome_classe {

}
```

O entity resumidamente transforma uma classe em uma entidade do banco de dados

## Usando o table

```java
@Entity
@Table(name = "nome_tabela")
public class nome_classe {

}
```

Junto ao entity vamos sar outra annotation chamada table, a qual transforma a classe em uma tabela.

## Id e GenerateValue

```java
public class nome_classe {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
```

Aqui a annotation id vai reconhecer o atributo embaixo dela como o id da tabela e o generate value serve para escolher a forma como isso vai ser ordenado e gerado no banco de dados (isso pode ser escolhido no stratey)