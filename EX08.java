package src.src;

import java.util.Scanner;

public class EX08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int i = 0;
    int soma = 0;
    while (i<5){
      System.out.printf("%dº número: ", i+1);
      int numero = sc.nextInt();
      soma = soma + numero;
      i++;
    }
    System.out.println("Soma:" + soma);
    System.out.println("Média:" + soma/5);
    
    /////////////////////////////////////////////////////////////////////////////////////
    
    
    int soma2 = 0;
    
    for (int j = 0; j < 5; j++){
      System.out.printf("%dº número: ", j+1);
      int numero2 = sc.nextInt();
      soma2 = soma2 + numero2;
    }
    System.out.println("Soma:" + soma2);
    System.out.println("Média:" + soma2/5);
    sc.close();


  }
}
