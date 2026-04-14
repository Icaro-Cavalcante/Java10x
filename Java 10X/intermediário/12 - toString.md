> Modifica o que aparece quando você printa um objeto


Normalmente quando você printa um objeto em java, é mostrado seu endereço de memória. No entanto, é possível modificar isso.

Ao usar o método toString, você altera o que é retornado na função


## Sintaxe:

```java
@Override  
public String toString() {  
    return "Texto";  
}
```