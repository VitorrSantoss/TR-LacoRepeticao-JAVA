package src.src;

import java.util.Scanner;

public class EX02 {
  public static void main(String[] args) {
    
    Scanner sc  =  new Scanner(System.in);
    System.out.print("Usuário: ");
    String user = sc.nextLine();
    System.out.print("Senha: ");
    String password = sc.nextLine();

    while (password.equals(user)){
      System.out.println("Senha Inválida! Digite uma nova senha.");
      password = sc.nextLine();
    }
    sc.close();
    System.out.println("Senha Aprovada!");

  }
}
