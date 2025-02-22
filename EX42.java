package src.src;

import java.util.Scanner;

public class EX42 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int qtdImpar = 0;
    int somarImpar = 0;
    int maiorPar = -1;
    int menorPar = 999;

    for (int i = 1; i<=20; i++){

      System.out.printf("%dº Número: ", i);
      int numero = sc.nextInt();

      if (numero % 2 != 0){
        qtdImpar = qtdImpar + 1;
        somarImpar = somarImpar + numero;
      }
      if (numero %2 ==0 && numero > maiorPar){
        maiorPar = numero;
      }
      if (numero > maiorPar){
        maiorPar = numero;
      }
      else if (numero < menorPar){
        menorPar = numero;
      }
    }
    sc.close();
    System.out.printf("Média dos números Ímpares: %d\n", somarImpar/qtdImpar);
    System.out.printf("Maior número Par: %d\n", maiorPar);
    System.out.printf("Diferença do maior menos o menor número: %d\n", (maiorPar-menorPar));
    
  }
}
