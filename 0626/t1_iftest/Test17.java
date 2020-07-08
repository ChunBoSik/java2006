package t1_iftest;

import java.util.Scanner;

public class Test17 {
  public static void main(String[] args) {
    /* 부서코드(A:인사과, B:총무과, C:생산과, D:자재과, 기타:영업과 */
    /* 부서코드를 입력받아 해당과를 출력하시오 */
    
    Scanner sc = new Scanner(System.in);
    char cod;
    String buser;
    
    System.out.print("부서코드를 입력하세요?(A:인사과,B:총무과,C:생산과,D:자재과,기타:영업과)");
    cod = sc.nextLine().charAt(0); // 문자열의 첫번째 문자만 입력받는다.
    
    switch(cod) {
      case 'A':
        buser = "인사과";
        break;
      case 'B':
        buser = "총무과";
        break;
      case 'C':
        buser = "생산과";
        break;
      case 'D':
        buser = "자재과";
        break;
      default :
        buser = "영업과";
    }
    System.out.println("입력한 코드? " + cod + " , 부서명 : " + buser);
    
    sc.close();
  }
}
