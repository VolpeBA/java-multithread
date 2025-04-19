# Projeto de Multithreading em Java

Este é um projeto desenvolvido durante um curso de Java, com foco em conceitos de **multithreading** e **concorrência**. O objetivo é explorar diferentes abordagens para criar e gerenciar threads, além de utilizar coleções e ferramentas para programação concorrente.

## Anotacoes durante o estudo

Durante o curso, foi criado um resumo com os principais conceitos abordados. Você pode acessá-lo no link abaixo:

[Resumo do Curso - Multithreading](https://amethyst-innovation-b5c.notion.site/Multithread-1d941543a11c8026b982c4e4b21be7cc)

## Funcionalidades

- Criação e gerenciamento de threads.
- Uso de `Runnable` e `Callable` para tarefas concorrentes.
- Sincronização de coleções e controle de acesso a recursos compartilhados.
- Utilização de executores (`ExecutorService`) para gerenciamento de threads.
- Demonstração de variáveis `volatile` e uso de `Thread.yield()`.

## Estrutura do Projeto

O projeto contém os seguintes arquivos principais:

- `Executores.java`: Demonstra o uso de `ExecutorService` com `Runnable` e `Callable`.
- `ColecoesAtomicas.java`: Exemplo de uso de coleções atômicas como `AtomicInteger`.
- `ColecoesParaConcorrencia.java`: Demonstração de coleções concorrentes como `ConcurrentHashMap` e `BlockingQueue`.
- `SincronizarColecoes.java`: Exemplo de sincronização de coleções com `Collections.synchronizedList`.
- `Main.java`, `Main2.java`, `Main3.java`: Exemplos de criação e execução de múltiplas threads.
- `VolatileAndYield.java`: Demonstração do uso de variáveis `volatile` e do método `Thread.yield()`.

## Tecnologias Utilizadas

- **Java**: Linguagem principal do projeto.
- **Gradle**: Ferramenta de build para gerenciar dependências e compilar o projeto.

<hr></hr> Nota: Este projeto é apenas para fins educacionais e demonstração de conceitos de multithreading em Java.
