package src.src;

import java.util.Scanner;

public class EX44 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int maiorIdade = 0;
    int feminino18a35 = 0;
    int totalPessoas = 0;

    while (true){

      System.out.print("Sexo: [M] - Masculino, [F] - Feminino):  ");
      char sexo = sc.next().toUpperCase().charAt(0);
      System.out.print("Cor dos Olhos: [A] - Azul, [V] - Verde, [C] - Castanho:  ");
      char corOlhos = sc.next().toUpperCase().charAt(0);
      System.out.print("Idade:  ");
      int idade = sc.nextInt();
      sc.nextLine();

      if (idade == -1){
        break;
      }
      else if(sexo =='F' && corOlhos == 'V'){
        if (idade >=18 && idade <=35){
          feminino18a35 = feminino18a35 + 1;
        }
      }
      else if (idade > maiorIdade){
        maiorIdade = idade;
      }
      totalPessoas = totalPessoas + 1;
      

    }
    sc.close();
    System.out.printf("Maior idade: %d\n", maiorIdade);
    System.out.printf("Mulher, olhos verdes e entre 18 - 35: %.2f%%",( feminino18a35/(double)totalPessoas)*100);

  }
}
