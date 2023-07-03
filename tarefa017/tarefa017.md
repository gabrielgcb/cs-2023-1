# Tarefa 017 - Configuração de software em tempo de execução, Generics, Closure e Logging - 30/06/2023

1. Considere os seguintes links, sobre os temas **Configuração de software em tempo de execução, _Generics_, _Closure_ e _Logging_**

  1.1 Configuração de software em tempo de execução:

      1.1.1 - [Link1](https://www.baeldung.com/spring-profiles);

      1.1.2 - [Link2](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring).

  1.2 _Closure_:

    1.2.1 - [Link3](https://www.geeksforgeeks.org/closures-in-java-with-examples/).

    1.2.2 - [Link4](https://receitasdecodigo.com.br/java/exemplo-de-foreach-do-java-8).

    1.2.3 - [Link5](https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826).

  1.3 _Generics_:

    1.3.1 - [Link6](https://www.devmedia.com.br/usando-generics-em-java/28981).

    1.3.2 - [Link7](https://www.devmedia.com.br/java-generics-trabalhando-com-metodos/30911).

    1.3.3 - [Link8](https://howtodoinjava.com/java/generics/complete-java-generics-tutorial/).

  1.4 _Logging_:

    1.4.1 - [Link9](https://www.loggly.com/ultimate-guide/java-logging-basics/).

    1.4.2 - [Link10](https://www.journaldev.com/977/logger-in-java-logging-example).

    1.4.3 - [Link11](https://www.edureka.co/blog/logger-in-java).

2. Solicita o estudo destes temas e elaborar um texto descrito, manifestando seu entendimento a respeito de cada um deles e ainda apresentando exemplos de utilização dos mesmos.

<p>
<strong>Configuração de software em tempo de execução:</strong>

A configuração de software em tempo de execução refere-se à capacidade de modificar o comportamento de um programa sem a necessidade de recompilá-lo. É uma abordagem flexível que permite ajustar o comportamento do software em diferentes ambientes ou situações. Os links fornecidos apresentam informações sobre o uso de perfis no framework Spring, que é amplamente utilizado para o desenvolvimento de aplicativos Java.

Por exemplo, o [Link1](https://www.baeldung.com/spring-profiles) descreve como os perfis podem ser usados no Spring para configurar diferentes ambientes, como desenvolvimento, teste e produção. Ele explica como definir perfis e como configurar propriedades específicas para cada ambiente, permitindo que o aplicativo se adapte a diferentes contextos de execução.

O [Link2](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring) aborda o conceito de Inversão de Controle (IoC) e Injeção de Dependência (DI) no Spring. Esses conceitos estão relacionados à configuração de software em tempo de execução, pois permitem que as dependências do aplicativo sejam configuradas externamente. Em vez de codificar as dependências diretamente no código, o Spring permite que elas sejam injetadas no aplicativo por meio de configurações externas, facilitando a modificação do comportamento em tempo de execução.

<strong>Closure:</strong>

Uma closure é uma função aninhada que tem acesso a variáveis de seu escopo externo, mesmo após a função ter sido retornada. Em Java, as closures são implementadas por meio de expressões lambda e interfaces funcionais. Os links fornecidos apresentam exemplos de como usar closures em Java.

O [Link3](https://www.geeksforgeeks.org/closures-in-java-with-examples/) explica o conceito de closures em Java e fornece exemplos práticos de como usá-las. Ele demonstra como criar closures usando expressões lambda e como elas podem capturar variáveis do escopo externo.

O [Link4](https://receitasdecodigo.com.br/java/exemplo-de-foreach-do-java-8) apresenta um exemplo de uso de foreach em Java 8, que permite a iteração sobre coleções de forma mais concisa. Ele demonstra como usar uma expressão lambda como closure dentro de um loop foreach, tornando o código mais legível e sucinto.

O [Link5](https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826) também aborda o uso de funções lambda em Java e como elas podem ser usadas para implementar interfaces funcionais. Ele fornece exemplos práticos de como criar e usar funções lambda em diferentes contextos.

<strong>Generics:</strong>

Generics são um recurso poderoso da linguagem Java que permitem criar classes, interfaces e métodos que podem operar em diferentes tipos de dados. Eles fornecem flexibilidade e segurança de tipo durante a compilação, permitindo a reutilização de código para diferentes tipos de dados.

O [Link6](https://www.devmedia.com.br/usando-generics-em-java/28981) explica o conceito de generics em Java e como usá-los. Ele aborda a criação de classes genéricas, métodos genéricos e interfaces genéricas. O artigo também apresenta exemplos práticos de como usar generics para criar estruturas de dados flexíveis e seguras.

O [Link7](https://www.devmedia.com.br/java-generics-trabalhando-com-metodos/30911) se aprofunda no uso de generics em métodos específicos. Ele demonstra como usar wildcards e bounded types para restringir os tipos de dados que podem ser usados como parâmetros em métodos genéricos.

O [Link8](https://howtodoinjava.com/java/generics/complete-java-generics-tutorial/) é um tutorial abrangente sobre generics em Java. Ele cobre desde os conceitos básicos até tópicos mais avançados, como bounded type parameters, wildcards, generic methods e generic classes. O tutorial fornece exemplos detalhados e explicações claras sobre cada aspecto dos generics.

<strong>Logging:</strong>

O logging é uma prática comum no desenvolvimento de software, sendo utilizada para registrar informações relevantes durante a execução do programa. Os logs são úteis para rastrear erros, depurar problemas e monitorar o comportamento do aplicativo em tempo real.

O [Link9](https://www.loggly.com/ultimate-guide/java-logging-basics/) apresenta os conceitos básicos do logging em Java. Ele explica como usar a biblioteca de logging padrão do Java, o java.util.logging, para registrar mensagens de log em diferentes níveis de severidade. O artigo também aborda a configuração do logging e fornece exemplos de uso.

O [Link10](https://www.journaldev.com/977/logger-in-java-logging-example) mostra um exemplo prático de como usar o framework de logging Log4j em Java. Ele apresenta a configuração básica do Log4j e demonstra como registrar mensagens de log em diferentes níveis usando diferentes appenders.

O [Link11](https://www.edureka.co/blog/logger-in-java) também aborda o uso do logging em Java, mas com foco na biblioteca de logging SLF4J. Ele fornece uma introdução ao SLF4J, explica como configurá-lo e demonstra seu uso em diferentes cenários.
</p>

**INSTRUÇÕES**
1. Esta é uma tarefa individual. A entrega deve ser entregue no seu repositório pessoal utilizado para a manutenção do controle de versão dos artefatos da disciplina, dentro de uma pasta chamada tarefa017.
2. O prazo para entrega desta tarefa é as 23h59min do dia 02/07/2023.
