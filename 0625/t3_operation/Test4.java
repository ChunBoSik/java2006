package t3_operation;

public class Test4 {
  public static void main(String[] args) {
    boolean play = true;
    
    System.out.println("play=" + play);
    
    play = !play;
    System.out.println("play=" + play);
    
    int x=10, y=20, res;
    String str;
    
    str = x>y ?"x가 큰수":"y가 큰수";
    System.out.println("str=" + str);
    
    res = x>y ? x : y;
    System.out.println("x, y중 큰수는? " + res);
  }
}
