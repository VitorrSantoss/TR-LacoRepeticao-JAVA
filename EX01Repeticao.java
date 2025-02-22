package src.src;

import java.util.Scanner;

public class EX01Repeticao {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma nota (0-10):");
    double nota = sc.nextDouble();

    while (nota <0 || nota > 10 ){
      System.out.println("Nota Inválida! Por favor, digite novamente.");
      nota = sc.nextDouble();
    }
    sc.close();
    System.out.println("Nota registrada com sucesso!");
    

  }
}
