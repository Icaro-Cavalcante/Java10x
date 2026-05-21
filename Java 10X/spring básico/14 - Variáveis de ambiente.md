É bem comum que hackers rodem bots no github para buscar por senhas de banco de dados, chaves de apis e outros dados sensíveis.

As variáveis de ambiente e env servem justamente para resolver esse problema, já que as url do banco de dados, senhas e tudo tem que estar na aplicação de alguma forma e não podemos mandar esses dados para o github pelo que eu falei acima.

## Como funciona?

Na raiz do projeto você cria um arquivo chamado .env. Nele você vai pegar o que não pode ser público (senha, urls etc...) e vai associar elas a uma variável genérica.

```env
DATABASE_URL = https://url-do-banco-de-dados
```

Aí no lugar de colocar esses dados sensíveis nas propriedades da aplicação vamos passar eles como variáveis. É preciso colocar o $ e entre {} o nome da variável

```java
spring.datasource.url=${DATABASE_URL}
```

## Mas vai dar erro

Então vamos pra nossa aplicação, onde o sistema é rodado e acessar essa configuração

![[Pasted image 20260521113010.png]]

Aqui vamos cria uma aplicação e passar as variáveis de ambiente

## Por fim

Dentro do gitignore coloque o .env e pronto
