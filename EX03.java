package src.src;

import java.util.Scanner;

public class EX03 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Validação de Entradas:");

    System.out.print("Nome: ");
    String name = sc.nextLine();

    while (name.length()<=3){
      System.out.println("Caracteres insuficiente! Digite novamente.");
      name = sc.nextLine();
    }

    System.out.print("Idade: ");
    int age = sc.nextInt();

    while (age <0 || age >150){
      System.out.println("Idade inexistente! Digite novamente!");
      age = sc.nextInt();
    }

    sc.nextLine();

    System.out.print("Salário: R$ ");
    double salary = sc.nextDouble();

    while (salary <= 0){
      System.out.println("Salário Inexistente! Digite novamente.");
      salary = sc.nextDouble();
    }

    sc.nextLine();

    System.out.print("Sexo: (M) / (F): ");
    String sexo = sc.nextLine().toUpperCase();
    
    while (!sexo.equals("M") && !sexo.equals("F"))  {
      System.out.println("Sexo Inválido! Digite novamente.");
      sexo = sc.nextLine().toUpperCase();
    }

    System.out.print("Estado Cívil: (S) / (C) / (V) / (D): ");
    String estadoCivil = sc.nextLine().toUpperCase();
    

    while (!estadoCivil.equals("S") && !estadoCivil.equals("C") && !estadoCivil.equals("V") && !estadoCivil.equals("D")){
      System.out.println("Estado Cívil Inválido! Digite novamente!");
      estadoCivil = sc.nextLine().toUpperCase();
    }
    sc.close();
    System.out.println("Validação Concluída!");
  
  }
}
