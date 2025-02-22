package src.src;

import java.util.Scanner;

public class EX19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int contadorImpar=0;
    int contadorPar=0;

    for (int i=0; i<10; i++){
      System.out.printf("%dº número: ", i+1);
      int num = sc.nextInt();
      if (num % 2 ==0){
        contadorPar = contadorPar +1;
      }
      else{
        contadorImpar = contadorImpar+1;
      }
    }
    sc.close();

    System.out.printf("Qtd Número Par: %d\n",contadorPar);
    System.out.printf("Qtd Número Impar: %d\n",contadorImpar);
  }
}
