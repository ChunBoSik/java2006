package t2_for;

public class Test5 {
  public static void main(String[] args) {
    /* 1~100까지의 짝수합 */
    int i = 0;
    int tot = 0;
    
    while(i < 100) {
      i = i + 2;
      tot = tot + i;
    }
    
    System.out.println("1~100까지의 짝수합 " + tot);
  }
}
