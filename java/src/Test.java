import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1. 길이가 10인 배열에 1부터 10까지의 값을 입력
        int[] intList1 = new int[10];
        for (int i = 0; i < 10; i++) {
            intList1[i] = i + 1;
        }
       System.out.println(Arrays.toString(intList1));

        // 2. 길이가 10인 배열에 10부터 1까지의 값을 입력
        int[] intList2 = new int[10];
        int len = intList2.length;
        for (int i = 0; i < intList2.length; i++) {
            intList2[i] = len;
            len = len - 1;
        }
        System.out.println(Arrays.toString(intList2));
        System.out.println();

        // 3. 과일 배열에 "사과"가 몇 번 들어있는지 확인
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;   //숫자 세는 용도
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == "사과") {
                count = count +1;
            }
        }
        System.out.println(count);
        System.out.println();

        // 자바에서 입력값을 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("0~6까지 숫자를 입력해주세요 : ");
//        int inputNumber =  sc.nextInt();
//
//        if (inputNumber >= 0 && inputNumber <= 6) {
//            System.out.println(inputNumber);
//        } else {
//            System.out.println("잘못입력하셨습니다.");
//        }

//        // 자바에서 문자열을 입력 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력해주세요 : ");
//        String inputStr=  sc.nextLine();
//        System.out.println(inputStr);

        // 4. 사용자로부터 0 ~ 6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
//        char[] week = {'월', '화', '수', '목', '금', '토', '일'};
//        Scanner scan = new Scanner(System.in);
//        System.out.println("0~6까지 숫자를 입력해주세요 : ");
//        int num = scan.nextInt();
//
//        if (num >= 0 && num < week.length) {
//            System.out.println(week[num]);
//        } else {
//            System.out.println("잘못입력하셨습니다.");
//        }

        // 5. 사용자로부터 이름을 입력 받아 아래 회원 배열에 있는 이름이면
        // " ~~~님 환영합니다" 를 출력하고
        // 없으면 "회원가입해주세요" 를 출력 (단, 대소문자 구분하지 마시오)
        String[] member = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};
        Scanner sn = new Scanner(System.in);
        System.out.print("이름 : ");
        String inputName = sn.nextLine();

        if (Arrays.asList(member).contains(inputName)) {
            System.out.println(inputName + "님 환영합니다");
        } else {
            System.out.println("회원가입해주세요");
        }


    }
}
