import java.util.Arrays;

public class Java240311 {
    static int a = 1;
    static int b = 2;    //매개변수를 주지 않았기에 따로 선언
    public static void main(String[] args) {
        //println이 오버로딩 되어 있는 경우 (시그니처를 따라감)
        //같은 것처럼 보일 뿐, 전혀 다르다.
        System.out.println(plusNums()); //16라인으로 넘어감
        //19라인으로 이동(int 2개 + 복사 필요)
        System.out.println(plusNums(4,5));
        //배열 선언, 25라인으로 이동
        int[] intArray = {1,2,3,4,5};
        //위에 배열을 넘겨줌(배열의 변수를 넣어줌)
        //main의 지역변수
        System.out.println(plusNums(intArray));
        System.out.println(plusNums(1,2,3,4,5,6));
    }

    // 메소드의 오버로딩
    public static int plusNums() {
        return a + b;
    }
    public static int plusNums(int x, int y) {
        return x + y;
    }
    //int[] intArray 배열 변수의 복사 (복사 받은 intArray)
    public static int plusNums(int[] intArray) {
        int sum = 0;
        for (int i=0; i< intArray.length; i++) {
            sum = sum + intArray[i];
        }
        return sum;
    }
    // 가변길이 배열 입력법이 필요한 이유
    public static int plusNums(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
    public static int plusNums(int a, int b, int c, int d, int e, int f) {
        return a + b + c + d + e + f;
    }
//    // 시그니처가 같기 때문에 에러가 난다.
//    public static int plusNums(int... values) {
//        int sum = 0;
//        for (int i = 0; values.length; i++) {
//            sum = sum + values[i];
//        }
//        return sum;
//    }
}
