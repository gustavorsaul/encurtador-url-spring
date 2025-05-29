# Desafio Backend – Encurtador de URL

Projeto de encurtador de URL desenvolvido em **Spring Boot** com **MongoDB**.

## Tecnologias
- Java + Spring Boot
- MongoDB (via Docker)
- MongoDB Compass (visualização)

## Funcionalidades
- Gerar URLs curtas.
- Redirecionar para a URL original via `{id}`.
- URLs expiram após 1 minuto (tempo determinado no endpoint).

## Endpoints

### Criar URL curta
- **POST** `/shorten-url`
- **Body:**
```json
{ 
    "url": "https://exemplo.com" 
}
```
-**Response:**
```json
{
  "shortenedUrl": "http://localhost:8080/abc123"
}
```

### Redirecionar para URL original
- **GET** `/{id}`

- Se o id existir e não estiver expirado, redireciona para a URL original.


## Execução

- Para a correta execução do programa, deve-se entrar na pasta `/docker` e executar dentro dela no terminal o comando `docker compose up`.
- Com o container no ar, é possível acompanhar as atualizações do banco de dados dentro do `MongoDB Compass`, acessando o aplicativo e adicionando a porta e os dados corretos nas configurações de conexão.
- Após o container em execução e o MongoDB configurado, é possível executar a aplicação Java, pela classe `Application.java` ou pelo terminal na pasta raiz do projeto com o comando `mvn spring-boot:run`.
- Após isso, será possível testar as URLs por meio de programas API Client, como Postman, utilizando o formato de requisições POST com a estrutura JSON presente na parte dos `Endpoints`.
