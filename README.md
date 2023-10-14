![visitors](https://visitor-badge.laobi.icu/badge?page_id=christianebs.java-banco-digital-dio) ![GitHub Repo stars](https://img.shields.io/github/stars/christianebs/java-banco-digital-dio) ![GitHub pull requests](https://img.shields.io/github/issues-pr/christianebs/java-banco-digital-dio) ![GitHub closed issues](https://img.shields.io/github/issues-closed/christianebs/java-banco-digital-dio)

# Banco Digital DIO

Este projeto faz parte do módulo "Ganhando Produtividade com Spring Framework e Java" e se propõe a desenvolver uma API REST robusta do zero, aproveitando as inovações do Java 17 e o poder do Spring Boot 3, conhecido por sua autoconfiguração eficiente. Utilizando o Spring Data JPA para simplificar a interação com bancos de dados SQL e o OpenAPI (Swagger) para uma documentação clara, buscamos garantir uma experiência de desenvolvimento produtiva e compreensível. Para simplificar o deploy na nuvem, integramos o Railway, permitindo que os desenvolvedores foquem no desenvolvimento de soluções, enquanto a plataforma facilita o processo de implantação na nuvem, culminando em um projeto que destaca as tecnologias mais recentes e eficientes no ecossistema Java e Spring.

## :woman_mechanic: Linguagens e Ferramentas

![Java](https://img.shields.io/badge/java-0D1117.svg?style=for-the-badge&logo=openjdk&logoColor=%23ED8B00) ![Spring](https://img.shields.io/badge/spring-0D1117.svg?style=for-the-badge&logo=spring&logoColor=%236DB33F) ![Swagger](https://img.shields.io/badge/-Swagger-0D1117?style=for-the-badge&logo=swagger&logoColor=%23Clojure) ![Postgres](https://img.shields.io/badge/postgres-0D1117.svg?style=for-the-badge&logo=postgresql&logoColor=%23316192) ![Railway](https://img.shields.io/badge/Railway-0D1117?style=for-the-badge&logo=railway&logoColor=white) ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-0D1117.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![Git](https://img.shields.io/badge/git-0D1117.svg?style=for-the-badge&logo=git&logoColor=%23F05033) ![GitHub](https://img.shields.io/badge/github-0D1117.svg?style=for-the-badge&logo=github&logoColor=white)

## :large_blue_diamond: Diagrama de Classes

```shell
classDiagram
class User {
+name: string
+account: Account
+card: Card
+features: Feature[]
+news: News[]
}

class Account {
+number: string
+agency: string
+balance: number
+limit: number
}

class Card {
+number: string
+limit: number
}

class Feature {
+icon: string
+description: string
}

class News {
+icon: string
+description: string
}

User --|> Account
User --|> Card
User --|> Feature
User --|> News
```

## :paintbrush: Layout

    - Swagger

![banco-dio](https://github.com/christianebs/java-banco-digital-dio/assets/108686840/04ccce06-55bd-4588-953c-e7c19cac8e6d)

## :link: Links Públicos

- Projeto

[![Railway](https://img.shields.io/badge/reailway-0D1117?style=for-the-badge&logo=railway&logoColor=white)](https://java-banco-digital-dio.up.railway.app/swagger-ui/index.html)

- Dependencias Spring

[![Spring](https://img.shields.io/badge/spring-0D1117.svg?style=for-the-badge&logo=spring&logoColor=%236DB33F)](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.1.4&packaging=jar&jvmVersion=17&groupId=com.github.christianebs&artifactId=java-banco-digital-dio&name=application&description=Java%20RESTful%20API%20criada%20para%20o%20Santander%20Bootcamp%202023%20-%20Backend%20Java&packageName=com.github.christianebs&dependencies=web,data-jpa,h2,postgresql)


## :triangular_flag_on_post: Contribua com o projeto

- Realize o Fork
- Faça as modificações necessárias
- Realize a Pull Request (PR)

## :card_file_box: Fucionalidades do Projeto

- [x] Gerenciamento de Contas
    - Criar conta bancária
    - Listar contas bancárias

## :computer: Rodando o Projeto

```shell
# 1. Configure o ambiente

Certifique-se de ter o ambiente Java e Spring Boot configurado.

# 2. Clone o projeto

git clone https://github.com/christianebs/java-banco-digital-dio

# 3. Escolha a IDE

Abra o projeto em sua IDE favorita.

# 4. Execute o projeto

Execute a classe principal Application.java.
```

## :arrows_counterclockwise: Endpoints

- POST /users - Criar usuário
- GET /users/{id} - Buscar usuário pelo ID

## :woman_technologist: Autora

<a href="https://github.com/christianebs">
<img src="https://user-images.githubusercontent.com/108686840/271874870-1003d6c2-7574-4104-a392-ab6b2713cff2.png" width="100px" />
</a>

