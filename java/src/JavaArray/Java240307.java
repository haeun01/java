package JavaArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java240307 {
    public static void main(String[] args) {
        // 6. 아래 배열에서 입력 받은 값보다 큰 수만 출력하시오
//        int[] intList1 = {1,2,3,4,5,6,7,8,9,10};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("0~10까지 숫자를 입력해주세요 :");
//        int num = scan.nextInt();
////
////        for(int i = 0; i < intList1.length; i++) {
////            if (intList1[i] > num) {
////                System.out.print(intList1[i] + " ");
////            }
////        }
//
        //새로운 배열에 담기 : ArrayList 사용하기
//        ArrayList<Integer> intList3 = new ArrayList<Integer>();
//        for(int i = 0; i < intList1.length; i++) {
//            if (intList1[i] >  num) {
//                intList3.add(intList1[i]);
//            }
//        }
//        System.out.println(intList3.toString());

        // 7. 아래 배열의 총합과 평균 출력
//        int[] numberList = {12, 34, 56, 32, 84, 99, 73,49};
//
//        //합계
//        int sum = 0;
//        for(int i = 0; i < numberList.length; i++) {
//            sum = sum + numberList[i];
//        } System.out.println("총합 : " + sum);
//
//        //평균
//        int average = sum / numberList.length;
//        System.out.println(sum + " " + average);

//        // 8. 사용자로부터 문자열을 입력받아서 입력 받은 문자열을 거꾸로 출력
        // ex) hello 를 입력하면 olleh 출력 (index가 거꾸로)
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 출력 : ");
        String inputStr =  sc.nextLine();

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            System.out.print(inputStr.charAt(i));
        }

        // 난수 생성법, Random 숫자 만드는 법 (ex 로또)
        Random rd = new Random(); //Random 클래스 저장
        int randNum = rd.nextInt(10); // 0 부터 입력한 (정수값 -1) 범위에서 랜덤
        System.out.println(randNum);

        // 9. 1 ~ 45까지의 랜덤한 정수를 length가 6인 배열에 넣으시오.
        // 단, 중복 숫자는 허용하지 않음!!
        Random randClass = new Random();
        int[] rotooList = new int [6];
//        for (int i = 0; i < rotooList.length; i++) {
//            int temp = randClass.nextInt(45) + 1; //안에 있는 Int는 밖에 있는 int보다 1 작다.
//            for (int j = 0; j < i; j++){
//                if (rotooList[j] == temp) {
//                    temp = randClass.nextInt(6) + 1;
//                    j = -1;
//                }
//            }
//
//            rotooList[i] = temp;
//        }
//        System.out.println(Arrays.toString(rotooList));

        for (int i = 0; i < rotooList.length; i++) {
            rotooList[i] = randClass.nextInt(45) + 1;
            for (int j = 0; j < i; j++){
                if (rotooList[j] == rotooList[i]) {
                    i = i - 1;
                }
            }
        }
        System.out.println(Arrays.toString(rotooList));
    }
}
