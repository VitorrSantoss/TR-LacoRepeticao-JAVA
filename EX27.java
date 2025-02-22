package src.src;

import java.util.Scanner;

public class EX27 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Média de N notas: ");

    int i = 1;
    int soma = 0;
    int qtdNota = 0;

    while (true){
      System.out.printf("%dª Nota: ", i++);
      int nota = sc.nextInt();

      if (nota == -1){
        break;
      }

      soma = soma + nota;
      qtdNota = qtdNota +1;


    }
    sc.close();

    System.out.printf("Soma: %d\n", soma);
    System.out.printf("Média: %d", soma/qtdNota);















  }
}
