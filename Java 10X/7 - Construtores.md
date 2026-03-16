## NoArgs Constructor

> Um construtor que vem vazio, não necessariamente recebe argumento nenhum.

```java
public Hokages () {  
    // Construtor vazio, sem argumentos  
}
``` 

AllArgs Constructor

> Um construtor que é preenchudo com todos os atributos da classe

```java
public Hokages(String nome, int idade, Boolean vivo_ou_nao) {  
    this.nome = nome; // All args constructor  
    this.idade = idade;  
    this.vivo_ou_nao = vivo_ou_nao;  
}
```

alt + insert para criar construtores automaticamente com o generate