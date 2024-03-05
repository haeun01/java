import java.util.Arrays;

public class Array03052 {
    public static void main(String[] args) {
        // 기본 자료형의 복사  ==> 값 복사
        int a = 3;
        int b = a;
        System.out.println(a +  " " + b); // 3, 3
        b = 5;
        System.out.println(a + " " + b); // 3, 5

        // 참조자료형의 복사 ==> 참조 복사 또는 주소 복사
        int[] intList1 = {3,4,5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2));
        intList2[0] = 10;
        System.out.println(Arrays.toString(intList2));
        System.out.println(Arrays.toString(intList1));

        //배열과 for 문의 사용
        //조건식에 배열의 갯수(length)를 사용함
        for (int i = 0; i<intList2.length ; i++) {
            System.out.println(intList2[i]);
        }

    }
}
