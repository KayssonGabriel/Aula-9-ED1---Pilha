# Aula 9 de Estrutura de Dados I — inversão de palavras com pilha

Programa de console em Java que lê uma linha e inverte os caracteres de cada palavra, preservando a ordem das palavras. A atividade usa uma pilha de caracteres em vetor para demonstrar a ordem LIFO, em que o último elemento inserido é o primeiro lido na saída.

- [`App.java`](PilhaPalavra/src/pilha/App.java) lê a linha, separa as palavras por espaços e empilha os caracteres.
- [`PilhaChar.java`](PilhaPalavra/src/pilha/PilhaChar.java) armazena os caracteres e os devolve do topo para a base.

## Como executar

Use o JDK 17 ou posterior. Na raiz do repositório, rode no PowerShell.

```powershell
javac --release 17 -encoding UTF-8 -d build (Get-ChildItem -Path PilhaPalavra/src -Recurse -Filter *.java -File).FullName
java -cp build pilha.App
```

Digite `casa azul` e pressione Enter. O programa escreve `asac luza`. O vetor da pilha cresce quando necessário para comportar palavras longas.
