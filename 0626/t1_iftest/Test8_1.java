package t1_iftest;

import java.util.Scanner;

public class Test8_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int su;
    char gr;
    
    System.out.print("점수를 입력하세요!!! ");
    su = sc.nextInt();
    
    if (su >= 90) {
      gr = 'A';
    } else if (su >= 80) {
      gr = 'B';
    } else if (su >= 70) {
      gr = 'C';
    } else if (su >= 60) {
      gr = 'D';
    } else {
      gr = 'F';
    }
    
    System.out.println("입력한 점수는? " + su);
    System.out.println("학점은 ? " + gr);
    
    sc.close();
  }
}
