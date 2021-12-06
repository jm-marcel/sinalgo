# Sinalgo

Projeto final da disciplina de Programação Distribuída

# Descrição

Utilizar o framework Sinalgo para desenvolver uma rede que será composta por um um ou mais Sinks e um ou mais Nodes, em que:  - cada Sink irá enviar pacotes para estabelecimento de rotas continuamente a cada 200 rounds e irá receber pacotes de dados dos Nodes;  - no cenário desse trabalho, qualquer Sink poderá ser excluído da rede a qualquer momento, e os nós que estavam enviando pacotes para este Sink devem estabelecer suas rotas, com base nos pacotes de roteamento que receberem, para o Sink com o número de saltos mais próximo;  - cada Node irá receber os pacotes de roteamento dos Sink. Com isso, serão capazes de enviar pacotes de dados para esses Sinks utilizando seus Nodes vizinho. Portanto, devem rotear pacotes de dados recebidos de outros Nodes para o Sink que não estão a um salto de distância desse Sink. Assim como no trabalho final, nesse cenário, os Nodes enviarão pacotes para os Sinks mais próximos, após o estabelecimento das rotas. Entretanto, como o Sink enviará pacotes de rotas a cada 200 rounds, os Nodes poderão mudar o envio de pacotes caso um dos Sinks seja excluído da rede.
