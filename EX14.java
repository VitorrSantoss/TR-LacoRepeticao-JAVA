package src.src;

import java.util.Scanner;

public class EX14 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("1º Valor: ");
    int num1 = sc.nextInt();
    System.out.print("2º Valor: ");
    int num2 = sc.nextInt();
    sc.close();

    int valorInicial, valorFinal;

    if (num1<num2){
      valorInicial = num1;
      valorFinal = num2;
    }
    else{
      valorInicial = num2;
      valorFinal = num1;
    }

    for (int i = valorInicial+1; i<valorFinal; i = i+2){
      System.out.println(i);
    }

  }
}
