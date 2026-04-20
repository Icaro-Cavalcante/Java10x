
Lists aceitam elementos duplicados.

## Então surge...

`Set`, o qual é usado para ignorar elementos repetidos na coleção e quando a ordenação não importa

## Importe as bibliotecas

```java
import java.util.HashSet;  
import java.util.Set;
```

## Inicialização

```java
Set<tipo> nome_set = new HashSet<>();
```

Em geral ele faz a mesma coisa de uma lista, tem os mesmos métodos, mas ignora elementos duplicados e não coloca eles na coleção. Além disso, os elementos não tem odenação

## Adicionar elementos de uma lista em um set

```java
nome_set.addAll(nome_lista);
```

Todos os elementos dessa lista serão adicionados ao set

## Remove

Só é possível remover pelo valor e não pelo índice