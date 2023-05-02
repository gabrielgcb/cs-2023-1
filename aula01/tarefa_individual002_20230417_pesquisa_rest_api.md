## Tarefa 002 - 17/04/2022 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto **no formato markdown** de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).

Uma API(Application Programming Interface) é um conjunto de regras, protocolos e padrões que permite que duas ferramentas "conversem" entre si e compartilhem informações baseados na nuvem, sem que o usuário que utiliza uma das ferramentas saiba os detalhes dessa implementação, mas apenas que acesse e faça uso das funcionalidade da aplicação em questão, facilitando o acesso e o desenvolvimento de softwares para a internet.

REST(Representational State Transfer) são princípios/regras de arquitetura para os desenvolvedores criarem esses softwares na internet. Tem como objetivo primário a definição e padronização de características fundamentais para a construção de aplicações Web seguindo boas práticas, com rotinas e interface bem definidas, fazendo com que a comunicação entre máquinas/servidor e usuários/cliente seja simples, confiável, de alta perfomance, fácil para ser modificada e com portabilidade entre diferentes plataformas.

Características da Arquitetura REST:
1. Cliente-servidor. Garante que as responsabilidades das aplicações existentes no usuário e no servidor são mantidas separadas.
2. Interface bem definidas, pois os servidores devem transferir os dados solicitados pelo cliente em formato-padrão.
3. Ausência de estado, ou stateless, que indica que o cliente pode fazer solicitações independente das realizadas anteriormente, pois cada solicitação é isolada da outra.
4. Sistema em camadas. Um servidor, ao ser requisitado por um cliente, pode fazer solicitações a outros servidores e assim por diante.
5. Utilização de memória cache, o que torna a comunicação cliente-servidor mais ágil.

Sendo assim, uma API que segue o padrão de arquitetura REST e está em conformidade com os critérios estabelecidos, é chamada de API REST ou API RESTful.
Por exemplo, a ferramenta Postmon [link](https://postmon.com.br/) é uma API baseada em REST que permite realizar consultas aos CEPs e rastrear encomendas.

Benefícios de uma API REST:
1. A abordagem de comunicação é simples e padronizada, pois não é necessário se preocupar com formatação de dados ou como formatar uma requisição a cada vez que for fazer uma.
2. É escalonável, pois é fácil fazer modificações a cada vez que complexidade do sistema aumenta, e também é _stateless_ pois não é preciso controlar e nem reter essas moficações anteriores entre o cliente e o servidor.
3. Ela é de alta perfomance, independente da complexidade da solução.

Uma API REST pode ser dividida em duas partes: REQUEST e RESPONSE
1. RESQUEST: é responsável por enviar os dados do cliente para o servidor.
2. RESPONSE: trata de receber a resposta do servidor para o cliente.
Ela segue o conceito de CRUD - Create Read Update Delete - e eles estão relacionados aos métodos HTTP:
1. Create - POST
2. Read - GET
3. Update - PUT
4. Delete - DELETE