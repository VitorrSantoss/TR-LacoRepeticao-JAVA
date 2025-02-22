package src.src;

import java.util.Scanner;

public class EX28 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("ANÁLISE DE IDADES:");

    double contIdade = 0;
    int i =1;
    double soma = 0;
  
    System.out.println("Regristre sua idade: ");

    while (true){
      System.out.printf("%dª Idade: ", i++);
      int idade = sc.nextInt();
      if (idade == -1){
        break;
      }

      contIdade = contIdade +1;
      soma = soma + idade;

    }
    sc.close();
    double media = soma / contIdade;
    System.out.println("Média das idades: " + media);
    
    if (media > 0 && media <=25){
      System.out.println("Turma é Jovem");
    }
    else if (media >26 && media <=60){
      System.out.println("Turma Adulta");
    }
    else if (media > 60){
      System.out.println("Turma Idosa");
    }

  }
}
