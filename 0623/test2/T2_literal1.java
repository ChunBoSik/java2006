package test2;

public class T2_literal1 {
  public static void main(String[] args) {
    int atom = 100;
    int mbc = -200;
    int tot;
    
    tot = atom + mbc;
    System.out.println("tot = " + tot);
    
    int kbs;
    kbs = 05;
    int sbs = 012;  // 1*8^1 + 2*8^0
    int cjb = 0x22; // 2*16^1 + 2*16^0
    
    System.out.println("kbs = " + kbs);
    System.out.println("sbs = " + sbs);
    System.out.println("cjb = " + cjb);
  }
}
