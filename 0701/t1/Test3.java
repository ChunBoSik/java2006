package t1;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    /* 1개의 주사위를 던져서 나오는 값을 알아 맞추는 게임(최종적으로 맞춘 회수를 출력) */
    Scanner sc = new Scanner(System.in);
    int su = (int) (Math.random())*6 + 1;
    int person, cnt = 0;
    
    System.out.println("* 주사위 눈금 맞추기 게임 *");
    
    while(true) {
      cnt++;
      System.out.print("주사위 값은 얼마일까요? ");
      person = sc.nextInt();
      
      if(person <= 0 || person > 6) {
        System.out.println("1~6까지의 값만 입력하세요!");
        continue;
      }
      
      if(su != person) {
        System.out.println("아깝습니다. 다시 입력하세요!");
        //continue;
      }
      else break;
    }
    System.out.println("정답입니다. 맞추신 횟수는? " + cnt + " 이군요.");
    sc.close();
  }
}
