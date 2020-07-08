package t3_operation;

import java.util.Scanner;

public class Test5_2 {
  public static void main(String[] args) {
    /* 2.두수를 입력받아서 큰수를 출력하되 두수의 결과가 같을경우는 첫번째수를 출력
     * 하시오.(삼항연산자를 두번 사용한다)
     */
    Scanner sc = new Scanner(System.in);
    int su1, su2;
    String str;
    
    System.out.print("첫번째수를 입력하세요!");
    su1 = sc.nextInt();
    System.out.print("두번째수를 입력하세요!");
    su2 = sc.nextInt();
    
    str = su1>su2 ? "수1("+su1+")이 더 크다" : su1 == su2 ? "수1과 수2는 같다" : "수2("+su2+")가 더 크다";
    System.out.println(str);
    
    sc.close();
  }
}
