package operator;

public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a; // 증가 후 대입
        int c = a++; // 대입 후 증가
        int d = --a;// 
        int e = a--;
        
        // 산술 연산자: +, -, *, /, %
        // 비트연산자: &(AND), |(OR), ^(XOR), ~(NOT)
        // NOT 연산자는 부호 비트까지 반전
        // 시프트 연산자: <<, >>, >>>(논리 시프트는 빈칸을 0으로 채움)
        // 비교 연산자: ==, !=, >=, <=, >, <  비교 대상은 스택 메모리의 값
        // 쇼트 서킷: 결과가 이미 확정되었을 때 나머지 연산과정을 생략하는 것
        //논리 연산자: &&, ||, !, ^
        // 대입 연산자: =, +=, -=, *=, /=, &=, |=, >>=, <<=, >>>=
        // 삼항 연산자: (참 또는 거짓) ? 참일 때 연산 결과 : 거짓일 때 연산 결과
    }
}