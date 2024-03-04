public class Array {
    public static void main(String[] args) {
        //배열의 기본 선언법
        int[] intArray1 = {1,2,3,4,5};
        System.out.println(intArray1[0]);

        int[] intArray2 = new int[5]; //빈 공간 5개 생성(자리 잡아두기)
        // intArray2 = {1,2,3,4,5}; //오류
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;
        intArray2[3] = 4;
        intArray2[4] = 5;
        System.out.println(intArray2[4]);

        int[] intArray3 = new int[5];
        for (int i = 0; i < 5 ; i++) {
            intArray3[i] = i+1;
            System.out.print(intArray3[i] + " ");
        }
        System.out.println();

        
    }
}
