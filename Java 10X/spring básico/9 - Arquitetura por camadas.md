> Basicamente vamos dividir o sistema em camadas onde cada uma tem sua responsabilidade. Outras arquiteturas famosas são baseadas nessa


## Camada de Apresentação {Controller}

> Está é a camada mais próxima do usuário, no nosso caso a que mais se aproxima são os controllers

## Camada de Serviço (ou Lógica) {Service}

> É onde vai as regras de negócios, aqui tem muito código bruto

Quando o usuário pede algo seu pedido vai para a camada de apresentação, a qual se comunica com a camada de serviço para saber se é possível cumprir sua requisição.

## Camada de Persistência {Repository}

> É a camada mais próxima do banco de dados. Ela interage diretamente com o banco de dados

Para salvar os dados de algo, a camada de persistência é acionada para se comunicar com o banco de dados.

## Camada de banco de dados

> É a camada do banco de dados, seja ele Postgres, MySQL, MongoDB, etc...

# Mas da pra deixar mais detalhado...
.

# Por exemplo: 



.
## Service

## Camada Model

> Uma camada intermediária entre o Service e o Repository. Aqui estão as classes das nossas entidades do banco de dados.

## Camada DTO

> Tipo o model, só que não tem persistência

## Repository
.



.

## Monolito
.
> Quando colocamos todos os nossos códigos no mesmo lugar