package src.src;

import java.util.Scanner;

public class EX15 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantas notas você deseja inserir?");
    double qtdNotas = sc.nextDouble();

    double soma=0;
    
    for (int i =0; i<qtdNotas; i++){
      System.out.printf("%dº Nota:", i+1);
      double nota = sc.nextDouble();
      soma = soma + nota;
    }
    sc.close();
  System.out.printf("SOMA: %.1f\n", soma);
  System.out.printf("MÉDIA: %.1f\n", soma/qtdNotas);

  }
}
