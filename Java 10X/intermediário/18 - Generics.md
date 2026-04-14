## Pra que serve?

- `1` - Deixar código escalável
- `2` - Facilitar manutenção
- `3` - Código reutilizável e genérico

## Sintaxe
```java
public class ClasseGenerica<T> {
	
}
```

Dentro dos <> você pode colocar qualquer coisa, mas é recomendado colocar um T

E agora começa a mágica, é possível colocar tipos genéricos agora

```java
private List<T> lista;
```

Aqui é uma lista genérica que aceita qualquer tipo de lista

```java
public void adicionar_a_lista(T item) {
	lista.add(item);
	}
```

Parâmetro genérico para um método