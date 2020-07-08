package t3;

public class Test7 {
  public static void main(String[] args) {
    /*  1
     *  2  3
     *  4  5  6
     */
    int k = 0;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=i; j++) {
        k++;
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
