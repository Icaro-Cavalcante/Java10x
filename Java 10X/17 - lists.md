## Qual a diferença de uma lista para um array?

`Arrays` - São estáticos e tem tamanho predefinido

`Lists` - São dinâmicas podem diminuir ou aumentar

## Importe as bibliotecas
```java
import java.util.ArrayList;  
import java.util.List;
```

## Inicialização

```java
List<tipo> nomeList = new ArrayList<>();
```

## Métodos



### Adicionar

```java
nomeList.add(elemento);
```

### Printar

```java
System.out.println(nomeList);
```

não precisa de for

### Remover

```java
nomeList.remove(indice);
```

ou

```java
nomeList.remove(elemento);
```

### Substituir valor

```java
nomeList.set(indice, elemento);
```

Basicamente substitui o valor de um determinado índice

### Tamanho

```java
nomeList.size();
```