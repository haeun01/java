public class Java240306 {
    public static void main(String[] args) {
        // 문자열 길이
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println();

        // 문자열 검색
        // @char At()
        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1));
        System.out.println();

        // @indexof()
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.lastIndexOf('a'));
        System.out.println(str1.indexOf('a', 8));
        System.out.println(str1.lastIndexOf('a', 8));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.indexOf(" "));
        System.out.println();

        // 문자열 변환 및 연결
        // @String.valueOf()(기본 자료형): 기본 자료형 -> 문자열 변환
        // String str3 = String.valueOf(2.3);
        double dValue = 2.3;
        String str3 = String.valueOf(dValue);
        // String str4 = String.valueOf(false);
        boolean bool = false;
        String str4 = String.valueOf(bool);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println();

        // @concat() : 문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5);


    }
}
