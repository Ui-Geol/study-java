package referencedatatype;

public class StudyEnum {

  public static void main(String[] args) {
    Week testWeek = Week.SATURDAY;

    System.out.println(testWeek); //SATURDAY 출력
    
    if(testWeek == Week.SATURDAY) {
      System.out.println("오늘을 즐거운 토요일~");
    }
  }

}
