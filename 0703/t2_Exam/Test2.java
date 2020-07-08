package t2_Exam;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    /* 최대값 /최소값을 구하시오(단, 입력되는 수는 두자리 이하의 정수)*/
    Scanner sc = new Scanner(System.in);
    int max = -99;
    int min = 99;
    int cnt = 0, su;
    
    while(true) {
      cnt++;
      System.out.print(cnt + "번째 수를 입력하세요?(종료는 0) ");
      su = sc.nextInt();
      if(su == 0) break;
      
      if(su > max) max = su;
      if(su < min) min = su;
    }
    System.out.println("최대값? " + max);
    System.out.println("최소값? " + min);
    sc.close();
  }
}
