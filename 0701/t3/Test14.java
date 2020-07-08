package t3;

public class Test14 {
  public static void main(String[] args) {
    /*  4x + 5y = 60 */
    int res;
    
    for(int x=1; x<=10; x++) {
      for(int y=1; y<=10; y++ ) {
        res = 4*x + 5*y;
        if(res == 60) {
          System.out.println("("+x+","+y+")="+res);
        }
      }
    }
    
  }
}
