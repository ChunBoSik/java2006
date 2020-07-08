package t2_for;

public class Test10 {
  public static void main(String[] args) {
    /* 1~100까지의 합을 구하되, 각 10항이 될때까지의 10개항목의 합을 구하시오 */
    /* 1~10, 11~20, 21~30, 31~40, 41~50,51~60, 61~70, 71~80, 81~90,91~100 */
    int tot=0;
    
    for(int i=1; i<=100; i++) {
      tot = tot + i;    // tot += i
      if(i % 10 == 0) {
        System.out.println((i-9) + "에서 부터 " + i + "까지의 합은 " + tot + "입니다.");
        tot = 0;
      }
    }
  }
}
