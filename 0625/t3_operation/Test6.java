package t3_operation;

public class Test6 {
  public static void main(String[] args) {
    String str1 = "Java";
    String str2 = "C++";
    
    str2 = "-" + str1 + "-" + str2 + "-";
    System.out.println("str2=" + str2);
    
    String str3 = str1 + 100 + 50;
    System.out.println("str3 = " + str3);
    
    String str4 = 100 + 50 + str1;
    System.out.println("str4 = " + str4);
    
  }
}