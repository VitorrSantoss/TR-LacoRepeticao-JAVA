package src.src;

import java.util.Scanner;

public class EX39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double maiorAluno = -1;
    double codeMaiorAluno = -1;
    double menorAluno = 99;
    double codeMenorAluno = 99;
    double code, altura=0;

    for (int i = 1; i<=10; i++){

      System.out.print("Código do aluno: ");
      code = sc.nextDouble();
      System.out.print("Qual é sua altura: ");
      altura = sc.nextDouble();

      if (altura > maiorAluno){
        maiorAluno = altura;
        codeMaiorAluno = code;
      }
      else if(altura < menorAluno){
        menorAluno = altura;
        codeMenorAluno = code;
      }

    }
    sc.close();
    System.out.printf("Aluno %.0f: É o mais alto: %.2f\n", codeMaiorAluno, maiorAluno);
    System.out.printf("Aluno %.0f: É o mais baixo: %.2f\n", codeMenorAluno, menorAluno);

  }
}