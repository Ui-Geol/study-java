package collection;

import java.util.TreeSet;

public class StudyTreeSet {

    public static void main(String[] args) {
        // 이진 트리를 기반으로 한 Set 컬렉션
        // Set <- SortedSet <- NavigableSet <- TreeSet 
        TreeSet<Integer> tSet = new TreeSet<>();
        // 데이터를 정렬된 상태로 유지해야 하는 경우
        // 중복을 허용하지 않는 데이터 집합이 필요한 경우
        // 범위 검색이 필요한 경우
        // 최소값 또는 최대값을 빠르게 찾고 싶은 경우
        // 정렬 기준을 사용자 정의해야 하는 경우
        
        tSet.add(1); tSet.add(3); tSet.add(5); tSet.add(7); tSet.add(9); tSet.add(11);
        tSet.first(); // 제일 낮은 객체를 리턴
        tSet.last(); // 제일 높은 객체를 리턴
        tSet.lower(5); // n 보다 작은 객체 중 가장 큰 객체 리턴
        tSet.higher(5); // n 보다 큰 객체 중 가장 작은 객체 리턴
        tSet.floor(5); // n 보다 작거나 같은 객체 중 가장 큰 객체 리턴
        tSet.ceiling(5); // n 보다 크거나 같은 객체 중 가장 작은 객체 리턴
        tSet.pollFirst(); // 제일 낮은 객체를 꺼내고 리턴
        tSet.pollFirst(); // 제일 큰 객체를 꺼내고 리턴
    }

}
