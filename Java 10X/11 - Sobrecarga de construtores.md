## TODO
> Serve para alertar a gente de algo que precisa ser feito

```java
//TODO : O que precisa ser feito
```
## Enums

> Serve para determinar um grupo de constantes

```java
public enum Patente {  
    GENIN,  
    CHUNIN,  
    JOUNIN,  
    KAGE  
}
```

## Sobecarga

> Serve principalmente pra quando sua classe te um novo atributo e você cria um novo construtor com ele. Além disso, você mantem o antigo pq você provavelmente usou ele em outras partes do sistema e remover ele pode dar diversos problemas

```java
public Ninja(Patente patente, String aldeia, int idade, String nome, int numero_missoes) {  
    this(patente, aldeia, idade, nome);  
    this.numero_missoes = numero_missoes;  
}
```