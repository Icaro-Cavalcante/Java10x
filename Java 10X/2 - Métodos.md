> Métodos são funções que uma determinada classe executa

Criando um método void:
```java
public void sharingan() {  
    System.out.println("Amaterasu!");  
}
```
> Métodos void não retornam nada

Criando um método return
```java
public int ate_jonin(int missoes) {  
    if (missoes < 50) {  
        return 50 - missoes;  
    }    else {  
        return 0;  
    }
}
```
> Métodos return retornam um dado de um determinado tipo. Nesse caso é um método return int, então ele retorna um dado int

Parâmetros
> Parâmetros são basicamente variáveis que são passadas aos métodos quando eles são chamados. Nesse exemplo, é recebido o parâmetro de missões concluídas para calcular quantas missões faltam para se tornar jonin.


Chamando um método:
```java
int faltando = sasuke.ate_jonin(35);  
System.out.println(faltando);
```
É printado 15 no terminal