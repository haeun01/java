package App;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] intArr = {5, 16, 7, 26, 50};
        int max = 0;
        for(int i = 0; i < intArr.length; i++) {
            if( intArr[i] > max ) {
                max = intArr[i];
            }
        } System.out.println(max);

        // 양의 정수 10개를 입력
        // 배열에 담는다.
        // 3의 배수만 출력
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 : ");
        int mul = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 3 == 0) {
                System.out.print(num[i]);
            }
        }
    }


}
