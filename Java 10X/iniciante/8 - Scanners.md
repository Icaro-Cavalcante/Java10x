## Scanner

>Um jeito de trazer o usuário para dentro da aplicação

## Objetivo

> O usuário vai criar um ninja e vamos validar os dados

`Semelhante ao input do python ou scanf do C`

## Sintaxe:

#### Importe

`import java.util.Scanner;`

depois

`Scanner texto = new Scanner(System.in);`

lendo strings:

```java
System.out.println("Seu ninja favorito: ");  
String nome = texto.nextLine();  
System.out.println("Meu ninja favorito é o "+ nome); 
```

lendo ints:
```java
System.out.println("\nA idade do seu ninja favorito: ");  
int idade = texto.nextInt();  
System.out.println(nome + " tem " + idade + " anos.");
```

usando algumas condicionais em conjunto:
```java
if (idade > 15) {  
    System.out.println(nome + " tem mais de 15 anos, " + nome + " já pode ser jounin.");  
}  
else {  
    System.out.println(nome + " pode ser apenas chunin.");  
}
```

feche o scanner
```texto.close();```