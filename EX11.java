package src.src;

import java.util.Scanner;

public class EX11 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("1º Valor: ");
    int num1 = sc.nextInt();
    System.out.print("2º Valor: ");
    int num2 = sc.nextInt();
    sc.close();

    int inicio, fim;

    if (num1 < num2){
      inicio = num1;
      fim = num2;
    }
    else{
      inicio = num2;
      fim = num1;
    }
    
    int soma =0;

    for (int j = inicio +1; j<fim; j++){
      System.out.println(j);
      soma = soma + j;
    } 
    System.out.println(soma);

  }
}
