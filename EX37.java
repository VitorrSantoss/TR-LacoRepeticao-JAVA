package src.src;

import java.util.Scanner;

public class EX37 {
  public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    double maior = -1;
    double menor = 999;
    double gordo = -1;
    double magro = 999;
    int code, codeMaior=-1, codeMenor=-1, codeGordo=-1, codeMagro=-1;
 
    while (true) {

      System.out.print("Código Aluno: ");
      code = sc.nextInt();

      if (code == -1){
        break;
      }

      System.out.printf("Aluno %d, qual é sua altura? ", code);
      double altura = sc.nextDouble();

      System.out.printf("Aluno %d, qual é seu peso? ", code);
      double peso = sc.nextDouble();
      
      // CONDIÇÃO DE ENCERRAMENTO DO PROGRAMA
      // 1ª VERIFICAÇÃO
      if (altura > maior){
        maior = altura;
        codeMaior =code;
      }
      else if (altura < menor){
        menor = altura;
        codeMenor = code;
      }
      // 2ª VERIFICAÇÃO 
      if (peso > gordo){
        gordo = peso;
        codeGordo = code;
      }
      else if (peso< magro){
        magro = peso;
        codeMagro = code;
      }
 
    }
    sc.close();

    System.out.printf("Aluno %d é o mais alto com %.2f metros\n", codeMaior, maior );
    System.out.printf("Aluno %d é o mais baixo com %.2f metros\n", codeMenor, menor );
    System.out.printf("Aluno %d é o mais gordo com %.1f Kg\n", codeGordo, gordo );
    System.out.printf("Aluno %d é o mais magro com %.1f Kg\n", codeMagro, magro );







  }
}
