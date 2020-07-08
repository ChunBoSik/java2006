package t2_for;

public class Test8 {
  public static void main(String[] args) {
    /* 1~100까지의 합을 구하되 그사이에 각 10항씩의 값을 출력하시오. */
    int i = 0;
    int tot = 0;
    
    while(i < 100) {
      i = i + 1;
      tot = tot + i;
      if(i % 10 == 0) {
        System.out.println("1에서 " + i + "까지의 합은? " + tot);
      }
    }
    
  }
}
