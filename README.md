# Laços de Repetição em Java

Este repositório contém exemplos e exercícios práticos sobre os diferentes laços de repetição disponíveis na linguagem Java, demonstrando sua aplicação e funcionamento.

## 📋 Sobre o Projeto

Este projeto explora os diversos tipos de laços de repetição em Java, fornecendo exemplos claros e exercícios práticos para aprimorar o entendimento e o domínio dessas estruturas fundamentais de controle de fluxo. Os exemplos vão desde o básico até implementações mais complexas, abordando casos de uso comuns e técnicas de otimização.

## 🔄 Tipos de Laços Abordados

### 1. Laço `for`
   - Sintaxe básica
   - For com múltiplas variáveis
   - For-each (enhanced for)

### 2. Laço `while`
   - Sintaxe básica
   - Aplicações comuns

### 3. Laço `do-while`
   - Sintaxe básica
   - Quando utilizar do-while em vez de while

### 4. Controle de Laços
   - Uso de `break`
   - Uso de `continue`
   - Labels em laços aninhados

## 🔧 Tecnologias Utilizadas

- Java
- JDK (Java Development Kit)
- IDE de sua preferência (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## 📂 Estrutura do Projeto

```
Lacos-Repeticao-Java/
├── src/
│   ├── forloop/
│   │   ├── BasicForExample.java
│   │   ├── EnhancedForExample.java
│   │   └── NestedForExample.java
│   ├── whileloop/
│   │   ├── BasicWhileExample.java
│   │   └── WhileVsDoWhile.java
│   ├── dowhileloop/
│   │   └── DoWhileExample.java
│   └── controlstatements/
│       ├── BreakExample.java
│       ├── ContinueExample.java
│       └── LabelExample.java
├── exercises/
│   ├── ForLoopExercises.java
│   ├── WhileLoopExercises.java
│   └── MixedLoopExercises.java
├── solutions/
│   ├── ForLoopSolutions.java
│   ├── WhileLoopSolutions.java
│   └── MixedLoopSolutions.java
├── .gitignore
├── LICENSE
└── README.md
```

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/Lacos-Repeticao-Java.git
   ```

2. Abra o projeto na sua IDE de preferência

3. Navegue até o exemplo ou exercício que deseja executar

4. Compile e execute o arquivo Java desejado

## 📝 Exemplos Incluídos

### Laço For
```java
// Exemplo básico de laço for
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i);
}

// Exemplo de for-each com array
String[] nomes = {"João", "Maria", "Pedro", "Ana"};
for (String nome : nomes) {
    System.out.println("Nome: " + nome);
}
```

### Laço While
```java
// Exemplo básico de while
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### Laço Do-While
```java
// Exemplo básico de do-while
int numero = 1;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero <= 5);
```

## 💡 Dicas e Boas Práticas

- Escolha o laço mais adequado para cada situação
- Evite laços infinitos sempre verificando suas condições
- Use o for-each quando precisar apenas percorrer elementos
- Utilize break e continue com moderação para manter o código legível
- Prefira inicializar contadores dentro do laço for quando possível
- Evite modificar a variável de controle dentro do corpo do laço

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com novos exemplos, exercícios ou melhorias nos existentes.

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona novo exemplo de laço for'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request
