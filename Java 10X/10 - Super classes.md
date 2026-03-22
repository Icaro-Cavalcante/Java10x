Super classes podem ter infinitas subclasses (filhos), mas sub classes podem ter apenas uma superclasse (pai).

Usamos super para herança nos construtores
```java
public Uzumaki(String patente, String aldeia, int idade, String nome) {  
    super(patente, aldeia, idade, nome);  
}
```

Sub classes 
> Classe filha que herdam atributos e métodos de apenas uma classe mãe (superclasse)

Super classes
> Classe mãe que passa através de herança atributos e métodos pra suas classes filhas (subclasses)