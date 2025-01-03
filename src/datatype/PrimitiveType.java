package datatype;

public class PrimitiveType {
    public static void main(String[] args) {
        //변수 선언과 동시에 값 대입
        int z = 3;

        //변수의 선언과 값의 대입을 분리
        int k;
        k = 3;

        //변수명 권장 사항: 카멜 케이스
        int ourClassNum;

        //상수명 지을 때 권장: 대문자, _(밑줄)로 구분
        final int MY_DATA;

        // 변수의 생명 주기는 {}의 끝

        boolean honest = true; // 1byte
        boolean lie = false; // 1byte
        byte b = 1; // 1byte 127 (2^7 - 1)
        short s = 2; // 2byte 32,767 (2^15 - 1) 약 3만 2천
        int i = 4; // 4byte 2,147,483,647 (2^31 - 1) 약 21억
        long l = 8L; // 8byte 9,223,372,036,854,775,807 (2^63 - 1)
        float f = 4.0f; // 4byte 정밀도 7자리
        double d = 8.0; // 8byte 정밀도 15자리
        char c = '2'; // 2byte

        int typeChange = (int) '3'; // 명시적 자료 형변환
        // 작은 자료형은 큰 자료형에 넣을 수 있다
        // 큰 자료형을 작은 자료형에 넣으면 명시적으로 형변환을 해야한다

        // byte 형 + int 형 = int 자료형
        // 실수형 + 정수형 = 실수형
    }
}
