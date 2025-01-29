## Pré-requisitos

Certifique-se de que os seguintes requisitos estão atendidos antes de executar o projeto:

1. **JDK 21**: Faça o download e instale a versão 21 do JDK (Java Development Kit).
   - [Download do JDK 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) ou instale através de gerenciadores de pacotes como [SDKMAN](https://sdkman.io/) ou [Chocolatey](https://chocolatey.org/).

2. **Apache Maven**: Certifique-se de que o Maven está instalado e configurado.
   - [Download do Maven](https://maven.apache.org/download.cgi)
   - Após instalar, adicione o caminho do Maven (`bin`) à variável de ambiente `PATH`.

3. **Git** (opcional): Para clonar o repositório.
   - [Download do Git](https://git-scm.com/)

4. **Configuração de Variáveis de Ambiente**:
   - Configure a variável `JAVA_HOME` para o caminho onde o JDK 21 está instalado.
   - Verifique se o comando `java -version` retorna a versão:
    ```bash
    openjdk version "21.0.6" 2025-01-21 LTS
    OpenJDK Runtime Environment Temurin-21.0.6+7 (build 21.0.6+7-LTS)
    OpenJDK 64-Bit Server VM Temurin-21.0.6+7 (build 21.0.6+7-LTS, mixed mode, sharing)
    ```

## Instalação do Projeto

Siga os passos abaixo para instalar as dependências e executar o projeto:

1. Clone este repositório:
   ```bash
   git clone https://github.com/Klions/email-java.git
   cd email-java
   ```

2. Verifique se todas as dependências do Maven estão instaladas:
   ```bash
   mvn clean install
   ```

   Esse comando fará o seguinte:
   - Baixará todas as dependências do projeto listadas no arquivo `pom.xml`.
   - Compilará o código-fonte.

## Executando o Projeto

1. Para executar a aplicação, use o Maven:
   ```bash
   mvn exec:java
   ```

2. Se você preferir executar o `.jar` gerado após a compilação:
   - Localize o arquivo `.jar` na pasta `target`.
   - Execute com o seguinte comando:
     ```bash
     java -jar target/emailsender-1.0-SNAPSHOT.jar
     ```
