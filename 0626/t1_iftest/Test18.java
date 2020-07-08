package t1_iftest;

import java.util.Scanner;

public class Test18 {
  public static void main(String[] args) {
    /* (switch case문 사용할것)  점수를 입력받아 
       90점 이상은 A학점/80점 이상은 B학점/70점 이상은 C학점/60점 이상은 D학점/나머지는 F학점  */
    Scanner sc = new Scanner(System.in);
    char gr;
    
    System.out.print("점수를 입력하세요! ");
    int su = sc.nextInt();
    
    switch(su/10) {
//      case 10:
//        gr = 'A';
//        break;
      case 10:
      case 9:
        gr = 'A';
        break;
      case 8:
        gr = 'B';
        break;
      case 7:
        gr = 'C';
        break;
      case 6:
        gr = 'D';
        break;
      default :
        gr = 'F';
    }
    System.out.println("입력한 점수 " + su + " 는 " + gr + " 학점입니다.");
    
    sc.close();
  }
}
