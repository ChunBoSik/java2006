package t1_Array;

public class Test2 {
  public static void main(String[] args) {
    int[] su1 = new int[5];
    for(int i=0; i<su1.length; i++) {
      System.out.println("su1["+i+"] = " + su1[i]);
    }
    System.out.println("========================");
    
    double[] su2 = new double[5];
    for(int i=0; i<su2.length; i++) {
      System.out.println("su2["+i+"] = " + su2[i]);
    }
    
    System.out.println("========================");
    
    float[] su3 = new float[5];
    for(int i=0; i<su3.length; i++) {
      System.out.println("su3["+i+"] = " + su3[i]);
    }
    
    System.out.println("========================");
    
    boolean[] su4 = new boolean[5];
    for(int i=0; i<su4.length; i++) {
      if(i % 2 == 0) su4[i] = true;
      System.out.println("su4["+i+"] = " + su4[i]);
    }
    
  }
}
