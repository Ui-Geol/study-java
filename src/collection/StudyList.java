package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class StudyList {
  // 배열과 리스트의 차이: 저장 공간의 크기가 동적으로 변화하냐 아니냐
  // ArrayList의 기본 용량은 10
  // 순서를 유지하고 저장
  // 중복 저장 가능
  public static void main(String[] args) {
    // List<E> 인터페이스의 구현 클래스 생성자로 동적 컬렉션 생성
    List<Integer> aList = new ArrayList<>(); // 검색에 유리(get)
    List<Integer> aList2 = new ArrayList<>(30); //capacity = 30
    List<Integer> lList = new LinkedList<>(); // 삽입, 삭제에 유리(add, remove)
    List<Integer> vList = new Vector<>(); // 멀티 스레드, 동기화 메서드 지원

    // Arrays.asList() 메서드를 이용해 컬렉션 객체 생성
    // 추가 및 삭제 불가능, 
    List<Integer> aList3 = Arrays.asList(1, 2, 3, 4);
    
    aList.add(2); aList.add(3); aList.add(4); aList.add(5);
    aList.add(1,9); // index = 1에 9 추가
    aList2.addAll(aList); // aList2에 aList 추가
    aList2.addAll(2, aList); // index = 2에 aList 추가
    aList.set(1, 7); // index = 1의 값을 7로 변경
    aList.remove(1); // index 위치의 원소값 삭제
    aList.remove((Object) 5); // 매개변수와 동일한 객체 삭제
    aList2.clear(); //전체 원소 삭제
    aList.get(2); //index = 2의 위치에 있는 값을 꺼내서 리턴
    aList.size(); // 리스트 원소의 개수 반환
    aList.isEmpty(); // 리스트가 비어있는지 아닌지 반환
    aList.toArray(); // 리스트를 Object 배열로 변환
    Integer[] intArr = aList.toArray(new Integer[3]); //입력매개변수로 전달한 타입의 배열로 변환 
  }
}
  