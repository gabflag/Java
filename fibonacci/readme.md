<h1>FIBONACCI</h1>

# Tecnologias utilizadas:

  - JAVA 1.8 e bibliotecas 'java.util.Scanner', 'java.util.ArrayList' e 'java.util.List'.

  
# A respeito do programa:

  O presente programa tratá de resolver os seguintes desafios:
    -- A função deve receber um numero N >= 0 (deve validar o input para a função), e retornar o valor correspondente desse número na sequencia fibonnaci. Exemplo:
                fib(0) =0;
                fib(1) = 1;
                fib(2) = 1;
                fib(3) = 2;
                fib(5) = 5;
                fib(6) = 8.
    --- Função recursiva que resolva fibonacci;
    --- Função linear que resolva fibonnaci.

# Pontos a serem melhorados:
  
  - Programa adicional especifico para testes.
 
# Informações relevantes:
  
  A principal diferença entre uma função linear e uma função recursiva para calcular o valor correspondente de um número N na sequência de Fibonacci é a forma como elas resolvem o problema. Uma função linear, como a que mencionado anteriormente, utiliza uma estrutura de loop (como um "for" ou "while") para calcular cada valor da sequência de Fibonacci.
  <p> Por outro lado, uma função recursiva utiliza a recursão para calcular o valor correspondente de um número N na sequência de Fibonacci. Isso significa que a função se chama a si mesma para calcular cada valor da sequência. Ela começa com os valores iniciais de 0 e 1 e, em seguida, chama a si mesma para calcular os próximos valores da sequência, passando valores menores para a próxima chamada.</p>
  <p> A diferença principal entre as duas é que a função linear é mais eficiente, pois ela evita o uso excessivo de chamadas recursivas e geralmente é mais rápida. Já a função recursiva é mais simples de entender, mas pode ser mais lenta e consumir mais recursos computacionais.</p>

    
# Observações:
  
   
   Criado uma validação throw new IllegalArgumentException para que apareça um erro na tela caso o número seja meno do que 0, assim como, uma função para imprimir uma lista (feito isso para que no momento da apresentação da lista aparece a posição de fibonacci). Acredito que todos os desafios anteriormente propostos foram atendidos, caso tenha algum erro de lógica no código, ortografia ou melhores maneiras de serem executadas as tarefas dispostas ficaria grato pela compreensão, aprecio sugestões para melhorar.




