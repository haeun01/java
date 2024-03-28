package JavaString;

import java.util.Arrays;

public class JavaString2 {
    public static void main(String[] args) {
        //문자열 수정
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println();

        // @replace() : Study를 찾지 못하면 변경하지 않고 원본 그대로 출력
        System.out.println(str1.replace("Study","공부"));
        System.out.println();

        //@substring : 두 번째 피라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5)
        System.out.println(str1.substring(0, 5));
        System.out.println();

        // @split() : 연산자를 이용하여 ':'와 '/' 기준으로 분리시킴
        // split 메소드의 리턴형은 String 문자열의 배열
        String[] strArray = "Name:Michael/Man".split(":|/| ");
        System.out.println(Arrays.toString(strArray));
        System.out.println();

        // @trim() : "앞뒤" 공백 지우기
        String _str1 = " abc  def  ";
        _str1 = _str1.trim();
        System.out.println(_str1);
        //모든 공백 지우기
        System.out.println(_str1.replaceAll(" ", ""));
        System.out.println();

        //문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("Java");

        // 메모리 비교: 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);
        System.out.println();

        //내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));

    }
}
