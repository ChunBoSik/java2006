package t3_operation;

public class Test7 {
  public static void main(String[] args) {
    int su1 = 10;
    double su2 = 10.0;
    System.out.println(su1 == su2);
    
    double su3 = 0.1;
    float su4 = 0.1f;
    System.out.println(su3 == su4);
    System.out.println((float)su3 == su4);
  }
}
