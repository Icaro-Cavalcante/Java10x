## Problemas resolvidos

> `Segurança` - Encapsular nossas classes e atributos ajuda a segurança dos nossos dados
> `Code Review` - Facilita a leitura do código para futuras atualizações
> `Padronização` - Força todos a usarem Get e Set para alterar os valores no código

## Deixando atributos privados

```java
private atributo;
```
## Getters

> Pegam atributos

Sintaxe:
```java
public tipo getAtributo() {
	return atributo;
}
```

## Setters 

> Modificam atributos

Sintaxe:
```java
public void setAtributo(tipo atributo) {
	this.atributo = atributo;
}
```

## Shortcuts

Com o comando alt insert é possível criar getters e setters automaticamente pelo intellij

## Depois do encapsulamento

Para receber os atributos você agora usa o método getAtributo(); e para alterar o atributo agora você usa o setAtributO(atributo);