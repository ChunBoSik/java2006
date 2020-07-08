package array1;

// 배열에 저장된 숫자를 섞는 프로그램(20개의 숫자 섞기)
public class Test2 {
  public static void main(String[] args) {
    int[] su = new int[20];
    
    // 초기 자료 입력(1~20)
    for(int i=0; i<20; i++) {
      su[i] = i + 1;
    }
    
    // 초기자료 출력
    for(int i=0; i<20; i++) {
      System.out.print(su[i] + " , ");
    }
    System.out.println("==============================================");
    
    // 자료 섞기
    int temp, cnt=0;
    for(int i=0; i<100; i++) {
      //int num = (int) (Math.random()*(최종값-시작값+1)) + 시작값;
      int num = (int) (Math.random()*20);  // 0에서 19까지의 난수 
      temp = su[cnt];
      su[cnt] = su[num];
      su[num] = temp;
      if(cnt == 19) cnt = 0;
      else cnt++;
    }

    // 섞은자료 출력
    for(int i=0; i<20; i++) {
      System.out.print(su[i] + " , ");
    }
  }
}
