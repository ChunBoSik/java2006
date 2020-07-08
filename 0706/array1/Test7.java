package array1;

// 원본 배열의 내용중 짝수번째 자료만 목적배열에 복사하시오.
public class Test7 {
  public static void main(String[] args) {
    int[] source = {5, 3, 1, 6, 4};
    int[] target = new int[source.length];
    
    for(int i=0; i<source.length; i+=2) {
      target[i] = source[i];
    }
    
    // source자료 출력
    System.out.println("원본자료 출력");
//    for(int i=0; i<source.length; i++) {
//      System.out.print("source["+i+"]=" + source[i] + " / ");
//    }
    // 향상된 for문 형식 : for(타입 변수 : 배열명) { }
    int cnt=0;
    for(int i : source) {
      System.out.print("source["+cnt+"]=" + i + " / ");
      cnt++;
    }
    System.out.println();
    
    System.out.println("복사자료 출력");
//    for(int i=0; i<source.length; i++) {
//      System.out.print("target["+i+"]=" + target[i] + " / ");
//    }
    cnt=0;
    for(int i : target) {
      System.out.print("target["+cnt+"]=" + i + " / ");
      cnt++;
    }
  }
}
