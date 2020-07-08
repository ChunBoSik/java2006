package t2;

public class Test3 {
  public static void main(String[] args) {
    /* 1~5단까지를 출력하세요 */
    int gob;
    
    for(int i=1; i<=5; i++) {
      System.out.println("===="+i+"단====");
      for(int j=1; j<=10; j++) {
        gob = i * j;
        System.out.println(i + " * " + j + " = " + gob);
      }
      System.out.println("----------------");
    }
  }
}
