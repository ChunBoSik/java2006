package t3;

public class Test8 {
  public static void main(String[] args) {
    /*  6  5  4
     *  3  2
     *  1
     */
    int k = 7;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=4-i; j++) {
        k--;
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
