A persistência de dados do H2 é feita em arquivos, o que aproxima ele a banco de dados como o sqlite. No entanto, geralmente não usamos bancos de dados assim para sistemas reais, eles são melhores para projetos mesmo

Para salvar o arquivo .db que persiste esses dados, devemos colocar a seguinte database url

jdbc:h2:file:./nome-pasta/nome-arquivo

Ao alterar as variáveis de ambiente, o console do h2 e apertar em save, as alterações do banco de dados ficarão em um arquivo com esse determinado nome