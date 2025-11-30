# Sistema de Cadastro de Clientes API ViaCEP

- Projeto extra vai valer 3 pontos para POO e 1 ponto para banco de dados.
- Projeto deve ter implementados todos os assuntos vistos em sala.
- Projeto deve está conectado a um banco de dados.
- Projeto deve ter um .readme explicando tudo sobre [ o que é, o que faz, como instalar, banco de dados... ]
- Projeto deve ter comunicação com o cliente, em tela ou terminar.
- Projeto deve consumir uma API, ex: viacep, mas pode ser qualquer outra.
- Projeto deve está o código em iNGLES e parte do cliente em Pt-br
- Projeto deve vir com o sql, para importação em qualquer banco de dados local.
- Projeto deve explicar como se conectar com o banco no .readme


Vou receber o git do projeto, e instalar na minha maquina com a ajuda do .readme,
se rodar no meu pc, comunicar com api e banco de dados.

# Client Registration System (Java + MySQL + ViaCEP API)

Este projeto é um **Sistema de Cadastro de Clientes** utilizando Java, MySQL e consumo da API ViaCEP para preenchimento automático de endereço.

---

## 🧾 Sobre o Projeto
O sistema permite cadastrar clientes informando **nome, e-mail e CEP**.  
O endereço é buscado automaticamente na API pública **ViaCEP**, preenchendo rua, cidade e estado.  
Todos os dados são então salvos no banco **MySQL**.

---

## 📁 Estrutura do Projeto

src/controller/ClientController.java  
 
 database/DatabaseConnection.java  
 
 model/Client.java/Address.java  
 
 repository/ClientRepository.java  
 
 service/CepService.java/ClientService.java  
 
 view/App.java/MainMenu.java  

---

## 🛠 Tecnologias Usadas
- Java 25  
- MySQL 8+  
- MySQL Connector/J  
- ViaCEP API  
- VS Code  

---

## ⚙️ Pré-Requisitos

1. Java 21+ instalado  
2. MySQL instalado e rodando  
3. VS Code com extensões:
   - Extension Pack for Java  
   - Java Debugger  
4. Driver MySQL Connector/J dentro da pasta:

```
Registro/lib/mysql-connector-j-9.5.0.jar
```

---

## 🗄️ Script SQL (importar no MySQL)

```sql
CREATE DATABASE IF NOT EXISTS registro;
USE registro;

CREATE TABLE IF NOT EXISTS clients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    street VARCHAR(120),
    city VARCHAR(80),
    state VARCHAR(5)
);
```

---

## 🔗 Configurando a Conexão com o Banco

No arquivo:

```
src/database/DatabaseConnection.java
```

alterar:

```java
private static final String USER = "root";
private static final String PASSWORD = "SUA_SENHA_AQUI";
```

---

## ▶️ Como Rodar o Projeto

1. Abra o VS Code  
2. File > Open Folder → selecione o projeto  
3. Verifique se o arquivo JAR do MySQL está em *Java Projects > Libraries*  
4. Execute:

```
src/view/App.java
```

5. O sistema abrirá:

```
=== SISTEMA DE CADASTRO ===
Nome:
E-mail:
CEP:
```

---

## 👨‍💻 Comunicação com o Cliente
A interface é em **português (pt-BR)**, conforme solicitado.

---

## 📌 Observações Importantes
- Código em inglês  
- Cliente em português  
- SQL pronto  
- Consumo de API  
- POO aplicado  
- Projeto funcional e simples  

---

## ✔️ Requisitos Atendidos
- [x] POO  
- [x] Banco de dados  
- [x] API externa  
- [x] README completo  
- [x] Código em inglês  
- [x] Interface com o cliente  
- [x] Script SQL incluso  
- [x] Instalação possível somente lendo o README  

---

## 🙋 Suporte
Se precisar ajustar algo ou quiser adicionar validações, posso ajudar!
