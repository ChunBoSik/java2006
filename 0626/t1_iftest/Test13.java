package t1_iftest;

import java.util.Scanner;

public class Test13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /* 1. 세수를 입력받아서 가장 큰수를 출력하시오 */
    int su1, su2, su3;
    String max, min;
    
    System.out.print("첫번째 수를 입력하세요? ");
    su1 = sc.nextInt();
    System.out.print("두번째 수를 입력하세요? ");
    su2 = sc.nextInt();
    System.out.print("세번째 수를 입력하세요? ");
    su3 = sc.nextInt();
    
    if(su1 > su2) {
      if(su1 > su3)
        max = "가장큰수는 su1 : " + su1;
      else
        max = "가장큰수는 su3 : " + su3;
    }
    else {
      if(su2 > su3)
        max = "가장큰수는 su2 : " + su2;
      else
        max = "가장큰수는 su3 : " + su3;
    }
    
    System.out.println(max);
    
    
    /* 2. 세수를 입력받아서 가장 작은수를 출력하시오 */
    if(su1 < su2) {
      if(su1 < su3)
        min = "가장작은수는 su1 : " + su1;
      else
        min = "가장작은수는 su3 : " + su3;
    }
    else {
      if(su2 < su3)
        min = "가장작은수는 su2 : " + su2;
      else
        min = "가장작은수는 su3 : " + su3;
    }
    
    System.out.println(min);
    
    sc.close();
  }
}
