package t1_Array;

public class Test3 {
  public static void main(String[] args) {
    int[] jum = {100, 90, 80, 70, 60};
    int tot1 = 0;
    
    tot1 = jum[0] +jum[1] +jum[2] +jum[3] +jum[4];
    System.out.println("tot1 = " + tot1);
    System.out.println("--------------------");
    
    int tot2 = 0;
    for(int i=0; i<jum.length; i++) {
      tot2 += jum[i];
    }
    System.out.println("tot2 = " + tot2);
  }
}
