> O primeiro a entrar é o primeiro a sair

Queue ou fila é uma coleção que segue essa frase. É como uma fila de banco, a primeira pessoa a entrar na fila será a primeira pessoa a sair dela.

`Head` - Próximo elemento a sair
`Tail` - O último elemento que entrou

Importe as bibliotecas:

```java
import java.util.LinkedList;  
import java.util.Queue;
```

Inicialização:

```java
Queue<tipo> nomeFila = new LinkedList<>();
```

> Toda fila é uma linked list

Métodos:

`Add` - Acrescenta elementos à fila

```java
nomeFila.add(elemento);
```
nomepilha
`Poll` - Remove o primeiro elemento da lista

```java
nomeFila.poll();
```

`Peek` - Mostra qual elemento será o próximo a sair da fila (HEAD)

```java
nomeFila.peek();
```

`IsEmpty` - Mostra se a fila está vazia

```java
nomepilha.size();
```