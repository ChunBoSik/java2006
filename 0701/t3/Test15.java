package t3;

import java.util.Scanner;

public class Test15 {
  public static void main(String[] args) {
    /* 예금액 구하기 */
    boolean run = true;
    int balance = 0;
    int no, res;
    Scanner sc = new Scanner(System.in);
    
    while(run) {
      System.out.println("------------------------------");
      System.out.println("1.예금  | 2.출금  | 3.잔고 | 4.종료");
      System.out.println("------------------------------");
      System.out.print("선택> ");
      no = sc.nextInt();
      
      switch(no) {
        case 1:
          System.out.print("예금액> ");
          res = sc.nextInt();
          balance += res;
          break;
        case 2:
          System.out.print("출금액> ");
          res = sc.nextInt();
          balance -= res;
          break;
        case 3:
          System.out.print("잔고> " + balance);
          System.out.println();
          break;
        default :
          run = false;
      }
    }
    System.out.println("프로그램 종료!!!- 수고하셨습니다. -");
  }
}
