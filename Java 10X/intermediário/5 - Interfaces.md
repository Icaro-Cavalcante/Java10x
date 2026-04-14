> Diferente das classes, as interfacem não podem virar objetos. Elas são maleáveis e é bom dar preferencia a interfaces no lugar de classes. Também não herdam de uma classe.

Sintaxe:

```java
public interface nome_interface {
}
```
Métodos:

```java
void metodo();
```
> Não precisa de public. Não tem corpo. São métodos abstratos.

Herdando uma interface:
```java
public class nome_classe implements nome_interface {

}
```

Após isso é necessário declarar os métodos da interface

```java
public void metodo() {
	System.out.println("Hello, world!")
}
```
