package t1_Reference;
// 기본형 자료의 비교(Stack영역에 값일 직접 저장된다.)
public class Test1 {
  public static void main(String[] args) {
    int a1 = 100;
    int b1 = 200;
    int c1 = 100;
    
    // 기본형은 값을 비교한다는것이다.
    if(a1 == b1) 
      System.out.println("a1과 b1의 값은 같다.");
    else
      System.out.println("a1과 b1의 값은 다르다.");
    
    if(a1 == c1) 
      System.out.println("a1과 c1의 값은 같다.");
    else
      System.out.println("a1과 c1의 값은 다르다.");
    
  }
}
