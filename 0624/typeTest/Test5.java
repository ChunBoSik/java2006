package typeTest;

public class Test5 {
  public static void main(String[] args) {
    //형식화된 출력(printf())
    int su1=100, su2=200;
    
    System.out.println("su1=" + su1 + " , su2=" + su2);
    
    System.out.printf("1. su1=%d , su2=%d\n", su1, su2);
    System.out.printf("2. su1=%d , su2=%d\n", su1, su2);
    System.out.printf("3. su1=%5d , su2=%6d\n", su1, su2);
    System.out.printf("4. su1=%-5d , su2=%-6d\n\n", su1, su2);
    System.out.println();
    
    double d1=123.456, d2=-123.456;
    System.out.printf("5. d1=%f , d2=%f\n", d1, d2);
    System.out.printf("6. d1=%5.2f , d2=%6.3f\n", d1, d2);
    System.out.printf("7. d1=%10.2f , d2=%10.3f\n\n", d1, d2);
    
    int o1=010, o2=017;
    System.out.println("8. o1=" + o1 + " , o2=" + o2);
    System.out.printf("9. o1=%o , o2=%o\n", o1, o2);
    System.out.printf("10. su1=%o , su2=%o\n\n", su1, su2);
    
    int h1=0x10, h2=0x1a;
    System.out.println("11. h1=" + h1 + " , h2=" + h2 + "\n");
    System.out.printf("12. h1=%x , h2=%x\n\n", h1, h2);
    
    char ch1='A', ch2='a';
    System.out.printf("ch1=%c , ch2=%c\n", ch1, ch2);
    
    String str1="Good!", str2="안녕하세요!";
    System.out.printf("str1=%s , str2=%s\n", str1, str2);
  }
}
