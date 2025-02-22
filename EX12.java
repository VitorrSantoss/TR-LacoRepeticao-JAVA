package src.src;

import java.util.Scanner;

public class EX12 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número:");
    int num = sc.nextInt();
    

    System.out.print("Qual Operação Matemática você deseja?\n[1] SOMAR\n[2] SUBTRAIR\n[3] MULTIPLICAR\n[4] DIVIDIR\n");
    int decisao = sc.nextInt();
    sc.close();

    if (decisao==1){
      for (int i = 1; i <= 10; i++){
        System.out.printf("%d + %d = %d\n", num, i, num+i);
      }
    }
    else if(decisao==2){
      for (int i = 1; i <= 10; i++){
        System.out.printf("%d - %d = %d\n", num, i, num-i);
      }
    }
    else if(decisao==3){
      for (int i = 1; i <= 10; i++){
        System.out.printf("%d x %d = %d\n", num, i, num*i);
      }
    }
    else if(decisao==4){
      for (int i = 1; i <= 10; i++){
        System.out.printf("%d / %d = %d\n", num, i, num/i);
      }
    }
    else{
      System.out.println("CÓDIGO INVÁLIDO!");
    }














  }
}
