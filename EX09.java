package src.src;

public class EX09 {
  public static void main(String[] args) {
    
    int i =1;
    while (i <=50){
      if (i %2 !=0){
        System.out.print(i + " ");
      }
     i++; 
    }

    for (int j =1; j<=50; j++){
      if (j %2 !=0){
        System.out.print(j + " ");
      }
    }

    //////////////////////////////////////////////////////////////
    
    int k =1;
    while (k<=50) {
      System.out.print(k + " ");
      k = k +2;
    }

    for (int l = 1; l <=50; l+=2){
      System.out.print(l + " ");
    }




  }
}
