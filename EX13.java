package src.src;

import java.util.Scanner;

public class EX13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Como calcular uma potência");
    System.out.print("Digite um número para ser a base: ");
    int base = sc.nextInt();
    System.out.print("Digite um número para ser o expoente: ");
    int expoente = sc.nextInt();
    sc.close();

    int resultado = 1;
    for (int i = 0; i<expoente; i++){
      resultado = resultado * base;
    }
    System.out.println(resultado);







  }
}
