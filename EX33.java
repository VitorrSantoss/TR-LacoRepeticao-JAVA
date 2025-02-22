package src.src;

import java.util.Scanner;

public class EX33 {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  double priceBread = 0.18;
  System.err.println("TABELA DE PREÇOS DOS PÃES");
  for (double i = 1; i<=50; i++){
    System.out.printf("%.0f -> R$ %.2f\n", i, (i*priceBread));
  }
  sc.close();
  }
}
