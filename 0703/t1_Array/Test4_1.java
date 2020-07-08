package t1_Array;

import java.util.Scanner;

public class Test4_1 {
  public static void main(String[] args) {
    /* 한반의 인원은 최대 50명이다. 국어/영어/수학 3과목을 입력받아 총점을 구하세요. */
    Scanner sc = new Scanner(System.in);
    
    String name;
    int kor, eng, mat, tot;
    
    System.out.print("성명을 입력하세요? ");
    name = sc.nextLine();
    System.out.print("국어 점수를 입력하세요? ");
    kor = sc.nextInt();
    System.out.print("영어 점수를 입력하세요? ");
    eng = sc.nextInt();
    System.out.print("수학 점수를 입력하세요? ");
    mat = sc.nextInt();
    
    tot = kor + eng + mat;
    
    System.out.println("성명은? " + name);
    System.out.println("국어점수는? " + kor);
    System.out.println("영어점수는? " + eng);
    System.out.println("수학점수는? " + mat);
    System.out.println("총점은? " + tot);
    
    sc.close();
  }
}
