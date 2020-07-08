package t1_Array;

import java.util.Scanner;

public class Test4_3 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명이다. 국어/영어/수학 3과목을 입력받아 총점을 구하세요. */
    Scanner sc = new Scanner(System.in);
    
    String name;
    String[] title = {"국어","영어","수학","총점"};
    int[] jum = new int[4];
    
    System.out.print("성명을 입력하세요? ");
    name = sc.nextLine();
    
    for(int i=0; i<jum.length-1; i++) {
      System.out.print(title[i]+"점수를 입력하세요? ");
      jum[i] = sc.nextInt();
      jum[3] += jum[i];
    }
    
    System.out.println("성명은? " + name);
    for(int i=0; i<jum.length; i++) {
      System.out.println(title[i]+" = " + jum[i]);
    }
    
    sc.close();
  }
}
