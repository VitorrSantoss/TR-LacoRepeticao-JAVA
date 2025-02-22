package src.src;

import java.util.Scanner;

public class EX31 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 1;
    int unidadeCD = 0;
    double dinheiroCD = 0;

    while (true){

      System.out.printf("%dº CD: R$ ", i++);
      double valorCD = sc.nextDouble();


      if (valorCD <= -2){
        System.out.println("Valor inválido! Digite novamente!");
        continue;
      }
      else if (valorCD == -1){
        break;
      }

      dinheiroCD = dinheiroCD + valorCD;
      unidadeCD = unidadeCD +1;
    }
    sc.close();

    System.out.println("Qtd CD: " + unidadeCD);
    System.out.println("Valor Total: R$ " + dinheiroCD);
    System.out.println("Valor Médio por CD: R$ " + dinheiroCD/unidadeCD);

  }
}
