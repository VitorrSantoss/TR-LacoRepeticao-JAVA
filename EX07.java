package src.src;

import java.util.Scanner;

public class EX07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int maior = -1;
    int i=0;
    while (i<5){
      System.out.printf("%dº número: ", i+1);
      int numero = sc.nextInt();

      if (numero > maior){
        maior = numero;
      }

      i++;
    } 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

 
    System.out.println("Maior número:" + maior);
    sc.close();
    
    int maior2 = -1;
    for (int j = 0; j < 5; j++){
      System.out.printf("%dº número:", j+1);
      int numero2 = sc.nextInt();

      if (numero2 > maior2){
        maior2 = numero2;
      }
    }
    System.out.println("Maior número2:"+ maior2);

    sc.close();

  }
}
