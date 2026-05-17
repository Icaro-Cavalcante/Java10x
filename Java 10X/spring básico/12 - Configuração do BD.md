
## Vamos primeiro adicionar o H2 como dependência

Da mesma forma como fizemos com outras dependências no spring initializer

## Então vamos adicionar o console que não está no spring initializer

```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-h2console</artifactId>
		</dependency>
```


## Para acessar o H2

http://localhost:8080/h2-console


![[Pasted image 20260517113724.png]]

## Agora vamos configurar no application properties

![[Pasted image 20260517113957.png]]

O que é mais importante é essas configurações do daabase.url onde passamos a url do banco de dados que está no h2-console. Depois essas duas configurações para o banco de dados não ser deletado quando a aplicação fechar.

Aí vamos para o username e o password que são os mesmos do h2-console

Por fim colocamos essas configurações no JPA