# Exercício: Implementação da Classe Singleton MyLog em Java

Este repositório contém uma implementação de exemplo da classe Singleton chamada `MyLog`, que é responsável pela escrita de mensagens no console em diferentes níveis de prioridade.

## Descrição

A classe `MyLog` permite a configuração de três níveis de prioridade para impressão de mensagens:

- `Information`: Mensagens meramente informativas.
- `Warning`: Mensagens de aviso.
- `Error`: Mensagens de erro.

A configuração do nível de prioridade determina quais mensagens serão impressas no console.

## Como Usar

1. Clone ou faça o download deste repositório.

2. Navegue até a pasta onde o código-fonte está localizado.

3. Abra o arquivo `MyLog.java` para visualizar a implementação da classe `MyLog`.

4. Crie uma instância da classe `MyLog` e configure o nível de prioridade conforme necessário:
   ```java
   MyLog.getInstance().setPriority(LogLevel.WARNING);

5. Use o método log para imprimir mensagens no console:
    ```java
    MyLog.getInstance().log("Mensagem", LogLevel.INFO);
    MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING);
    MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);
    
6. A saida deve ser semalhante a essa:
    ```java
    > Warning message: Mensagem de aviso
    > Error message: Mensagem de erro

### Adicionando Novas Prioridades Personalizadas

Você também pode adicionar suas próprias prioridades personalizadas à classe `MyLog`. Para fazer isso, siga estes passos:

1. Abra o arquivo `MyLog.java`.

2. Na enumeração `LogLevel`, adicione um novo valor para sua prioridade personalizada:

   ```java
   public enum LogLevel {
       INFORMATION,
       WARNING,
       ERROR,
       // Adicione sua prioridade personalizada aqui
       CUSTOM_PRIORITY
   }

3. Crie uma instância da classe `MyLog` e configure o nível de prioridade conforme necessário:
   
   ```java
   MyLog.getInstance().setPriority(LogLevel.WARNING);

4. Use o método log para imprimir mensagens no console:
    ```java
    MyLog.getInstance().log("Mensagem", LogLevel.INFO);
    MyLog.getInstance().log("Mensagem de aviso", LogLevel.WARNING);
    MyLog.getInstance().log("Mensagem de erro", LogLevel.ERROR);
    MyLog.getInstance().log("Mensagem customizada", LogLevel.CUSTOM_PRIORITY);
    
5. A saida deve ser semelhante a essa:
    ```java
    > Warning message: Mensagem de aviso
    > Error message: Mensagem de erro
    > Custom_priority message: Mensagem customizada
