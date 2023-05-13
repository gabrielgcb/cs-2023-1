### Tarefa 008: Prática de Revisão de Código - 12/05/2023

1. Considere o arquivo **seguro_veiculos.rar**, disponibilizado no SIGAA, no tópico de aula do dia 12/05/2023. Este arquivo é uma implementação para calcular o valor do desconto obtido na contratação de um seguro de veículos, conforme as regras definidas em arquivo constante da pasta **docs**, deste projeto.

  1.1 [link1](https://appmaster.io/pt/blog/revisoes-de-codigo)

  1.2 [link2](https://medium.com/codigorefinado/code-review-revis%C3%A3o-de-c%C3%B3digo-pode-ser-automatizada-ba5f25882774)

2. Considerando o aprendizado relacionado à tarefa_individual 007, do dia 10/05/2023, onde foram estudados os artivos, constantes do [link1](https://appmaster.io/pt/blog/revisoes-de-codigo) e
[link2](https://medium.com/codigorefinado/code-review-revis%C3%A3o-de-c%C3%B3digo-pode-ser-automatizada-ba5f25882774). Solicita-se

  3.1 A Revisão do código de todas as classes constantes desse projeto.

  2.1 Elaborar um documento **(formato markdown (.md))**. Neste documento deverá existir uma seção para cada uma das classes do projeto, onde deverão ser descritas as suas não conformidades.

  2.2 Caso queiram apresentar o código corrigido, podem ficar a vontade para isso, embora não seja uma exigência. Mas se o fizer, entregue o arquivo compactado, somente com o código-fonte alterado.

<h2>Cliente</h2>
<p>Não foram encontrados erros na classe Cliente.</p>
<h2>PremioSeguro</h2>
<ul>
  <li>Implementar validação dos valores dos atributos valor e taxa em seus respectivos métodos setters, para que não sejam atribuídos valores negativos ou nulos.</li>
  <li>Utilizar a classe BigDecimal em vez de double para representar valores monetários, pois ela é mais precisa e evita problemas de arredondamento.</li>
  <li>Talvez seja interessante implementar o método equals e o método hashCode para comparar objetos da classe PremioSeguro com base em seus atributos.</li>
</ul>
<h2>Teste</h2>
<p>É uma má prática colocar o teste dentro do pacote src/main/java.</p>
<h2>CpfValidator</h2>
<ul>
  <li>Melhorar a legibilidade do código: o código pode ser organizado de forma mais clara, com comentários explicativos e nomes de variáveis mais descritivos. Isso torna o código mais fácil de entender e manter.</li>
  <li>Adicionar validação de CPF formatado: atualmente, a classe valida apenas CPFs sem formatação. Seria útil permitir a validação de CPFs com formatação, como "123.456.789-10".</li>
  <li>Adicionar validação de CPFs especiais: atualmente, a classe não valida CPFs especiais, como "000.000.000-00" ou "999.999.999-99". Esses CPFs são considerados inválidos pela Receita Federal e deveriam ser rejeitados pela classe.</li>
  <li>Melhorar a eficiência do código: atualmente, o código faz várias iterações desnecessárias para validar o CPF. Seria possível reduzir a quantidade de iterações e tornar o código mais eficiente.</li>
  <li>Adicionar tratamento de exceção: atualmente, a classe lança uma exceção genérica em caso de CPF inválido. Seria útil criar uma exceção específica para CPF inválido e lançá-la em vez da exceção genérica. Isso torna mais fácil para o usuário da classe lidar com erros de validação.</li>
</ul>
<h2>CpfValidatorRefactored</h2>
<ul>
  <li>Documentação: Adicionar documentação para a classe e seus métodos, descrevendo sua finalidade e como devem ser utilizados.</li>
  <li>Validação de Entrada: Adicionar mais validações para a entrada de cpf. Por exemplo, verificar se cpf é nulo ou vazio e lançar uma exceção em vez de retornar false.</li>
  <li>Usabilidade: A classe poderia ser mais fácil de usar, por exemplo, permitindo que o usuário informe diretamente os números do CPF ao invés de precisar inseri-los em um array. Isso poderia ser feito adicionando um novo método sobrecarregado que aceita uma string com os números do CPF, sem precisar inserir em um array.</li>
</ul>
<h2>DataUtils</h2>
<ul>
  <li>A classe não é thread-safe, pois utiliza a classe SimpleDateFormat, que não é thread-safe. Para corrigir esse problema, pode-se utilizar a classe DateTimeFormatter do Java 8 em diante, que é thread-safe. Uma opção também seria utilizar a classe ThreadLocal para garantir que cada thread utilize sua própria instância de SimpleDateFormat.</li>
  <li>A classe utiliza tipos de datas legados, como java.util.Date e java.util.Calendar. É recomendado utilizar as classes mais modernas da API Java para manipulação de datas, como java.time.LocalDate, java.time.LocalDateTime e java.time.ZonedDateTime.</li>
  <li>Em vez de retornar um String com a data formatada, seria melhor retornar um objeto do tipo java.time.format.DateTimeFormatter que possa ser reutilizado em outras partes do código.</li>
</ul>
<h2>EstadoCivilValidator</h2>
<ul>
  <li>Utilizar um enum para representar os possíveis estados civis: É uma boa prática utilizar enums para representar valores que possuem um conjunto finito de opções. Dessa forma, é possível garantir que somente valores válidos sejam utilizados na aplicação. Além disso, isso tornaria o código mais legível e fácil de entender.</li>
  <li>Verificar o estado civil em relação à idade: A validação do estado civil pode ser relacionada à idade da pessoa. Por exemplo, um indivíduo com menos de 18 anos não pode ser casado ou divorciado. Isso pode ser verificado utilizando a classe LocalDate para calcular a idade com base na data de nascimento.</li>
</ul>
<h2>NacionalidadeValidator</h2>
<ul>
  <li>Implementar uma enumeração de nacionalidades: É possível implementar uma enumeração com os países e suas nacionalidades correspondentes. Dessa forma, a classe poderia validar a nacionalidade do usuário comparando o valor do parâmetro passado com os valores da enumeração. Isso tornaria o código mais legível e menos suscetível a erros de digitação.</li>
  <li>Fornecer mensagens de erro mais descritivas: Atualmente, a classe apenas retorna uma mensagem de erro padrão caso o valor da nacionalidade não seja aceito. Seria útil fornecer mensagens de erro mais descritivas, informando o motivo pelo qual a validação falhou e sugerindo uma solução para o usuário.</li>
</ul>
<h2>PassaporteValidator</h2>
<ul>
  <li>Adicionar mensagens de erro específicas: Atualmente, o método validate retorna apenas true ou false, sem fornecer informações sobre qual validação falhou. Podemos adicionar mensagens de erro específicas para cada validação falha, para que o usuário saiba o que precisa corrigir.</li>

</ul>
<h2>SexoValidator</h2>
<ul>
  <li>Validar entrada de caracteres maiúsculos ou minúsculos: Atualmente, o método não suporta entrada de caracteres maiúsculos ou minúsculos, o que significa que, por exemplo, "m" não é considerado um sexo válido. Seria útil permitir que o método aceitasse entradas em maiúsculas e minúsculas, para maior flexibilidade.</li>
  <li>Utilização de enums: ao invés de aceitar qualquer string para representar o sexo, seria interessante criar um enum com as opções de sexo possíveis e validar a entrada do usuário em relação a esse enum.</li>
</ul>

</DIV/>
