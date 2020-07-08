package t1_switchCase;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* 주사위를 던져서 나오는 숫자를 맞추시오? */
    int su;
    int res = (int)(Math.random()*6) + 1;
    
    System.out.print("주사위가 표시될 숫자를 입력하세요? ");
    su = sc.nextInt();
    
    if(su == res)
      System.out.println("맞추셨습니다.");
    else {
      System.out.println("아쉽게도 틀렸군요....");
      System.out.println("=====================");
      System.out.println("주사위의 값은? " + res + "였습니다.");
    }
    
    sc.close();
  }
}
