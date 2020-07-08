package t1;

public class Test3 {
  public static void main(String[] args) {
    /* -1 + 1/2 - 2/3 + 3/4 - 4/5 + 5/6 - 6/7 + 7/8 - 8/9 + 9/10 = ? */
    int s=1;
    double  i=1.0, tot=-1.0;
    
    while(i < 10) {
      i = i + 1; // 1번
      s = s * (-1); // 2번
      tot = tot + (((i-1)/i)*s);  // 3번
    }
    System.out.println("~~결과는~~" + tot);
  }
}
