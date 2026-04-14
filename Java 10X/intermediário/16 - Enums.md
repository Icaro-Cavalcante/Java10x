## Enums

> Serve para determinar um grupo de constantes e padronizar o código

```java
public enum MetodoPagamento {  
    PIX(0),  
    CREDITO(0.037),  
    DINHEIRO(0),  
    DEBITO(0.0010),  
    BOLETO(0.0015);
}
```

É possível determinar também o atributos a um enum

```java
private double taxa;  
  
public double getTaxa() {  
    return taxa;  
}  
  
public void setTaxa(double taxa) {  
    this.taxa = taxa;  
}  
  
MetodoPagamento(double taxa) {  
    this.taxa = taxa;  
}
```

Em cada constante é possível passar os atributos