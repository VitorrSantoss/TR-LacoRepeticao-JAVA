package src.src;

import java.util.Scanner;

public class EX23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 1;
    int maior = -1;
    int menor = 999;
    int soma = 0;

    while (true){
      System.out.printf("%dº valor: ", i++);
      int num = sc.nextInt();
      
      if (num==0){
        break;
      }

      if (num>maior){
        maior = num;
      }
     else if (num<menor){
      menor = num;
     }

      soma = soma + num;
    }
    sc.close();

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " +menor);
  }
}
