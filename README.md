# Challenge: Valid password
### Resolução do case proposto por @itidigital para backend develop

## O que vamos precisar?

* JDK 11
* IDE from support Micronaut + Java
* Maven 3.6.3 ou superior
* Git

## Como executar a aplicação?

### Github

1. Clone o repositório em seu diretório local.
    1. Utilize o comando: git clone https://github.com/luizhdteixeira/challenge-valid-password.git

### Projeto

1. Abra o projeto em sua IDE
    1. Execute os comandos Maven: mvn clean install
    
Após concluir o build da aplicação:

`[INFO] --- maven-install-plugin:3.0.0-M1:install (default-install) @ valid-password ---`

`[INFO] Installing C:\Projects\challenge-valid-password\valid-password.app\target\valid-password-0.0.1.jar to C:\Users\luizt\.m2\repository\com\challenge\valid-password\0.0.1\valid-password-0.0.1.jar`

`[INFO] Installing C:\Projects\challenge-valid-password\valid-password.app\pom.xml to C:\Users\luizt\.m2\repository\com\challenge\valid-password\0.0.1\valid-password-0.0.1.pom`

`[INFO] ------------------------------------------------------------------------`

`[INFO] BUILD SUCCESS`

`[INFO] ------------------------------------------------------------------------`

`[INFO] Total time:  13.394 s`

`[INFO] Finished at: 2020-12-04T14:11:09-02:00`

`[INFO] ------------------------------------------------------------------------`

`Process finished with exit code 0`

2. Vá até a classe Application
   1. em: `src/main/java/com/challenge/Application.java`
   2. Execute-a
   
O console deve exibir essa informação:

`[main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 1917ms. Server Running: http://localhost:8080`

## API Password
####{localhost:8080}/password

### Body
`{ "password": {string} }`

### Header
`{ Content-type: application/json }`

### Response
`{ "valid": false }`
    




