package src.src;

import java.util.Scanner;

public class EX17 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Fatorial: ");
    int num = sc.nextInt();
    sc.close();

    int fatorial =1;
    if (num>=0 && num <=16){
      for (int i=1; i<=num; i++){
        fatorial = fatorial *i;
      }

      System.out.printf("%d! = %d", num, fatorial);
    } 
    else{
      System.out.println("Valor Inválido");
    }

  } 
}
