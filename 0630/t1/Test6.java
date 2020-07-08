package t1;

public class Test6 {
  public static void main(String[] args) {
    /* 1~100까지의 홀수합과 짝수합을 각각 구하여 출력하시오(스위칭 기법으로 구하기) */
    // 변수 선언, i, odd(홀수합), even(짝수합), sw(스위치)
    int i=0, odd=0, even=0, sw=0;
    
    while(i<100) {
      i = i + 1;
      if(sw == 0) {     // 1번
        odd = odd + i;  // 2번
        sw = 1;         // 3번
      }
      else {
        even = even + i; // 4번
        sw = 0;          // 5번
      }
    }
    System.out.println("1~"+i+"까지의 홀수합은? " + odd);
    System.out.println("1~"+i+"까지의 짝수합은? " + even);
  }
}
