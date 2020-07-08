package t3;

public class Test2 {
  // 아래 내용을 이중for문을 사용하여 처리하시오
  /*   1  2  3
   *   4  5  6
   *   7  8  9
   */
  public static void main(String[] args) {
    int k = 0;
    
    for(int i=1; i<=3; i++) {
      for(int j=1; j<=3; j++) {
        k++;
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }
}
