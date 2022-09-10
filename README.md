# loja
Projeto criado para estudar os padrões de projeto de arquitetura de software

# Design Patterns I
Solução comum para um problema recorrente ao utilizar o paradigma de orientação a objetos.

    23 Padrões divididos em três categorias.

        - Criacionais

        - Estruturais

        Comportamentais (Neste curso falaremos apenas dos comportamentais)
            - Strategy - Serve para deixar a classe mais coesa, e sem amarras específicas, o que resulta no codigo não crescer de maneira indefinida, nos ajudando a remover os 'ifs' e 'elses'

            Todos os padrões de projeto definidos pela Gang of Four (GoF) possuem uma motivação: resolver um problema recorrente.
            Q: Que tipo de problema o padrão Strategy visa resolver?
            R: A existência de diversos algoritmos para uma ação, resultando na possibilidade de vários ifs.
            J:  Este padrão pode ser utilizado quando há diversos possíveis algoritmos para uma ação (como calcular imposto, por exemplo). Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

            O livro Padrões de Projeto - Soluções reutilizáveis de software orientado a objetos é um catálogo para todos estes padrões, com todas as explicações necessárias.

            Caso não possa (ou não queira) ler o livro, existem sites que resumem cada um dos padrões. Aqui está um que é bastante utilizado, já na página específica sobre o Strategy: https://refactoring.guru/design-patterns/strategy.

            Nesta aula, aprendemos:
                
                Padrões de projeto são soluções genéricas para problemas recorrentes do desenvolvimento de software orientado a objetos;
                Existem três principais categorias de padrões de projeto:
                Comportamentais (que serão vistos neste treinamento)
                Estruturais
                Criacionais
                Como diminuir a complexidade do nosso código, trocando múltiplas condicionais por classes:
                Esta técnica é chamada de Strategy, que é um dos padrões de projeto

                LER ->  Strategy: https://refactoring.guru/design-patterns/strategy

                Todo padrão de projeto possui sua explicação teórica com motivação, aplicação, seus participantes, consequências, etc.

                O livro Padrões de Projeto - Soluções reutilizáveis de software orientado a objetos é um catálogo para todos estes padrões, com todas as explicações necessárias.

                Caso não possa (ou não queira) ler o livro, existem sites que resumem cada um dos padrões. Aqui está um que é bastante utilizado, já na página específica sobre o Strategy: https://refactoring.guru/design-patterns/strategy.

            - Chain of responsibility

                Assim como qualquer outro conceito em computação, existe mais de uma forma de implementar o padrão de projeto Chain of Responsibility.

                Para saber mais sobre a parte teórica deste padrão, e analisar diferentes implementações, você pode conferir este link:

                https://refactoring.guru/design-patterns/chain-of-responsibility.

            - Template Method

                As aplicações do padrão Template Method são muitas, mas além de entender a parte prática, é muito importante ler sobre a teoria por trás do padrão.

                Para entendê-lo melhor, você pode conferir este link: https://refactoring.guru/design-patterns/template-method.

            
            - State
                Classes que representam estados e possuiem regras de transicao destes estados sem usar cadeia de ifs
                para saber mais: https://refactoring.guru/design-patterns/state

                Para que você entenda melhor como aplicar o padrão State em outras situações, é interessante conhecer toda sua parte teórica, como motivação, aplicações, etc.

                Para isso, você pode conferir este link: https://refactoring.guru/design-patterns/state.

            - Command
                As classes tem um metodo em comum, para executar uma mesma logica.
                O padrão de projetos Command é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já que alguns conceitos mais específicos pro mundo da web surgiram e são diferentes dos existentes em aplicações desktop.

                Para você entender melhor sobre o padrão Command "original" (definido no livro da GoF), você pode dar uma olhada nesse link: https://refactoring.guru/design-patterns/command.

                Também é muito interessante o estudo de alguns padrões de arquitetura de software, como Domain Driven Design e Clean Architecture, pois você vai esbarrar no padrão de Command Handlers (que foi aplicado de forma bem simples nesta aula).

            - Observer
                O padrão Observer é comumente utilizado por diversas bibliotecas que trabalham com eventos. Muitas tecnologias em Java, como o Spring e o CDI, possuem componentes que nos auxiliam a trabalhar com eventos.

                A forma como o padrão foi implementado aqui na aula é a mais simples e pura, mas existem diversas modificações que podem ser feitas.

                Para entender mais sobre a teoria deste padrão, você pode conferir este link: https://refactoring.guru/design-patterns/observer.

# Design Patterns II
Auxílio: https://refactoring.guru/design-patterns

    Tipos
        Criacionais     
        Comportamentais - Curso I
        Estruturais     - Curso II
            Adapter
            Decorator
            Composite
            Facade
            Proxy
        
        Adapter
            Nesta aula, aprendemos:
            Que padrões estruturais nos ajudam a relacionar diversas classes de forma organizada
            Que detalhes de infraestrutura devem ser abstraídos através de interfaces
            Como o padrão Adapter pode nos ajudar a trocar detalhes de infraestrutura, sem muitas dores de cabeça      
            Para saber mais detalhes -> https://refactoring.guru/design-patterns/adapter

        Decorator 
            Nesta aula, aprendemos:
            Que é possível adicionar comportamento a classes em tempo de execução;
            A aplicar esse conhecimento para combinar impostos;
            Que comportamentos adicionados em tempo de execução são possíveis, através do padrão Decorator.
            Para saber mais detalhes -> https://refactoring.guru/design-patterns/decorator

        Composite
            É bastante comum nós precisarmos trabalhar com coleções de itens que podem ter mais de uma implementação. Se essa estrutura pode ser descrita como uma árvore (no modelo computacional), então o padrão Composite pode ser muito útil.
            Para entender melhor os conceitos por trás do padrão, dá uma olhada nesse link: https://refactoring.guru/design-patterns/composite
            Nesta aula, aprendemos:
            Por alto o que é uma representação de árvore;
            Como representar itens e orçamentos de forma semelhante;
            A percorrer a estrutura de árvores utilizando o padrão Composite.

        Facade (Fachada)
            Em determinados casos, nós podemos precisar de um acesso simplificado a uma parte complexa ou grande do nosso sistema, como autenticação, acesso a sistema de arquivos, cache, etc. Uma classe de fachada, contendo apenas a funcionalidade desejada, pode ser bastante útil.
            Este padrão é bem simples, mas possui particularidades, então vale a pena uma leitura mais completa: https://refactoring.guru/design-patterns/facade
            Nesta aula, aprendemos:
            Que podemos pegar um sub-sistema e expor parte de suas funcionalidades através de uma classe;
            Que a classe responsável por ser essa fachada implementa o padrão Facade.            

        Proxy
            Nesta aula, aprendemos:
            A interceptar o acesso a um método, através de uma classe derivada;
            Quando isso pode ser útil, em nosso caso, para fazer cache;
            Que, a esse conceito, se dá o nome de Proxy.

            Para saber mais detalhes sobre esse padrão simples, porém muito poderoso, você pode conferir este link: https://refactoring.guru/design-patterns/proxy
