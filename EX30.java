package src.src;

import java.util.Scanner;

public class EX30 {
  public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int i = 1;
    int somaAluno = 0;
    int qtdTurma = 0;

    while (true){
      System.out.printf("%dª turma. Quantos alunos há? ", i++);
      int aluno = sc.nextInt();
      
      if (aluno == -1){
        break;
      }
      else if (aluno >= 40){
        System.out.println("Número inválido de alunos. Cada sala comporta menos de 40 alunos!");
        System.out.println("Digite novamente!");
        continue;
      }
      else if (aluno < 40){
        qtdTurma = qtdTurma +1;
        somaAluno = somaAluno + aluno;
      }
    }
    sc.close();

    System.out.println("Qtd turmas registradas: " + qtdTurma);
    System.out.println("Alunos Registrados: " + somaAluno);
    System.out.println("Média de aluno por turma: " + somaAluno / qtdTurma);

  }
}
