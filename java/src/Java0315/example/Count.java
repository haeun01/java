package Java0315.example;

public class Count {
    public static void main(String[] args) {
        // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
        // 모음은 a e i o u
        // 스페이스는 문자 아님
        String str = "This is a really simple sentence";

        for(int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            if(ch == ' ') {
                continue;
            }
        }
    }
}
