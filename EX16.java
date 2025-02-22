package src.src;

import java.util.Scanner;

public class EX16 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Fatorial: ");
    int num = sc.nextInt();
    sc.close();

    int fatorial =1;
    for (int i=1; i<=num; i++){
      fatorial = fatorial*i;
    }
    System.out.printf("fatorial de %d! é %d", num, fatorial);


  }
}
