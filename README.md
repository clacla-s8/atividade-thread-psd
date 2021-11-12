# atividade-thread-psd
Atividade Threads e Concorrência referente a disciplina de Projeto de Sistemas Distribuídos


Exercícios de Threads e Concorrência
Exercício 1. Desenvolva uma aplicação Swing Java que tenha um JTextField, JButton e um JLabel. O TextField será usado para receber um valor inteiro do usuário, o JButton será usado para confirmar esse valor e o JLabel para notificar o status da aplicação.
O valor inteiro passado pelo usuário deverá ser usado para fazer com que a aplicação durma durante tantos segundos. Exemplo; se o usuário passar 5, a aplicação deverá permanecer cinco segundos bloqueada. 
Este bloqueio deverá ser notificado através dos componentes, de tal forma que quando a aplicação estiver “dormindo”, tanto o JButton quanto JTextField devem estar  desabilitados. O JLabel deve ser usado para notificar quantos segundos faltam para o “bloqueio” terminar. 

Exercício 2. Implemente um programa que calcula todos os números primos entre 1 e um valor N fornecido como argumento. Seu programa deve dividir o trabalho a ser realizado entre X threads (onde X também é uma entrada do programa) para tentar realizar o trabalho de maneira mais rápida que uma versão puramente sequencial.  A thread principal do programa deve imprimir os números primos identificados apenas quando as outras threads terminarem.

Exercício 3. Construa um programa onde N threads incrementam contadores locais (não-compartilhados) em um laço. Cada thread imprime o valor de seu contador a cada incremento.  As threads param quando seus contadores chegam a um valor limite X, recebido como entrada pelo programa.  Por que as saídas das threads se misturam?

Agora mude seu programa para que as threads modifiquem um contador global compartilhado entre elas. O que acontece com os resultados?

Exercício 4. Modifique o último programa que você construiu para que, a cada iteração, a thread espere 1ms. A thread que terminar a contagem primeiro (realizar todas as iterações) deve interromper todas as outras que estão executando. 

Construa uma classe que implementa uma fila segura para um número indeterminado de threads que funciona da seguinte maneira:
– Se apenas uma thread tentar inserir ou remover um elemento, ela consegue;
– Se mais que uma estiver tentando ao mesmo tempo, uma consegue e as outras esperam. A próxima só conseguirá realizar a operação quando a anterior tiver terminado.

Exercício 5. Implemente uma classe BoundedBuffer que ofereça as operações void put(int v) e int get() sobre um array cujo tamanho é definido no momento da construção de uma instância. O método put() deverá bloquear enquanto o array estiver cheio e o método get() deverá bloquear enquanto o array estiver vazio. Os métodos oferecidos podem estar sujeitas a invocações de threads concorrentes sobre uma instância partilhada. A classe BoundedBuffer deverá garantir a correta execução em cenário multi-thread. 

