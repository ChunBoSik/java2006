package t3;

import java.util.Scanner;

public class Test13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("출력할 행의 수를 홀수로 입력하세요!");
    int star = sc.nextInt();
    int top = star/2 + 1;
    int bottom = star/2;
    int k=-1;
    
    for(int i=0; i<top; i++) {
      for(int j=0; j<top-i; j++) {
        System.out.print(" ");
      }
      k = k + 2;  // k += 2
      for(int j=0; j<k; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    for(int i=0; i<bottom; i++) {
      for(int j=0; j<=i+1; j++) {
        System.out.print(" ");
      }
      k = k - 2;    // k-=2
      for(int j=0; j<k ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
