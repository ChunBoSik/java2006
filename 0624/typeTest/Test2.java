package typeTest;

public class Test2 {
  public static void main(String[] args) {
    byte su1, su2, su3, su4;
    int tot;
    su1 = 100;
    su2 = -100;
    //su3 = 200;
    //su4 = -200;
    tot = su1 + su1;
    
    short var1, var2, var3;
    var1 = 30000;
    var2 = -30000;
    //var3 = 35000;
    
    long mbc1, mbc2;
    mbc1 = 1234567890;
    mbc2 = 123456789012345L;
    
    double insu1, insu2;
    insu1 = 12345.6789;
    insu2 = -12345.6789;
    
    float inja1, inja2;
    inja1 = 12345.6789F;
    inja2 = 12.345F;
    
    char ch1, ch2, ch3, ch4;
    ch1 = 'A';
    ch2 = 'a';
    System.out.println("A=" + ch1);
    System.out.println("a=" + ch2);
    
    ch3 = '가';
    ch4 = '\u0041';
    System.out.println("가=" + ch3);
    System.out.println("\\u0041=" + ch4);
    
    boolean aa, bb;
    aa = true;
    bb = false;
    System.out.println("aa=" + aa);
    System.out.println("bb=" + bb);
  }
}
