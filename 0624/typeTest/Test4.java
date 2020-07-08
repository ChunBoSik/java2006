package typeTest;

public class Test4 {
  public static void main(String[] args) {
    int a, b, t;
    a = 100;
    b = 200;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println();
    
    // 두수의 교환
    t = a;
    a = b;
    b = t;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println();
    
    t=a ; a=b ; b=t;
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    System.out.println();
  }
}
