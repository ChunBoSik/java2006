package array1;

// 배열복사(arraycopy()메소드를 이용한 배열의 복사)
// arraycopy(원본배열명, 원본배열시작위치, 타겟배열명, 타겟배열시작위치, 복사횟수);
// 원본배열의 크기보다 타겟배열의 크기가 같거나 커야한다.
public class Test8 {
  public static void main(String[] args) {
    int[] source = {5, 3, 1, 6, 4};
    int[] target = new int[source.length];
    
    //System.arraycopy(source, 0, target, 0, source.length);
    System.arraycopy(source, 0, target, 0, 3);
    
    int cnt=0;
    for(int i : source) {
      System.out.print("source["+cnt+"]=" + i + " / ");
      cnt++;
    }
    System.out.println();
    
    cnt=0;
    for(int i : target) {
      System.out.print("target["+cnt+"]=" + i + " / ");
      cnt++;
    }
    System.out.println();
  }
}
