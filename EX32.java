package src.src;

public class EX32 {
  public static void main(String[] args) {

    double price = 1.99;
    System.out.println("TABELA DE PREÇOS");
    for (int i = 1; i<=50; i++){
      System.out.printf("%d -> R$ %.2f\n", i, (i*price));
    }
  }
}
