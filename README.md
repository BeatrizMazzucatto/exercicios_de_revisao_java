# 📌 Exercícios de Revisão — Java

## 📖 Sobre

Este repositório contém as soluções dos Exercícios de Revisão de Java da disciplina APIs e Microsserviços, lecionada por Giovani Disperati.
link para o material completo: https://giovanidisperati.github.io/GRUAPIM/Aula01.html

---

## 📂 Estrutura do Repositório

```
/
├── Bloco1/
│   ├── exercicio01\_CalculadoraMedia.java
│   ├── exercicio02\_TabuadaFor.java
│   ├── exercicio03\_AdivinheNumero.java
│   └── exercicio04\_SomaImparesArray.java
├── Bloco2/
│   ├── exercicio05\_Carro.java
│   ├── exercicio05\_TesteCarro.java
│   ├── exercicio06\_Circulo.java
│   ├── exercicio06\_TesteCirculo.java
│   ├── exercicio07\_Veiculo.java
│   ├── exercicio07\_CarroHeranca.java
│   ├── exercicio07\_Moto.java
│   ├── exercicio07\_TesteVeiculos.java
│   ├── exercicio08\_SaldoInsuficienteException.java
│   ├── exercicio08\_ContaBancaria.java
│   └── exercicio08\_TesteConta.java
├── Bloco3/
│   ├── exercicio09\_ListaTarefas.java
│   ├── exercicio10\_OrdenandoNumeros.java
│   ├── exercicio11\_FilaAtendimentoLinkedList.java
│   └── exercicio12\_BuscaCidade.java
├── Bloco4/
│   ├── exercicio13\_RemoverDuplicatas.java
│   ├── exercicio14\_HashSetEmails.java
│   ├── exercicio15\_LinkedHashSetDias.java
│   ├── exercicio16\_TreeSetNomes.java
│   └── exercicio17\_TreeSetProdutos.java
├── Bloco5/
│   ├── exercicio18\_DicionarioSimples.java
│   ├── exercicio19\_ContadorPalavras.java
│   ├── exercicio20\_AgendaContatos.java
│   ├── exercicio21\_LinkedHashMapProdutos.java
│   ├── exercicio22\_TreeMapNotas.java
│   └── exercicio23\_VerificarChaveValor.java
├── Bloco6/
│   ├── exercicio24\_FilaImpressao.java
│   └── exercicio25\_PilhaLivros.java
├── Bloco7/
│   ├── exercicio26\_CatalogoProdutosCategoria.java
│   ├── exercicio27\_SorteioGanhadoresUnicos.java
│   ├── exercicio28\_InverterFrase.java
│   ├── exercicio29\_HistoricoNavegacao.java
│   └── exercicio30\_AgruparAlunosNota.java
├── Bloco8/
│   ├── exercicio31\_AnalisadorDeClasse.java
│   ├── exercicio32\_ModificarAtributoPrivado.java
│   └── exercicio33\_ExecutorDeTestes.java
└── Bloco9/
├── exercicio34\_vcRiquinho/
│   └── main.java
└── exercicio35\_LanchoneteQuaseTresLanches/
└── main.java

---

## 🛠️ Como Executar
Para compilar e executar qualquer exercício:

1. Abra o terminal na pasta do projeto.
2. Compile o arquivo desejado:
   ```bash
   javac Bloco1/exercicio01_CalculadoraMedia.java

3. Execute o programa:

   ```bash
   java Bloco1.exercicio01_CalculadoraMedia
   ```

> **Obs.:** Certifique-se de que o nome da classe pública dentro do arquivo corresponde exatamente ao nome do arquivo `.java`.

---

## 📋 Descrição dos Blocos

### **Bloco 1 — Fundamentos e Estruturas de Controle**

1. **Calculadora de Média** — Lê 3 notas, calcula a média e informa a situação do aluno.
2. **Tabuada com for** — Gera a tabuada de um número.
3. **Adivinhe o Número** — Usuário tenta adivinhar número aleatório de 1 a 100.
4. **Soma de Ímpares em um Array** — Soma apenas os números ímpares de um array.

### **Bloco 2 — Programação Orientada a Objetos**

5. **Classe Carro** — Atributos privados, construtor, getters e `exibirInfo()`.
6. **Classe Circulo** — Encapsulamento, validação e cálculo de área.
7. **Herança de Veiculo** — Subclasses `Carro` e `Moto`, sobrescrevendo `toString()`.
8. **Exceção Personalizada** — `SaldoInsuficienteException` usada em `ContaBancaria`.

### **Bloco 3 — API de Collections - List**

9. **Lista de Tarefas** — Gerencia tarefas usando `ArrayList`.
10. **Ordenando Números** — Ordenação com `Collections.sort()`.
11. **Fila de Atendimento** — `LinkedList` para simular atendimento.
12. **Busca por Elemento** — Procura cidade em lista de Strings.

### **Bloco 4 — API de Collections - Set**

13. **Removendo Duplicatas** — Uso de `HashSet` para eliminar duplicatas.
14. **Unicidade de E-mails** — Teste de duplicação em `HashSet`.
15. **Ordem de Inserção** — Uso de `LinkedHashSet`.
16. **Nomes em Ordem Alfabética** — Uso de `TreeSet`.
17. **Objetos no TreeSet** — Ordenação personalizada com `Comparable`.

### **Bloco 5 — API de Collections - Map**

18. **Dicionário Simples** — `HashMap` para tradução de palavras.
19. **Contador de Frequência** — Conta palavras em um texto.
20. **Agenda de Contatos** — Cadastro, busca e listagem com `HashMap`.
21. **Ordem de Cadastro** — `LinkedHashMap`.
22. **Listagem Ordenada** — `TreeMap` para ordenação por nome.
23. **Verificação de Chave e Valor** — Uso de `containsKey` e `containsValue`.

### **Bloco 6 — API de Collections - Queue e Deque**

24. **Fila de Impressão** — `Queue` para documentos.
25. **Pilha de Livros** — `Deque` como pilha.

### **Bloco 7 — Exercícios Integrados**

26. **Catálogo de Produtos por Categoria** — `Map<String, List<Produto>>`.
27. **Sorteio de Ganhadores Únicos** — Garantindo nomes únicos no sorteio.
28. **Invertendo uma Frase** — `Deque` para inverter palavras.
29. **Histórico de Navegação** — `LinkedList` simulando histórico.
30. **Agrupando Alunos por Nota** — Agrupamento por faixas de nota.

### **Bloco 8 — Desafios - Reflection**

31. **Analisador de Classe** — Lista atributos e métodos via reflection.
32. **Modificador de Atributos Privados** — Altera valor via reflection.
33. **Framework de Testes Simulado** — Anotação personalizada `@Teste`.

### **Bloco 9 — Exercícios Finais**

34. **VcRiquinho** — Exercício final.
35. **Lanchonete Quase Três Lanches** — Exercício final.

---
