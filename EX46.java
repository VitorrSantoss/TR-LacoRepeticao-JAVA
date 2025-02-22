package src.src;

import java.util.Scanner;

public class EX46 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double qtdNumeroTotal = 0;
    double qtdNumeroImpar = 0;
    double qtdNumeroPar = 0;

    while (true){


      System.out.print("Digite um número: ");
      int numero = sc.nextInt();


      if (numero == 99){
        break;
      }
      else if (numero % 2 != 0){
        qtdNumeroImpar += 1;
      }
      else if (numero % 2 == 0){
        qtdNumeroPar += 1;
      }

      qtdNumeroTotal += 1;
    }
    sc.close();
    
    System.out.printf("números ÍMPAR: %.1f%%\n",qtdNumeroImpar/qtdNumeroTotal*100);
    System.out.printf("números PAR: %.1f%%", qtdNumeroPar/qtdNumeroTotal*100);
































  }
}
