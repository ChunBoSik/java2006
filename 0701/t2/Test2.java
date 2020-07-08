package t2;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    /* 입력한 '단' 을 출력하는 프로그램 */
    Scanner sc = new Scanner(System.in);
    int gob;
    
    System.out.print("출력한 '단'을 입력하세요! ");
    int dan = sc.nextInt();
    
    for(int i=1; i<=10; i++) {
      gob = dan * i;
      System.out.println(dan + " * " + i + " = " + gob);
    }
    
    sc.close();
  }
}
