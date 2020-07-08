package t2;

public class Test6 {
  public static void main(String[] args) {
    /* 1~5단까지를 출력하세요 */
    /* 곱한 결과가 3의 배수만 출력하시오 */
    int gob;
    
    for(int i=1; i<=5; i++) {
      System.out.println("===="+i+"단====");
      for(int j=1; j<=10; j++) {
        gob = i * j;
        if(gob % 3 == 0)
          System.out.println(i + " * " + j + " = " + gob);
      }
      System.out.println("----------------");
    }
  }
}
