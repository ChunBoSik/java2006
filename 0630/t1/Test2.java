package t1;

public class Test2 {
  public static void main(String[] args) {
    /* 1+1+2+1+2+3+1+2+3+4+1+2+3+4+5+~~~~~~~~(1+2+3+~~~~+99+100) = ? */
    int i=0, hap=0, tot=0;
    
    while(i < 100) {
      i = i + 1; // 1번
      hap = hap + i; // 2번
      tot = tot + hap; // 3번
    }
    System.out.println("답~~ =" + tot);
  }
}
