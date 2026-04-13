Toda lista encandeada tem pelo menos dois atributos, o valor e um ponteiro apontando para o próximo elemento da lista.

```c
struct List {
int valor;
List* proximo;
};
```

Struct da lista em c 

Listas encadeadas são melhores para trabalhar com vários dados, pois caso um dos elementos da lista sejam deletadas, aqui não é necessário reordenar diversos elementos, só alterar o elemento apontado por alguns ponteiros de alguns elementos. 

Isso faz das listas encandeadas excelente para lidar com um grande número de dados