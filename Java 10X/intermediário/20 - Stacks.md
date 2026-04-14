> O último a entrar é o primeiro a sair

Stack ou pilha é uma coleção que segue essa frase. É como uma pilha de pizzas, você deve começar a desempilhar pela última pizza que você colocou.

Importe a biblioteca:

```java
import java.util.Stack;
```

Inicialização:

```java
Stack<tipo> nomepilha = new Stack<>();
```

Métodos:

`Push` - Acrescenta elementos à pilha

```java
nomepilha.push(elemento);
```

`Pop` - Remove o último elemento da lista

```java
nomepilha.pop();
```

`Peek` - Mostra qual elemento esta no topo da pilha

```java
nomepilha.peek();
```

`Size` - Mostra o tamanho da pilha

```java
nomepilha.size();
```