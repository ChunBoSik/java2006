package t2;

import java.io.IOException;

public class Test1 {
  public static void main(String[] args) throws IOException {
    int keyCode;
    
    while(true) {
      keyCode = System.in.read();
      System.out.println("keyCode = " + keyCode);
      if(keyCode==81 || keyCode==113) break;
    }
    
    System.out.println("작업끝!!!");
  }
}
