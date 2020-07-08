package array1;

// Selection Sort(오름차순)
public class Test1 {
  public static void main(String[] args) {
    int[] su = {6,2,8,5,4,7};
    int temp;
    
    System.out.println("정렬 전의 자료!");
    for(int i=0; i<su.length; i++) {
      System.out.print("su["+i+"]=" + su[i] + "  ");
    }
    System.out.println();
    System.out.println("-----------------------");
    
    // Selection Sort(오름차순)
    for(int i=1; i<=5; i++) {
      for(int j=i+1; j<=6; j++) {
        if(su[i-1]>su[j-1]) {
          temp = su[i-1];
          su[i-1] = su[j-1];
          su[j-1] = temp;
        }
      }
    }
    
    // 출력
    System.out.println("정렬 후의 자료!");
    for(int i=0; i<su.length; i++) {
      System.out.print("su["+i+"]=" + su[i] + "  ");
    }
  }
}
