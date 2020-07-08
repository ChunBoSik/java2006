package t2;

public class Test5 {
  public static void main(String[] args) {
    /* 1~5단까지를 출력하세요 */
    /* 각 단의 홀수항값만을 출력하세요 */
    int gob;
    
    for(int i=1; i<=5; i++) {
      System.out.println("===="+i+"단====");
      for(int j=1; j<=10; j=j+2) {
        gob = i * j;
        System.out.println(i + " * " + j + " = " + gob);
      }
      System.out.println("----------------");
    }
  }
}
