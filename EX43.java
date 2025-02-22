package src.src;

import java.util.Scanner;

public class EX43 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int maiorIdade = -1;
    int menorIdade = 999;
    String nomeMenorIdade = "";
    int qtdIdade = 0;
    int somaIdade = 0;

    for (int i =1; i<=5; i++){
      System.out.print("Qual é seu nome?: ");
      String nome = sc.nextLine();
      System.out.print("Qual é sua idade? ");
      int idade = sc.nextInt();
      sc.nextLine();

      if (idade > maiorIdade){
        maiorIdade = idade;
      }
      else if (idade < menorIdade){
        menorIdade = idade;
        nomeMenorIdade = nome;
      }

      qtdIdade = qtdIdade + 1;
      somaIdade = somaIdade + idade;

    }
    sc.close();
    System.out.printf("Maior idade: %d\n", maiorIdade);
    System.out.printf("Nome da pessoa mais nova: %s\n", nomeMenorIdade);
    System.out.printf("Média das idades: %d\n", somaIdade/qtdIdade);
    
  }
}
