package class1;

// 객체의 특성: 1.상속 2.캡슐화 3.다형성
// 객체: 데이터(필드) + 메서드
// 필드: 클래스에 포함된 변수, 힙 영역에 저장, 초깃값o(원시 타입: 0, 객체: null)
// 지역 변수: 메서드에 포함된 변수, 스택 영역에 저장, 초깃값x
// 메서드 정의: 제어자 리턴타입 메서드면(매개변수,...)
// 클래스 외부에 메서드를 호출 할 경우 객체를 생성해야함
// 클래스 내부에 메서드를 호출 할 경우 객체 생성할 필요x
// 메서드 시그니처: 메서드명 + 매개변수들의 자료형들
// 가변 길이 배열 입력 매개변수: 리턴타입 메서드명 (자료형... 참조 변수명)
//// 패키지: 비슷한 목적으로 생성된 클래스 파일들을 한곳에 모아 둔 폴더
// 임포트: 다른 패키지 내의 클래스를 사용하기 위한 문법 요소
// 다른 패키지의 사용법1: 클래스의 풀네임 사용
// 다른 패키지의 사용법2: 임포트
// 패키지 주의점: 패키지를 *을 사용하여 임포트 할 때 하위 패키지는 임포트 안됨
// public: 동일 패키지의 모든 클래스 + 다른 패키지의 모든 클래스
// protected: 동일 패키지의 모든 클래스 + 다른 패키지의 자식 클래스
// default: 동일 패키지의 모든 클래스에서 사용 가능
// private: 동일 클래스에서 사용 가능
// static: 클래스명.멤버명 형태로 사용. static 블록으로 정적 필드 초기화 가능
public class SampleClass {
  int m;
  int n;
  int l;
  static int c;
  
  static {
    c = 5;
    System.out.println("클래스가 로딩될 때 static block 실행");
  }
  
  public SampleClass() {
    this.m = 3;
    this.n = 2;
  }
  
  public SampleClass(int num) {
    this(); // 위의 생성자를 가져옴
    this.l = num;
  }
  
  void work() {
    int k = 5;
    System.out.println(k);
    work2(k);
  }
  
  public void work2(int i ) {
    int j = 4;
    if(i == 3) {
      System.out.println(3);
      return;
    }
    System.out.println(i + j);
  }
  //가변 길이 배열 입력 매개변수
  public void work3(int... values) {
    for(int i : values) {
      System.out.println(i);
    }
  }

}
