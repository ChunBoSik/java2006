package typeTest;

public class Test3 {
  public static void main(String[] args) {
    String name1, name2, name3, name4;
    name1 = "HongKilDong";
    name2 = "Hong\tKil\tDong";
    name3 = "Hong\tKil\nDong";
    name4 = "Hong\\Kil\'Dong";
    
    System.out.println("name1=" + name1);
    System.out.println("name2=" + name2);
    System.out.println("name3=" + name3);
    System.out.println("name4=" + name4);
  }
}
