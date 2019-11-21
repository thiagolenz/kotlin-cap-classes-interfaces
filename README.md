# Capítulo 4 - Classes, Objetos e Interfaces #

## Tópicos abordados ##
* classes e interfaces 
* propriedades e construtores não triviais
* classes de dados
* delegação de classe
* uso da palavar resevada object


### Parte 1 - Interfaces ###

 - Interfaces se definem igual java **(bloco1.exemplo1)**
 - Os dois pontos (:) servem para substituir o extends e implements **(bloco1.exemplo1)**
 - Todas as classes que implementam uma interface, ou extendem de uma classe abstrada, 
    os seus métodos devem obrigatóriamente conter a palavra reserda override, 
    sendo uma implementação delegada ou sobreescrita **(bloco1.exemplo2)**
 - implementação concreta de metodos na interface não precisa da palavra default na frente 
 - Multiplas interfaces com assinaturas iguais para uma classe, requerem que seja definido qual ou quais os metodos 
 super serão chamados. É obrigatório sobreescrever com uma das opções abaixo:
    * Sobreescrever o metodo e chamar um dos metodos `super`
    * Sobreescrever o metodo e chamar os 2 metodos `super`
    * Sobreescrever o metodo e não chamar nenhum dos `super` **(bloco1.exemplo3)**

### Bonus 1 ### 
É possível fazer lógica dentro de expressões String **(bloco1.bonus1)**

### Parte 2 - Classes ###

Todas as classes são fechadas por padrão. O motivador de tudo isso vem do livro Effective Java de Joshua Bloch (Addison-Wesley, 2008)
Onde ele diz: **“faça um design e o documente visando à herança, ou a proíba”**. 
Em outras palavras, classes não preparadas para herança podem tornar o sistema frágil **(bloco2.exemplo1)**

- Tanto classes como funções podem conter open para definir se podem ou não serem sobreescritos **(bloco2.exemplo2)**
- Sobreescrita de metodos de classes abstratas também é obrigatorio colocar o `override` **(bloco2.exemplo2)**
- É possível bloquear sobreescrita em cascata em algum ponto **(bloco2.exemplo3)**
- Classes abstratas e interfaces são `open` por padrão, não podem ser `final` **(bloco2.exemplo3)**
 
 ### Parte 3 - Visibilidade ###
 
 - Os modificadores de acesso seguem quase o mesmo padrão que java, a diferença se da no protected. 
 Em java `protected` é para nível de pacote, no Kotlin `protected` é somente para herança. 
 Nisso surgiu um novo modicador, `internal` que da acesso a nível de pacote. 
 Uma forma interessante de isolar classes que não devem ser acessadas de fora dos módulos.  **(bloco3.exemplo1)**
 OBS: Infelizmente, o modificador internal no kotlin se torna public quando acessado via java
 - Classes internas não tem acesso a instância interna, para tal é necessário colocar a palavra `inner` **(bloco3.exemplo2)**
 
 ### Parte 4 - Classes Seladas ###
 
 - Classes seladas é uma forma de fazer uma hierárquia de classes restrita. 
 Classes seladas e suas implementações devem ficar no mesmo arquivo. 
 Útil para operações matematicas, máquinas de estados, programação funcional **(bloco4.exemplo1)**
 
 
 ### Parte 5 - Construtores ###
 
 - Construtores primários podem ser escritos de diversas formas **(bloco5.exemplo1)**
 - Construtores podem ter valores default, e quando todos os atritubos tiverem valor default, 
 um constutor vazio é adicionado como opção **(bloco5.exemplo2)**
 - Classes superiores devem ser invocadas no construtor da classe herdada **(bloco5.exemplo3)**
 - Podem existir Construtores secundários, e no caso de herança eles devem chamar o construtor 
 correspondente da super classe **(bloco5.exemplo4)**
 
 ### Parte 6 - Propriedades ###
  
  - Interfaces podem definir propriedades que as classes que concretas devem oferecer, ela não especifíca como vai ser implementada,
  seja uma propriedade backing field, uma propriedade calculada  **(bloco6.exemplo1)**
  - É possível colocar `privete` em metodo set de uma propriedade `var` **(bloco6.exemplo2)**

### Parte 7 - Data Class ###
  - Igualdade entre objetos com dois iguais == gera uma chamada interna dos metodos equals, 
  para verificar a instancia usa-se os três iguais === **(bloco7.exemplo1)**
  - Data Class gera automaticamente os metodos: hashCode, equals, toString e Copy
  - Copy é utilizado pra clonar objetos e poder alterar apenas as propriedades desejadas, a ideia que os objetos sejam imutaveis e 
  seja criada uma cópia pra alterar os dados necessários **(bloco7.exemplo2)**
   
### Parte 8 - Objects ###
  - A palavra reservada object define uma instância de uma class. São 3 os tipos
    * Singletons
    * Companion objects, em java o equivalente são os metodos, variaveis e blocos static das classes, fábrica de objetos
    * Expressões ou classes anonimas 
  - Object: 
    * Não permite instância. Não permite nenhum tipo de construtor. **(bloco8.exemplo1)**
    * Podem extender de classes e interfaces **(bloco8.exemplo2)**
  - Companion Object
    * Kotlin não existe static, para tal existem as funções de pacote e os objetos companion que vem pra substituir. 
    Eles tem acesso aos membros private da classe, diferente das funções de nível superior. **(bloco8.exemplo3)**
    * Companion objects podem ser usado para fabricas de objetos, onde se define um construtor privado 
    e um metodo que instancia da melhor forma **(bloco8.exemplo4)**
    * Companion objects podem implementar interfaces **(bloco8.exemplo5)**
    * Companion objects também podem ser extendidos **(bloco8.exemplo6)**
    * Objects também servem Classes anonimas ou expressoes (lambdas)
   
  
## RESUMO ##
