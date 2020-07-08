package t2_for;

public class Test6 {
  public static void main(String[] args) {
    /* 1~100까지의 홀수합 */
    int i = -1;
    int tot = 0;
    
    while(i < 99) {
      i = i + 2;
      tot = tot + i;
    }
    
    System.out.println("1~100까지의 홀수합 " + tot);
  }
}
