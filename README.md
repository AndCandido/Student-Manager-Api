# Student Manager Api

Sistema Back-end para gerenciamento de alunos, projeto requisitado em processo seletivo

## Tecnologias e Bibliotecas utilizadas
- Spring Boot
- Java 21
- Spring Data JPA, Spring Validators, Spring Web
- Banco de Dados Mysql 8

## Requisitos para executar o projeto
- JDK 21
- Maven 3.9.9
- Banco de dados MySql 8
- Porta 8080 livre

## Como executar o projeto
Importe o projeto em sua IDE ou 
Execute os seguintes comandos em seu terminal

importe e entre no projeto
```shell
git clone https://github.com/AndCandido/Student-Manager-Api.git
cd Student-Manager-Api
```
Crie um Schema com o nome de sua preferência no banco de dados MySql. Defina as seguintes variáveis de ambiente para o acesso ao banco de dados
```shell
set DATABASE_URL=jdbc:mysql://localhost:3306/students-manager-quality-sistemas #link para o banco com o nome da schema
set DATABASE_USERNAME=root #seu usuário do banco de dados
set DATABASE_PASSWORD=123 #sua senha do banco de dados
```
*para linux ou mac, troque `set` por `export`*

Execute o projeto utilizando  o maven
```shell
mvn spring-boot:run
```

## Utilizando o projeto
Após concluir todos os passos, o projeto iniciará na porta `8080`, estando disponível a rota `/students`,
para acessar os recursos acesse o link `http://localhost:8080/students`. Desta rota, está disponível requisições para os métodos `GET`, `POST`, `PUT` e `DELETE`. 

Com o servidor sendo executado, inicie o client em [Student-Manager-Client](https://github.com/AndCandido/Student-Manager-Client/)
