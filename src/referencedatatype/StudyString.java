package referencedatatype;

public class StudyString {
    public static void main(String[] args) {
        //new 키워드와 생성자를 기준으로 String 생성
        String str = new String("hello");
        // 문자열 리터럴을 바로 입력
        String str2 = "hello";
        String str3 = "hello"; // str2와 같은 객체를 공유한다
        // 특징1: 한 번 정의된 문자열을 변경할 수 없다
        // 특징2: 문자열 리터럴을 바로 입력해 객체를 생성할 때 같은 문자열끼리 객체를 공유한다
        
        str.length(); //문자열 길이를 리턴
        str.charAt(3); // 문자열에서 특정 인덱스위 문자를 알아낸다
        str.indexOf(3); // 문자열에서 특정 문자나 특정 문자열을 앞에서부터 찾아 위칫값을 찾음
        str.lastIndexOf(3); //문자열에서 특정 문자나 특정 문자열을 뒤에서부터 찾아 위칫값을 찾음
        str.concat("hello"); // 2개의 문자열을 연결
        str.getBytes(); // 문자열을 byte 배열로 변환. 자바 입출력 과정에서 주로 사용
        str.toCharArray(); // 문자열을 char 배열로 변환한다. 자바 입출력 과정에서 주로 사용한다
        String.valueOf(3); // 기본 자료형을 문자열로 바꾸는 정적 메서드
        str.toLowerCase(); // 문자열을 소문자로 변경
        str.toUpperCase(); // 문자열을 대문자로 변경
        str.replace("e", "d"); // target을 replacement로 변경
        str.substring(3,5); // 문자열의 일부만을 포함하는 새로운 문자열 객체를 생성한다
        str.split(" "); // 특정 기호를 기준으로 문자열을 분리
        str.trim(); // 문자열의 앞뒤 공백 제거
        str.equals("no"); // 2개의 문자열을 비교
        str.equalsIgnoreCase("no"); // 2개의 문자열을 대소문자에 상관없이 비교
        str.contains("llo"); // 문자열에 포함되어있는지 체크
        
        // StringBuilder 메서드
        // - java.lang
        // 1. toString()
        // 2. append(값)
        // 3. insert(위치, 값)
        // 4. delete(시작 위치, 끝 위치): 시작 위치 이상 끝 위치 미만
        // 5. deleteCharAt(인덱스 위치): 인덱스에 위치한 문자를 제거
        // 6. replace(시작 위치, 끝 위치, 문자열): 시작 위치 이상 끝 위치 미만
        // 7. length()
        // 8. reverse()

        // StringTokenizer
        // - java.util
        // 1. StringTokenizer st = new StringTokenizer(data, 구분 문자);
        // 2. countTokens(): 분리할 수 있는 문자열의 총수
        // 3. hasMoreTokens(): 남아 있는 문자열이 있는지 여부
        // 4. nextToken(): 문자열을 하나씩 가져옴   
    }
}
