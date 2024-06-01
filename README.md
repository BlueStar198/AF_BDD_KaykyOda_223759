# AF_BDD_KaykyOda_223759
## ETAPA 2 ESTA NA PASTA BDD DO BRANCH CONTA_TESTE

## ETAPA 1
## Story

Imagine que você está planejando alugar um carro para uma viagem. Para facilitar esse processo, uma empresa de locação de carros desenvolveu um sistema com diferentes comportamentos, dependendo das circunstâncias da locação e do cliente.

Inicialmente, considere um cliente que deseja alugar um carro de luxo. Se esse cliente realizar a reserva com antecedência de pelo menos uma semana, o sistema deve oferecer um desconto especial no valor total da locação. Por outro lado, suponha um cliente que necessita alugar um carro utilitário de última hora, sem qualquer reserva prévia. Nesse caso, o sistema deve ainda conseguir encontrar um veículo disponível e processar a locação rapidamente, mesmo que isso implique em um custo um pouco mais elevado devido à demanda urgente.

Esses cenários exemplificam como o sistema de locação de carros responde às diferentes necessidades e condições dos clientes, adaptando-se para garantir uma experiência satisfatória de locação, seja para reservas antecipadas ou demandas de última hora.

## BDD Gherkin

```gherkin
Funcionalidade: Locação de Carros

  Cenário: Reserva de Carro de Luxo com Desconto Especial
    Dado que o cliente deseja alugar um carro de luxo
    E o cliente realiza a reserva com antecedência de uma semana
    Quando o cliente solicita a locação do carro
    Então o sistema deve oferecer um desconto especial no valor total da locação

  Exemplo:
    | Tipo de Carro | Reserva Antecipada | Desconto Esperado |
    | Carro de Luxo | Sim                | Sim               |
    | Carro de Luxo | Não                | Não               |

  Cenário: Locação de Carro Utilitário de Última Hora
    Dado que o cliente necessita alugar um carro utilitário
    E o cliente não realizou nenhuma reserva prévia
    Quando o cliente solicita a locação do carro
    Então o sistema deve encontrar um veículo disponível

  Exemplo:
    | Tipo de Carro    | Reserva Antecipada | Disponibilidade |
    | Carro Utilitário | Sim                | Sim             |
    | Carro Utilitário | Não                | Sim             |
```
