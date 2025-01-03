package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudySet {
  // 중복 저장 허용X
  // 순서를 유지하지 않고 저장
  // HashSet 중복확인: hascode()와 equal() 결과로 확인
  public static void main(String[] args) {
    Set<Integer> iSet = new HashSet<>();
    Set<Integer> iSet2 = new HashSet<>();
    Set<Integer> lSet = new LinkedHashSet<>(); // 순서가 있는 set
     
    iSet.add(2); iSet.add(3); iSet.add(4); iSet.add(5); iSet.add(6);
    iSet2.addAll(iSet);
    iSet.remove(4); // 원소 중 매개변수 입력과 동일한 객체 삭제
    iSet2.clear(); // 전체 원소 삭제
    iSet.isEmpty(); // 원소가 있는지 없는지 확인
    iSet.contains(3); // 매개변수가 있는지 확인
    iSet.size(); //집합의 크기 확인
    Iterator<Integer> iterator = iSet.iterator(); // Set<E> 객체 내의 데이터를 연속해 꺼내는 Iterator 객체 리턴
    iterator.hasNext(); // 다음에 가져올 객체가 있으면 true 없으면 false
    iterator.next(); // 컬렉션에서 하나의 객체를 가져온다
    iterator.remove(); // next()로 가져온 객체를 Set 컬렉션에서 제거한다
    iSet.toArray(); // 리스트를 Object 배열로 변환
    Integer[] intArr = iSet.toArray(new Integer[4]);
    System.out.println(Arrays.toString(intArr)); 
  }

}
