package src.src;

import java.util.Scanner;

public class EX34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true){
      double i = 1;
      double total = 0;
      System.out.println("LOJAS TABAJARA");

      while (true){
        System.out.printf("Produto %.0f: R$ ", i);
        double valorProduto = sc.nextDouble();
        if (valorProduto == 0){
          break;
        }
        total = total + valorProduto;
        i++;
      }
      System.out.printf("Total: R$ %.2f\n", total);

      System.out.print("Dinheiro: R$ ");
      double dinheiro = sc.nextDouble();
      
      System.out.printf("Troco: R$ %.2f ",dinheiro - total);

      System.out.println();
      sc.close();
    }
    
  }
}
