package src.src;

import java.util.Scanner;

public class EX45 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    double maior = -1;
    double menor = 9999;
    int idMaior = -1;
    int idMenor = 9999;

    for (int i = 1; i<5; i++){

      System.out.print("Número de indentificação: ");
      int id = sc.nextInt();
      System.out.print("Peso do boi: ");
      double peso = sc.nextDouble();

      if (peso > maior){
        maior = peso;
        idMaior = id;
      }
      else if (peso < menor){
        menor = peso;
        idMenor = id;
      
      }
    }
    sc.close();
    System.out.printf("Identificação do boi mais pesado: %d\n", idMaior );
    System.out.printf("Boi mais pesado: %.2fKg\n", maior);
    System.out.printf("Identificação do boi menos pesado: %d\n", idMenor );
    System.out.printf("Boi menos pesado: %.2fKg\n", menor);
    
































  }
}
