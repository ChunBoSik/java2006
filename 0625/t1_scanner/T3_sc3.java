package t1_scanner;

import java.util.Scanner;

public class T3_sc3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int su, res;
    
    System.out.print("수를 입력하세요...");
    su = Integer.parseInt(scanner.nextLine());
    
    res = su + 100;
    
    System.out.println("res = " + res);
    scanner.close();
  }
}
