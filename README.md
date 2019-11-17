# Capítulo 4 - Classes, Objetos e Interfaces #

## Tópicos abordados ##
* classes e interfaces
* propriedades e construtores não triviais
* classes de dados
* delegação de classe
* uso da palavar resevada object


### Parte 1 - Interfaces ###

 - Interfaces se definem igual java 
 - Os dois pontos (:) servem para substituir o extends e implements 
 - Todas as classes que implementam uma interface, ou extendem de uma classe abstrada, 
    os seus métodos devem obrigatóriamente conter a palavra reserda override, 
    sendo uma implementação delegada ou sobreescrita
 - implementação concreta de metodos na interface não precisa da palavra default na frente 
 - Multiplas interfaces com assinaturas iguais para uma classe, requerem que seja definido qual ou quais os metodos 
 super serão chamados. É obrigatório sobreescrever com uma das opções abaixo:
    * Sobreescrever o metodo e chamar um dos metodos super
    * Sobreescrever o metodo e chamar os 2 metodos super
    * Sobreescrever o metodo e não chamar nenhum dos super

### Bonus 1 ### 
É possível fazer lógica dentro de expressões String 

### Parte 2 - Classes ###

Todas as classes são fechadas por padrão. O motivador de tudo isso vem do livro Effective Java de Joshua Bloch (Addison-Wesley, 2008)
Onde ele diz: “faça um design e o documente visando à herança, ou a proíba”. 
Em outras palavras, classes não preparadas para herança podem tornar o sistema frágil

- Tanto classes como fun podem conter open para definir se podem ou não serem sobreescritos
- Sobreescrita de metodos de classes abstratas também é obrigatorio colocar o override

 