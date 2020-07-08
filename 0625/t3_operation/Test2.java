package t3_operation;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    /* 수를 입력받아서 3으로 나눈 몫과 나머지를 구하시오 */
    Scanner sc = new Scanner(System.in);
    
    int su, mok, na;
    
    System.out.print("수를 입력하세요? ");
    su = sc.nextInt();
    
    mok = su / 3;
    na = su % 3;
    
    System.out.println("입력된 수는 ? " + su);
    System.out.println("3으로 나눈 몫은? " + mok);
    System.out.println("3으로 나눈 나머지는? " + na);
  }
}
