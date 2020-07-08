package t2;

import java.util.Scanner;

public class Test7 {
  public static void main(String[] args) {
    /* 사용자가 구구단의 시작단(sdan)과 끝단(edan)을 입력받아서 구구단을 출력하시오 */
    /* 항상 시작단이 끝단보다 작도록 출력하시오 */ 
    Scanner sc = new Scanner(System.in);
    int gob, sdan, edan;
    
    System.out.print("출력할 구구단의 시작단을 입력하세요? ");
    sdan = sc.nextInt();
    
    System.out.print("출력할 구구단의 끝단을 입력하세요? ");
    edan = sc.nextInt();
    
    // 시작단이 항상 작은 단이 되도록 처리한다.
    int temp;
    // 아래는 두개의 값을 교환한다.
    if(sdan > edan) {
      temp = sdan;
      sdan = edan;
      edan = temp;
      // temp = sdan ; sdan = edan ; edan = temp;  
    }
    
    for(int i=sdan; i<=edan; i++) {
      System.out.println("===="+i+"단====");
      for(int j=1; j<=10; j++) {
        gob = i * j;
        System.out.println(i + " * " + j + " = " + gob);
      }
      System.out.println("----------------");
    }
    sc.close();
  }
}
