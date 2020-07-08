package t1;

public class Test1 {
  public static void main(String[] args) {
    /* 두개의 주사위의 눈의 합이 5가 될때까지 반복수행 */
    while(true) {
      int su1 = (int) (Math.random()*6) + 1;
      int su2 = (int) (Math.random()*6) + 1;
      System.out.println("("+su1+","+su2+")");
      if((su1+su2) == 5) break;
    }
  }
}
