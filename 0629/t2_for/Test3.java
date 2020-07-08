package t2_for;

public class Test3 {
  public static void main(String[] args) {
    //int i = 0;
    int tot = 0;
    
    for(int i=1; i<=100; i++) {
      tot = tot + i;  // tot += i
    }
    //System.out.println("i = " + i);
    System.out.println("tot = " + tot);
  }
}
