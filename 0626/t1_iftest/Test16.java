package t1_iftest;

import java.util.Scanner;

public class Test16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("등급을 입력하세요(1~5)? ");
    int su = sc.nextInt();
    String gr;
    
    switch(su) {
      case 1:
        gr = "1등급";
        break;
      case 2:
        gr = "2등급";
        break;
      case 3:
        gr = "3등급";
        break;
      case 4:
        gr = "4등급";
        break;
      default:
        gr = "5등급";
    }
    System.out.println("입력된 수?" + su);
    System.out.println("등급은? " + gr);
  }
}
