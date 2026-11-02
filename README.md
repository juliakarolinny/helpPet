
# 🐾 HelpPet API - Módulo de Gestão de Animais

Aplicação Java desenvolvida com o framework **Spring Boot** para a gestão e consulta de dados de animais (`Animal`). O projeto utiliza a arquitetura em camadas (**Controller-Service-Repository-Entity**), possui mapeamentos de enums para atributos do animal e conta com uma interface frontend estática (`indexHelpPet.html`).

---

## 📂 Estrutura de Arquivos

Abaixo está a árvore de arquivos exata contida no pacote do projeto `helpPet`, desconsiderando apenas as pastas ocultas de versionamento (`.git/`):

```
helpPet/
├── .mvn/
│   └── wrapper/
│       └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/
    │   │       └── helpPet/
    │   │           └── helpPet/
    │   │               ├── Controller/
    │   │               │   └── AnimalController.java
    │   │               ├── Entity/
    │   │               │   ├── Animal.java
    │   │               │   ├── Especies.java
    │   │               │   ├── Sexo.java
    │   │               │   └── Vacinacao.java
    │   │               ├── Repository/
    │   │               │   └── AnimalRepository.java
    │   │               ├── Service/
    │   │               │   └── AnimalService.java
    │   │               └── HelpPetApplication.java
    │   └── resources/
    │       ├── application.properties
    │       └── static/
    │           └── indexHelpPet.html
    └── test/
        └── java/
            └── com/
                └── helpPet/
                    └── helpPet/
                        └── HelpPetApplicationTests.java
```

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Framework:** Spring Boot
  * **Spring Web:** Para criação e disponibilização da API REST e recursos web.
  * **Spring Data JPA:** Para persistência e integração com o banco de dados.
* **Gerenciador de Dependências:** Apache Maven (`pom.xml` + Maven Wrapper)
* **Frontend Estático:** HTML / JS (`src/main/resources/static/indexHelpPet.html`)

---

## 📐 Estrutura das Classes do Projeto

O projeto `helpPet` está organizado nos seguintes componentes:

1. **`HelpPetApplication.java`:** Classe principal responsável por inicializar a aplicação Spring Boot.
2. **Entidades (`Entity`):**
   * **`Animal.java`:** Entidade principal com os dados e atributos do pet.
   * **`Especies.java`:** Enumeração/Definição para espécies de animais.
   * **`Sexo.java`:** Enumeração/Definição para o sexo do animal.
   * **`Vacinacao.java`:** Entidade/Enumeração para controle do status de vacinação.
3. **`AnimalRepository.java` (`Repository`):** Interface JPA para operações de banco de dados da entidade `Animal`.
4. **`AnimalService.java` (`Service`):** Camada de regras de negócio da aplicação.
5. **`AnimalController.java` (`Controller`):** Controller responsável pelo mapeamento das rotas HTTP.
6. **`indexHelpPet.html`:** Interface de usuário estática servida pela aplicação.

---

## 📡 Endpoints Implementados

Conforme o código-fonte presente no projeto enviado:

| Método | Endpoint | Descrição | Status |
| :--- | :--- | :--- | :--- |
| `GET` | `/animais` | Retorna a lista de animais cadastrados | **Implementado** |
| `GET` | `/` ou `/indexHelpPet.html` | Interface estática principal | **Implementado** |

> **Nota:** Nenhuma outra rota HTTP (`POST`, `PUT`, `DELETE`) está implementada no código-fonte fornecido.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* **Java Development Kit (JDK 17)** ou superior configurado.

### Passos para Execução

1. No terminal, navegue até a pasta raiz do projeto:
   ```bash
   cd helpPet
   ```

2. Execute a aplicação usando o Maven Wrapper:

   * **Windows:**
     ```cmd
     .\mvnw.cmd spring-boot:run
     ```

   * **Linux / macOS:**
     ```bash
     ./mvnw spring-boot:run
     ```

3. Abra o navegador para testar a aplicação:
   * **Interface Web:** `http://localhost:8080/indexHelpPet.html`
   * **Endpoint REST:** `http://localhost:8080/animais`
