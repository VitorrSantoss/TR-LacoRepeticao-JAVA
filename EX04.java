package src.src;



public class EX04 {
  public static void main(String[] args) {
    
    double popA = 80000;
    double popB = 200000;
    double crescimentoA = 0.03;
    double crescimentoB = 0.015;
    int qtdAno = 0;
    
    while (popA < popB) {

      popA = popA + popA * crescimentoA; 
      popB = popB + popB * crescimentoB;
      qtdAno +=1;
      
    }
    System.out.println(qtdAno);



  }
}
