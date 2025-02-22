package src.src;

import java.util.Scanner;

public class EX29 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos eleitores há disponíveis? ");
    int eleitores = sc.nextInt();

    int votoCand1 = 0;
    int votoCand2 = 0;
    int votoCand3 = 0;

    for (int i =1; i<=eleitores; i++){

      System.out.println("Escolha seu candidato: (1, 2 ,3):");
      int voto = sc.nextInt();

      switch (voto) {
        case 1:
          votoCand1 ++;
          break;
        case 2:
        votoCand2++;
          break;
        case 3:
        votoCand3++;
          break;
        default:
          System.out.println("Voto inválido! Tente novamente.");  
          break;
      }
      

    }
    sc.close();
    
    System.out.printf("Qtd Candidato 1: %d votos\n", votoCand1);
    System.out.printf("Qtd Candidato 2: %d votos\n", votoCand2);
    System.out.printf("Qtd Candidato 3: %d votos\n", votoCand3);









  }
}
