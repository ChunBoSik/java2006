package t3_operation;

public class Test3 {
  public static void main(String[] args) {
    int x = 10;
    int y = 10;
    int z;
    
    System.out.println("x=" + x);
    x++;
    ++x;
    System.out.println("x=" + x);
    
    System.out.println("y=" + y);
    y--;  // y=> 9
    --y;  // y=> 8
    System.out.println("y=" + y);
    // 현재 x값? 12
    z = x++;
    System.out.println("z=" + z);
    System.out.println("x=" + x);
    
    // 현재 x값? 13, y값?8, z=12
    
    int res;
    res = ++x + y-- + z;
    System.out.println("res = " + res);
    System.out.println("x=" + x);
    System.out.println("y=" + y);
    System.out.println("z=" + z);
  }
}
