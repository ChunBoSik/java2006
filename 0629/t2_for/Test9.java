package t2_for;

import java.util.Scanner;

public class Test9 {
  public static void main(String[] args) {
    /* do ~ while */
    /* 시험을 치른후 결과가 60점 미만이면 계속해서 재시험을 본다. */
    /* 몇번 시험을 치뤄서 60점을 통과했는지 출력하시오 */
    Scanner sc = new Scanner(System.in);
    
    int jumsu, cnt=0;
    
    do {
      System.out.print("점수를 입력하세요!!! ");
      jumsu = sc.nextInt();
      cnt++;
    } while(jumsu < 60);
    
    // 총 시험본 횟수
    System.out.println("총 시험본 횟수? " + cnt + "회...");
    
    sc.close();
  }
}
