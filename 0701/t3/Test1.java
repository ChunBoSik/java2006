package t3;

public class Test1 {
  /*   1  2  3
   *   4  5  6
   *   7  8  9
   */
  public static void main(String[] args) {
    for(int i=1; i<=9; i++) {
      System.out.print(i + "  ");
      if(i % 3 == 0)
        System.out.println();
    }
  }
}
