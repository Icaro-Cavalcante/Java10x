
Temos duas annotations para relacionamentos como de ninja e missões

## @OneToMany

Um para muito (1 para N)
Uma missão tem vários ninjas

### Sintaxe:

```java
@OneToMany(mappedBy = "nome_coluna")
```

## @ManyToOne

Muitos para um (N para 1)
um ninja tem uma única missão

### Sintaxe:

```java
    @ManyToOne
    @JoinColumn(name = "nome_foreign_key") // Foreign key
```