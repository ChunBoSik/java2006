package array2;

public class Test4 {
  public static void main(String[] args) {
    int[][] su = {
        {100,90,80},
        {90,80,70},
        {70,60}
    };
    
    for(int i=0; i<su[0].length; i++) {
      System.out.println("su[0]["+i+"]=" + su[0][i]);
    }
    System.out.println();
    
    for(int i=0; i<su[1].length; i++) {
      System.out.println("su[1]["+i+"]=" + su[1][i]);
    }
    System.out.println();
    
    for(int i=0; i<su[2].length; i++) {
      System.out.println("su[2]["+i+"]=" + su[2][i]);
    }
    
  }
}
