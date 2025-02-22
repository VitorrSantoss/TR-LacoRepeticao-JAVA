package src.src;

import java.util.Scanner;

public class EX41 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int somaIdade = 0;
    for (int i = 1; i<=20; i++){
      System.out.printf("%dª Idade: ", i);
      int idade = sc.nextInt();
      somaIdade = somaIdade + idade;
    }
    sc.close();
    System.out.printf("A média das idades é: %d", somaIdade/20);
  }
}
