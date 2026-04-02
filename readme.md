# 📖 Devocional App - Java + Maven

Aplicação devocional desenvolvida em Java com o objetivo de praticar conceitos de programação, organização de código e persistência de dados.

## 🚀 Evolução do Projeto

Este projeto começou como uma aplicação em **Java puro**, focada em lógica e estrutura básica.
Agora foi **refatorado para utilizar o Maven**, trazendo uma estrutura mais profissional e escalável.

### 🔄 Principais mudanças

* Organização do projeto em padrão Maven
* Separação clara de pacotes e responsabilidades
* Preparação para futuras integrações (banco de dados, APIs, etc.)
* Melhor gerenciamento de dependências

---

## 🧠 Tecnologias utilizadas

* Java
* Maven
* Programação Orientada a Objetos (POO)

---

## 📂 Estrutura do Projeto (Maven)

```
devocional-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── (código fonte)
│   │   └── resources/
├── pom.xml
```

---

## ⚙️ Funcionalidades

* Criar conta de usuário
* Login simples
* Menu interativo no terminal
* Adicionar devocionais
* Listar devocionais salvos
* Persistência de dados em arquivo `.txt`

---

## 🧩 Arquitetura

O projeto está organizado em classes principais:

* `CriarConta` → responsável pela criação de usuários
* `Login` → autenticação
* `Menu` → interface interativa
* `GerenDevo` → gerenciamento dos devocionais
* `App` → ponto de entrada do sistema

---

## ▶️ Como executar

### Pré-requisitos

* Java JDK instalado
* Maven instalado

### Executar o projeto

```bash
mvn compile
mvn exec:java -Dexec.mainClass="App"
```

---

## 📌 Objetivo do Projeto

Este projeto tem como objetivo:

* Praticar fundamentos de Java
* Aprender organização de projetos reais
* Evoluir para aplicações mais robustas (Spring Boot futuramente)
* Servir como base para um aplicativo devocional completo

---

## 🔮 Próximos passos

* Integração com banco de dados (SQLite ou MySQL)
* Interface gráfica ou mobile
* API com Spring Boot
* Sistema de autenticação mais robusto

---

## 👨‍💻 Autor

Emanuel Monteiro

---

## 💡 Observação

Este projeto faz parte da minha jornada de evolução como desenvolvedor, saindo de conceitos básicos até arquiteturas mais profissionais.
