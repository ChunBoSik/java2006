package t1_scanner;

import java.util.Scanner;

public class T1_sc1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int su1, su2;
    
    System.out.print("첫번째수를 입력하세요... ");
    su1 = sc.nextInt();
    System.out.print("두번째수를 입력하세요... ");
    su2 = sc.nextInt();
    
    System.out.println("두수의 합은? " + (su1 + su2));
    sc.close();
  }
}
