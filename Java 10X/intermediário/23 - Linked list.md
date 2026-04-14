## Teoria

Toda lista encandeada tem pelo menos dois atributos, o valor e um ponteiro apontando para o próximo elemento da lista.

```c
struct List {
	int valor;
	List* proximo;
};
```

Struct da lista em c 

Listas encadeadas são melhores para trabalhar com vários dados, pois caso um dos elementos da lista sejam deletadas, aqui não é necessário reordenar diversos elementos, só alterar o elemento apontado por alguns ponteiros de alguns elementos. 

Isso faz das listas encandeadas excelentes para lidar com um grande número de dados

## O que são collections?

> São interfaces que usamos nas nossas estruturas de dados

![[Pasted image 20260414112207.png]]


ArrayList, LinkedList e Stack são classes que implementam a interface de List

## Código

Importe a biblioteca

```java
import java.util.LinkedList;
```

Inicialização

```java
LinkedList<String> lista = new LinkedList<>();
```