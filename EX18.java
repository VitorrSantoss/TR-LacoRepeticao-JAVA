package src.src;

import java.util.Scanner;

public class EX18 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite valores:");

    int qdtNumero = 0;
    int soma=0;
    int i =1;
    while (true){
      System.out.printf("%dº Valor:", i++);
      int num = sc.nextInt();
      if (num==0){
        break;
      }
      soma = soma +num;
      qdtNumero = qdtNumero +1;
    }
    sc.close();
    System.out.printf("Soma: %d\n", soma);
    System.out.printf("Média: %d", soma/qdtNumero);

  }
}
