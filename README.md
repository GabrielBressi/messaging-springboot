# Mensageria com Kafka e Spring

Este é um simples sistema composto por 2 serviços, um Produtor e outro Consumidor.
O Produto apenas envia uma mensagem usando o kafka, enquanto o Consumindor "escuta" o serviço Produtor.

## Pré-requisitos
- Java 17 ☕
- Spring Boot 3.2.4 🍃
- Maven ou Gradle
- Docker & docker-compose

1. Clone o repositório:

```bash
git clone https://github.com/GabrielBressi/messaging-springboot
```

2. Importe o projeto em sua IDE favorita (Recomendo o Intellij Idea)<br/>
3. Execute o docker-compose para levantar os serviços do zookeeper e kafka
```bash
docker-compose up
```

4. Execute a aplicação Spring Boot.

### Uso
A aplicação contêm apenas um endpoint.

```bash
GET /kafka/hello/{name} - Retorna uma mensagem : "Hello, {name}"
```

### Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir um PR para melhorias, correções de bugs ou novos recursos.
