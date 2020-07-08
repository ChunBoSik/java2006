package array1;

// 배열 복사
public class Test6 {
  public static void main(String[] args) {
    int[] source = {5, 3, 1, 6, 4};
    int[] target = new int[source.length];
    
    for(int i=0; i<source.length; i++) {
      target[i] = source[i];
    }
    
    // source자료 출력
    System.out.println("원본자료 출력");
    for(int i=0; i<source.length; i++) {
      System.out.print("source["+i+"]=" + source[i] + " / ");
    }
    System.out.println();
    
    System.out.println("복사자료 출력");
    for(int i=0; i<source.length; i++) {
      System.out.print("target["+i+"]=" + target[i] + " / ");
    }
  }
}
