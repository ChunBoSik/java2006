package t1_iftest;

import java.util.Scanner;

public class Test10 {
  public static void main(String[] args) {
    /* 성명, 국어, 영어 점수를 입력받은후 총점/평균/학점을 계산 출력 */
    Scanner sc = new Scanner(System.in);
    String name;
    int kor,eng,tot;
    double avg;
    char gr;
    
    System.out.print("성명을 입력하세요? ");
    name = sc.nextLine();
    System.out.print("국어점수를 입력하세요? ");
    kor = sc.nextInt();
    System.out.print("영어점수를 입력하세요? ");
    eng = sc.nextInt();
    
    tot = kor + eng;
    avg = (double) tot / 2;
    if(avg >= 90) gr='A';
    else if(avg >= 80) gr='B';
    else if(avg >= 70) gr='C';
    else if(avg >= 60) gr='D';
    else gr='F';
    
    System.out.println("입력하신 성명은? " + name);
    System.out.println("입력하신 국어 점수는? " + kor);
    System.out.println("입력하신 영어 점수는? " + eng);
    System.out.println("총점은? " + tot);
    System.out.println("평균은? " + avg);
    System.out.println("학점은? " + gr);
    
    sc.close();
  }
}








