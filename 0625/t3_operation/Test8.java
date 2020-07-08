package t3_operation;

public class Test8 {
  public static void main(String[] args) {
    int su1=0, su2=0;
    
    su1 = su1 + 1;  // su1++  , ++su1
    System.out.println("su1 = " + su1);
    su1 += 1;  // su1 = su1 + 1
    System.out.println("su1 = " + su1);
    
    su2 = su2 - 1;  // su2-- , --su2
    System.out.println("su2 = " + su2);
    su2 -= 1;  // su2 = su2 - 1
    System.out.println("su2 = " + su2);
    
    su1 = su2 = 1;
    
    su1 *= 5;  // su1 = su1 * 5
    System.out.println("su1 = " + su1);
    
    su1 /= 5;  // su1 = su1 / 5;
    System.out.println("su1 = " + su1);
    
    su2 *= 10;
    System.out.println("su2 = " + su2);
    
    su2 %= 3;   // su2 = su2 % 3
    System.out.println("su2 = " + su2);
  }
}
