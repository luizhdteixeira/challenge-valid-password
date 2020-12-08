# Challenge: Valid password
## Resolução do [case][case] proposto por @itidigital para backend develop

## Descrição

Para a solução optei por construir a aplicação com o Framework [Micronaut][Micronaut].

Na aplicação busquei simplicidade na codificação. Utilizei de expressão regular para validar a maioria dos requisitos. 
Utilizei de injeção de dependências por construção e segregação de interfaces para permitir a implementação de personalizada quando necessário.

### Pontos relevantes

* O desafio não pede retorno de exceções, assim bastaria sempre devolver um booleano.
* A URI utilizei o contexto como ´/password´, pois poderá ser utilizável para novos endpoints com novos sub-contextos ou simplesmente para ser identificável.
* Havia uma nota que não seria considerado campos da senha em branco e realizei a validação especificando os carateres especiais válidos, através de expressão regular por facilmente acrescentar novos caracteres caso necessário.  
* Optei por utilizar objetos para Entrada e Resultado por considerar mais legível e possibilitar utilizar o objeto para novos campos necessários em novos endpoints ou métodos existentes.

## O que vamos precisar?

* JDK 11
* IDE from support Micronaut + Java (Suggestion: IDEA Intellij)
* Maven 3.6.3 ou superior
* Git

## Como executar a aplicação?

### Github

1. Clone o repositório em seu diretório local.
    1. Utilize o comando: git clone https://github.com/luizhdteixeira/challenge-valid-password.git

### Projeto

1. Abra o projeto em sua IDE
    1. Navegar no diretório: cd /valid-password.app
    2. Execute os comandos Maven: mvn clean && mvn install

2. Vá até a classe Application
   1. em: `src/main/java/com/challenge/Application.java`
   2. Execute-a
   

## API Password
###{localhost:8080}/password

### Body
`{ "password": {string} }`

### Header
`{ Content-type: application/json }`

### Response
`{ "valid": boolean }`

[case]: https://github.com/itidigital/backend-challenge

[Micronaut]: https://micronaut.io/documentation.html
