# DSStock - Sistema de Estoque (API Java Spring)

Este projeto é uma API REST para gerenciamento de estoque de produtos, desenvolvida como parte de uma aula introdutória de Java e Spring Boot do canal DevSuperior. O sistema permite a consulta paginada de produtos, utilizando um banco de dados em memória (H2).

## Sobre o Projeto
O projeto foi criado seguindo o tutorial "Introdução API web com Java e Spring" do Professor Nélio Alves.

O objetivo é demonstrar a construção de uma aplicação Back-end com as seguintes características:
* Criação de projeto Spring Boot.
* Configuração de banco de dados H2.
* Mapeamento Objeto-Relacional (JPA/Hibernate).
* Seeding de banco de dados (carga inicial de dados).
* Criação de endpoints REST com suporte a paginação e ordenação.

## Tecnologias Utilizadas

* Java (versão LTS: 17 ou 21 recomendadas)
* Spring Boot
* Maven
* JPA / Hibernate
* H2 Database (Banco de dados em memória)

## Funcionalidades

* Entidade de Domínio: Representação de Produtos (Product) com ID, nome, preço e quantidade.
* Banco de Dados em Memória: Configuração automática e acesso via console web.
* Carga Inicial de Dados: Script import.sql para popular o banco automaticamente ao iniciar.
* API REST: Endpoint para listagem de produtos.
* Paginação e Ordenação: Recursos nativos do Spring Data para controlar o volume de dados retornados.

## Como Executar o Projeto

### Pré-requisitos
* Java JDK instalado.
* IDE de sua preferência (IntelliJ IDEA, Eclipse/STS).
* Git.
* Postman (opcional, para testar as requisições).

### Passo a Passo
1. Clone o repositório:
   git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git

2. Abra o projeto na sua IDE.

3. Execute a aplicação:
   Localize a classe principal DsStockApplication.java e execute-a.

4. Acesse o Console H2 (Opcional):
   No navegador, vá para: http://localhost:8080/h2-console
   Certifique-se de que a JDBC URL está correta (ex: jdbc:h2:mem:testdb, verifique o arquivo application.properties).

## Endpoints da API

A API roda por padrão na porta 8080.

### Listar Produtos (Paginado)
Retorna uma lista paginada de produtos.

* URL: /products
* Método: GET
* Exemplos de Requisição:

  - Listar página 0 (padrão):
    http://localhost:8080/products

  - Listar página 1:
    http://localhost:8080/products?page=1

  - Alterar tamanho da página (10 itens):
    http://localhost:8080/products?size=10

  - Ordenar por nome:
    http://localhost:8080/products?sort=name

  - Ordenar por preço (decrescente):
    http://localhost:8080/products?sort=price,desc

## Créditos

Projeto desenvolvido com base na aula do DevSuperior.
* Professor: Nélio Alves
* Canal: DevSuperior no YouTube
* Vídeo Original: https://www.youtube.com/watch?v=wRQSzWTpr6A
