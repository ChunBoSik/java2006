package t1_switchCase;

public class Test1 {
  public static void main(String[] args) {
    String jumin = "970516-1234567";
    
    /* 주어진 주민번호의 성별을 구하시오(7번째 숫자가 1 또는 3은 남자, 2 또는 4는 여자) */
    String gender;
    char sex = jumin.charAt(7);
    
    switch(sex) {
      case '1': case '3':
        gender = "남자";
        break;
      case '2': case '4':
        gender = "여자";
        break;
      default :
        gender = "중성";
    }
    
    System.out.println("당신의 성별은? " + gender);
  }
}
