package t2_for;

public class Test2 {
  public static void main(String[] args) {
    int i = 0;
    int tot = 0;
    
    for(int k=1; k<=100; k++) {
      i = i + 1;      // i++   or ++i
      tot = tot + i;  // tot += i
    }
    System.out.println("i = " + i);
    System.out.println("tot = " + tot);
  }
}
