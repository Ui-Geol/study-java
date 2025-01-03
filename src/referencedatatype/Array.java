package referencedatatype;

import java.util.Arrays;
import java.util.Collections;

public class Array {

    public static void main(String[] args) {
        //자바 메모리 구조: class, static, constant, method / stack / heap
        //heap 메모리에 객체를 생성하기 위해 new 키워드 사용
        
        //배열
        int[] a = new int[3]; // 0으로 초기화 됨
        Integer[] b = new Integer[]{1, 2, 3, 7, 6, 9};
        int[] c = {2, 1, 3};
        System.out.println(a.length); // 배열의 길이
        int[][] d = new int[3][4]; // 2차원 배열
        int[] oldArr = {1,2,3};
        int[] newArr = new int[3];
        
        Arrays.toString(c); // 배열 값을 출력할 수 있게 바꿔준다
        Arrays.sort(c); // 오름차순으로 정렬
        Arrays.sort(b, Collections.reverseOrder()); //내림 차순으로 정렬
        Arrays.fill(a, 3); // 배열을 value 값으로 채운다
        Arrays.equals(a,c); // 2개의 배열이 같은지 비교한다
        Arrays.asList(a); //AraayList로 바꿔준다. 추가, 삭제 불가
        Arrays.copyOf(c, 1); // 길이만큼 앞에서부터 복사
        Arrays.binarySearch(b, 3); // 이진탐색으로 배열이 정렬되어 있어야 한다
        System.arraycopy(oldArr, 0,newArr,0,oldArr.length);
        System.out.print(oldArr == newArr);

        Arrays.deepToString(d);// 2차원 배열 출력
        //Arrays.sort(int[][] arr, new Comparator) 2차원 배열 출력
        //Arrays.fill(int[][] arr, int value); 값을 채운다

    }
    
}
