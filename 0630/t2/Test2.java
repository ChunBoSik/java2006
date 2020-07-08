package t2;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String str;
    boolean res=true;
    
    while(res) {
      System.out.print("계속 하시겠습니까?(종료시 no) ");
      str = sc.nextLine();
      
      //if(str == "no") {
      if(str.equals("no")) {
        System.out.println("작업중지!");
        res=false;    // break;
      }
      else {
        System.out.println("작업계속~~~~");
      }
    }
    System.out.println("작업끝!!!!!!!");
  }
}
