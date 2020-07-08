package array1;

import java.util.Scanner;

// Bubble Sort(오름차순) - 자료 입력처리(입력자료는 100개 이하)
public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] su = new int[100];
    int temp, cnt=0;
    
    // 자료 입력루틴
    while(true) {
      System.out.print("정렬할 원본 자료를 입력하세요?(종료시는 999) ");
      su[cnt] = sc.nextInt();
      
      if(su[cnt] == 999) break;
      
      cnt++;
    }
    
    
    System.out.println("정렬 전의 자료!");
    for(int i=0; i<cnt; i++) {
      System.out.print("su["+i+"]=" + su[i] + "  ");
    }
    System.out.println();
    System.out.println("-----------------------");
    
    // Bubble Sort(오름차순)
    for(int i=1; i<=cnt-1; i++) {
      for(int j=1; j<=cnt-i; j++) {
        if(su[j-1]>su[j]) {
          temp = su[j-1];
          su[j-1] = su[j];
          su[j] = temp;
        }
      }
    }
    
    // 출력
    System.out.println("정렬 후의 자료!");
    for(int i=0; i<cnt; i++) {
      System.out.print("su["+i+"]=" + su[i] + "  ");
    }
    
    sc.close();
  }
}
