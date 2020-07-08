package array2;

public class Test3 {
  public static void main(String[] args) {
    int[][] su = {
        {100,90,80},
        {90,80,70},
        {70,60,60}
    };
    
    for(int i=0; i<su.length; i++) {
      for(int j=0; j<su[0].length; j++) {
        System.out.println("su["+i+"]["+j+"]=" + su[i][j]);
      }
    }
  }
}
