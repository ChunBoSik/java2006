package t1_Array;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명이다. 국어/영어/수학 3과목을 입력받아 총점을 구하세요. */
    Scanner sc = new Scanner(System.in);
    
    String name;
    String[] title = {"국어","영어","수학","총점"};
    int[] jum = new int[4];
    int cnt = 1;
    double banAvg = 0.0;
    
    while(true) {
      System.out.print(cnt+": 성명을 입력하세요?(종료시는 0 을입력) ");
      name = sc.next();
      if(name.equals("0")) break;
      
      for(int i=0; i<jum.length-1; i++) {
        System.out.print(title[i]+"점수를 입력하세요? ");
        jum[i] = sc.nextInt();
        jum[3] += jum[i];
      }
    
      System.out.println(cnt+": 성명은? " + name);
      for(int i=0; i<jum.length; i++) {
        System.out.println(title[i]+" = " + jum[i]);
      }
      banAvg += jum[3];
      jum[3] = 0;
      System.out.println("--------------------");
      cnt++;
    }
    System.out.println("====================");
    System.out.println("반평균은? " + (banAvg / (cnt-1)));
    
    sc.close();
  }
}
