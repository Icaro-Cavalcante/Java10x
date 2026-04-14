Arrayslist são antipeformáticos

Se quisermos adicionar um item em um arraylist em uma posição já preenchida sem substituir o item anterior dessa posição vamos gastar bastante `memória`. Para reordenar a lista acontecem várias operações.

```java
lista.add("1, Pedro");
```

Pra listas pequenas isso não é perceptível, mas se formos fazer isso em listas maiores isso vira um problema.

## Para Resolver isso...

Temos linked lists