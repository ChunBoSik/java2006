package t1;

public class Test2 {
  public static void main(String[] args) {
    /* 두개의 주사위의 눈의 합이 5가 될때까지 반복수행 */
    /* 총 수행 횟수도 함께 출력하시오 */
    int cnt = 0;
    
    while(true) {
      cnt++;
      int su1 = (int) (Math.random()*6) + 1;
      int su2 = (int) (Math.random()*6) + 1;
      System.out.println(cnt + " = ("+su1+","+su2+")");
      if((su1+su2) == 5) break;
    }
    System.out.println("두 주사위의 눈금합이 5일때까지 던진 회수는? " + cnt + "회");
  }
}
