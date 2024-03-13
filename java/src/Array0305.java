import java.util.Arrays;

public class Array0305 {
    public static void main(String[] args) {
        //배열 선언법
        int[] intArray1; // JAVA 스타일
        int intArray2[]; // Java240313.C 언어 스타일, 쓰이지 않음

        //배열 객체 생성
        int[] intArray3 = new int[5]; //메모리에 5개의 빈 저장소를 만듬
        //배열 객체에 값 입력
        intArray3[0] = 10;
        intArray3[1] = 20;
        intArray3[2] = 30;
        intArray3[3] = 40;
        intArray3[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.out.print(intArray3[i] + ", ");
        }
        System.out.println();

        // 배열의 선언, 생성, 입력을 한 번에 수행하는 코드
        int[] intArray4 = {10,20,30,40,50};
        for (int i = 0; i < 5; i++) {
            System.out.println(intArray4[i] + " ");
        }

        // 배열의 값 대입 방법 1
        int[] array1 = new int[3];
        array1[0] = 3;
        array1[1] = 4;
        array1[2] = 5;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        int[] array2;
        array2 = new int[3];
        array2[0] = 3;
        array2[1] = 4;
        array2[2] = 5;
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        //배열의 값 대입 방법 2
        int[] array3 = new int[]{3,4,5};
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

        int[] array4;
        array4 = new int[]{3,4,5};
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);

        //배열의 값 대입 방법 3
        int[] array5 = {3,4,5};
        System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);

        //배열의 초기화
        //배열을 선언, 생성하고 입력값을 넣지 않은 경우, 자동으로 초기 값이 입력됨
        int[] intList = new int[3];
        float[] floatList = new float[3];
        boolean[] boolList = new boolean[3];
        char[] charList = new char[3];
        String[] strList = new String[3];
        System.out.println(Arrays.toString(intList));
        System.out.println(Arrays.toString(floatList));
        System.out.println(Arrays.toString(boolList));
        System.out.println(Arrays.toString(charList));
        System.out.println(Arrays.toString(strList));
    }
}
