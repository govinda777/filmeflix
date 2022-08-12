# Filme Flix

Projeto para avaliação do processo seletivo ELO. 

## Tecnologías utilizadas

- Java
- Spring
- JWT
- MongoDB
- Swagger
- Docker
- Maven

## Pré requisitos

- Docker
- Maven

## Como executar

- Passo 1 - execute o comando :

```cmd
mvn clean install
```

- Passo 2 - inicie a aplicação utilizando o docker-compose

```cmd
docker-compose up --force-recreate
```

- Passo 3 - Abra entre na aplicação

## Swagger

http://localhost:8088/swagger-ui.html

## Exemplo de requests

> POST /api/auth/signup

curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \
"email": "govinda777%40gmail.com", \
"password": "123", \
"role": "ROLE_ADMIN", \
"username": "govinda777" \
}' 'http://localhost:8088/api/auth/signup'

> POST /api/auth/signin

curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \
"password": "123", \
"username": "govinda777" \
}' 'http://localhost:8088/api/auth/signin'

> 

## Portas que a aplicação utiliza

- 8088 - Api
- 27017 - MongoDB

## Como criar um usuário ROLE_ADMIN

Rota POST /api/auth/signup

```json
{
  "email": "{qualquer e-mail}",
  "password": "{qualquer password}",
  "role": "ROLE_ADMIN",
  "username": "{qualquer username}"
}
```

## Como criar um usuário normal

Rota POST /api/auth/signup

```json
{
  "email": "{qualquer e-mail}",
  "password": "{qualquer password}",
  "username": "{qualquer username}"
}
```

## Links de Referência utilizados para desenvolver esse projeto 

- https://bezkoder.com/spring-boot-jwt-auth-mongodb/
- https://docs.docker.com/compose/compose-file/
- https://www.marcobehler.com/guides/mvn-clean-install-a-short-guide-to-maven
- https://github.com/springfox/springfox/issues/3052
- https://medium.com/@por.porkaew15/spring-boot-application-and-docker-with-intellij-ide-8d2a843c529e
- https://github.com/spring-guides/gs-spring-boot-docker/tree/master/complete

## O que poderia ter sido desenvolvido melhor 

- 1 - Poderia ter criado um micro serviço responsável apenas pela autenticação.
- 2 - As informações de autenticação poderiam estar pelo menos em um banco de dados diferente
- 3 - Desenvolvimento de testes de unidade]
- 4 - Adicionado um usuário e senha no banco de dados
- 5 - Ao subir a aplicação (docker-compose up) ocorre um erro de conexão da api com o banco, porém após alguns instantes ela se restabelece. Alterei o arquivo docker-compose.yml informando que a api depende do banco, porém não foi o suficiente para solucionar o problema. 
- 6 - Implementação de "annotations" para validar os dados recebidos
- 7 - Criação de evento de captura de exceptions
- 8 - Implementação de logs 


23452352