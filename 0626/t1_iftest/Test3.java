package t1_iftest;

public class Test3 {
  public static void main(String[] args) {
    int su1=10, su2=20, su3=30;
    int x, y;
    
    if(su1 > su2) {
      if(su1 > su3) {
        x = su1 + su2;
      }
      else {
        x = su1 / su2;
      }
    }
    else {
      x = su1 - su2;
    }
    
    y = su1 * su2;
    
    System.out.println("x=" + x + " , y=" + y);
  }
}
