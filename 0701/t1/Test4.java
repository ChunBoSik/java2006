package t1;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    /* 컴퓨터가 1~100까지의 수를 기억하고, 사람이 그 수를 맞추는 프로그램...
       - 예를 들어, 컴퓨터가 기억한 숫자가 27일때, 사람이 50을 입력하면 '더 작은수를 입력하세요'라는 메세지,
         20을 입력하면 '더 큰수를 입력하세요' 라고 출력시켜준다. 최종적으로 맞춘 횟수를 출력한다.
       - 단, 기회는 5번 이다. 
    */
    Scanner sc = new Scanner(System.in);
    int com, person, cnt=0;
    
    System.out.println("--> 1~100까지의 숫자를 맞추는 게임!!! <----");
    
    com = (int)(Math.random()*100) + 1;

    while(true) {
      if(cnt == 5) {
        System.out.println("5번 시도하셔서 모두 틀렸습니다. 컴퓨터가 기억한 숫자는? " + com);
        System.out.print("다시 시도하시려면 0을 입력하세요! ");
        person = sc.nextInt();
        if(person == 0) {
          com = (int)(Math.random()*100) + 1;
          cnt = 0;
          System.out.println("===================================");
        }
        else break;
      }
      cnt++;
      System.out.print("숫자를 입력하세요! ");
      person = sc.nextInt();
    
      if(person <=0 || person > 100) {
        System.out.println("숫자는 1~100까지의 숫자만 입력하세요!");
        continue;
      }
      
      if(person > com) {
        System.out.println("수행횟수 : "+cnt+" , 더 작은 수를 입력하세요..");
        continue;
      }
      else if(person < com){
        System.out.println("수행횟수 : "+cnt+" , 더 큰 수를 입력하세요..");
        continue;
      }
      else {
        System.out.println("정답입니다. " + cnt + " 번 만에 맞추셨군요!");
        break;
      }
    }
    System.out.println("수고 하셨습니다."); 
    sc.close();
  }
}
