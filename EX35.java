package src.src;

import java.util.Scanner;

public class EX35 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double i = 1;
    double maior = -1;
    double menor = 999;
    double soma = 0;
    double div = 0;
    System.out.println("Registro de temperaturas:");

    while (true){
      System.out.printf(" %.0fª Temperatura: ", i);
      double temp = sc.nextDouble();

      if (temp == 999){
        break;
      }
      else if (temp > maior){
        maior = temp;
      }
      else if (temp < menor){
        menor = temp;
      }

      div = div + 1;
      soma = soma + temp;
      i++;
    }

    System.out.printf("Maior temperatura: %.2f\n", maior);
    System.out.printf("Menor temperatura: %.2f\n", menor);
    System.out.printf("Média temperatura: %.2f\n", soma/div);
    sc.close();
  }
}
