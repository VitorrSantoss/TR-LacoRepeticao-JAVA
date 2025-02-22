package src.src;

public class EX38 {
  public static void main(String[] args) {
    
    double juros = 1.5/100;
    double salarioContrato = 1000;

    for (int i = 1996; i<=2025; i++){
      salarioContrato += salarioContrato * juros;
      juros *=2;
    }
    System.out.printf("Salário: %.2f\n",salarioContrato);
    
  
  }
}
