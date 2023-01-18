<h1>FIBONACCI</h1>

# Tecnologias utilizadas:

  - JAVA 1.8 e bibliotecas 'java.util.Scanner', 'java.util.ArrayList' e 'java.util.List'.

# A respeito do programa:

  O presente programa tratá de resolver os seguintes desafios:
  
    .  A função deve receber um numero N > 1 (validar o input), e retornar todos os números primos até o numero N. Exemplo:
         p(2) = [2]
         p(3) = [2, 3]
         p(10) = [2, 3, 5, 7]
    . Função recursiva que resolva p
    . Função linear que resolva p


# Pontos a serem melhorados:
  
  - Programa adicional especifico para testes.
 
# Informações relevantes:
  Ao fazer o calculo 'int(n**(1/2))' seria a mesma coisa que importar a biblioteca math e descobrir a raiz quadrada 'int(math.sqrt(n))'. Está é uma forma de otimizar 
  o algoritimo uma vez que os maiores divisores natuarais de um número X são menores ou iguais as raiz do número. No laço for para validação do número primo foi adicionado
  de 2 em 2 para excluir números pares no momento do resto da divisão.

# Observações:
  
   Criado uma função de validação throw new IllegalArgumentException 'extracted' para que apareça um erro na tela caso o número seja menor que 1. Acredito que todos os desafios anteriormente propostos foram atendidos, caso tenha algum erro de lógica no código, ortografia ou melhores maneiras de serem executadas as tarefas dispostas ficaria grato pela compreensão, aprecio sugestões para melhorar.
