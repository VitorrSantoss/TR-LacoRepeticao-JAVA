package src.src;

import java.util.Scanner;

public class EX36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Montar a tabuada de: ");
    int num = sc.nextInt();

    System.out.print("Começar por: ");
    int inicio = sc.nextInt();
    System.out.print("Terminar por: ");
    int fim = sc.nextInt();
    sc.close();

    if (inicio > fim){
      System.out.println("O valor inicial deve ser menor que o final");
    }
    else{
      for (int i = inicio; i <= fim; i++ ){
        System.out.printf("%d x %d = %d\n", num, i, (num*i));

      }
    }
  } 
}
