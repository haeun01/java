public class Java240304 {
    public static void main(String[] args) {
        // for 반복문의 기본문
        for(int a = 0; a < 3; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for(int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j  + " ");
        }
        System.out.println();

        // for 문의 특수한 형태(무한 루프)
        /*
        for(int i = 0;  ; i++) {
                System.out.println(i + " ");
                }
                for(;;) {
                System.out.println("무한 루프");
                }
         */

        //무한 루프 탈출
        for(int i = 0; ; i++) {
            if(i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("무한 루프 탈출");

        //for 반복문 변형하기
        int i = 0;
        for ( ; ; ) {
            if (i < 5) {
                System.out.print(i + " ");
                i++;
            } else {
                break;
            }
        }
        System.out.println();

        // 멀티 조건식
        for (int a = 0, b = 0; a < 5 || b < 5; a++, b++) {
            System.out.print(a + "_" + b + " ");
        }
    }


}
