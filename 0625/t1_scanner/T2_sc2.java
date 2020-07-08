package t1_scanner;

import java.util.Scanner;

public class T2_sc2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String name;
    int kor, eng, tot;
    double avg;
    
    System.out.print("성명을 입력하세요? ");
    name = sc.nextLine();
    System.out.print("국어점수를 입력하세요? ");
    kor = sc.nextInt();
    System.out.print("영어점수를 입력하세요? ");
    eng = sc.nextInt();

    tot = kor + eng;
    System.out.println("성명 : " + name);
    System.out.println("국어 점수 : " + kor);
    System.out.println("영어 점수 : " + eng);
    System.out.println("총점 : " + tot);
    
    //avg = tot / 2.0;
    avg = (double) tot / 2;
    //avg = (double) (tot / 2);
    System.out.println("평균점수 : " + avg);
    
    sc.close();
  }
}
