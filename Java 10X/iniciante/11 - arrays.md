> uma estrutura de dados que armazena uma coleção de elementos de um mesmo tipo primitivo, organizados em uma sequência e acessados através de um índice.

Sintaxe:
```java
tipo[] nome_array = new tipo[tamanho];
```
inserindo valores:
```java
nome_array[posicao] = valor;
```
para iterar sobre cada elemento usamos um for:
```java
for (int i = 0; i < tamanho; i++) {  
    System.out.println(nome_array[i]);  
}
```
Inicialização:
```java
String: NULL
int: 0
boolean: false
```
Para saber o tamanho do array:
```java
nome_array.length
```

Se o array for declarado novamente:
```java
nome_array = new tipo[tamanho];
```
ele vai ser sobrescrito (portanto vazio) pelo garbage collector.