package src.src;

import java.util.Scanner;

public class EX47 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int qtdDentroIntervalo = 0;
    int qtdForaIntervalo = 0;

    for (int i = 1; i<=10; i++){

      System.out.print("Digite um número: ");
      int numero = sc.nextInt();

      if (numero > 10 && numero < 20){
        qtdDentroIntervalo +=1;
      }
      else{
        qtdForaIntervalo +=1;
      }

    }
    sc.close();
    System.out.printf("Qtd Dentro do Intervalo: %d\n", qtdDentroIntervalo);
    System.out.printf("Qtd Fora do Intervalo: %d", qtdForaIntervalo);
  }
}
