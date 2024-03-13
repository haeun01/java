public class Java240229 {
    public static void main(String[] args) {
        // if 단독 사용
        boolean x = true;
        if(x) {
            System.out.println("테스트중!!!");
        }   //중괄호가 없어도 실행 가능하나 좋은 방법이 아님
        if (!x) {
            System.out.println("이건 안보일걸");
        }

        // if ~ else
        if (x) {
            System.out.println("x는 true");
        } else {
            System.out.println("x는 false");
        }

        // if ~ else의 중복 사용
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (a) {
            System.out.println("a가 true");
        } else if (b) {
            System.out.println("a는 false, b가 True");
        } else if (c) {
            System.out.println("a,b는 false, c가 true");
        } else {
            System.out.println("a,b,c는 false");
        } // 항상 결과값과 상관없이 else 사용하기

        // 학점 코드 (범위를 나타내는 조건식)
        // 조건식에 사용된 범위가 전체를 100% 커버해야 한다.
        // 중복 해당되도록 조건을 만들면 안된다.
        int score = 91;
        if (score >= 90) {
            System.out.println("Java240313.A 학점");

        } else if (score >= 80 && score < 90) {
            System.out.println("Java240313.B 학점");
        } else if (score >= 70 && score < 80) {
            System.out.println("Java240313.C 학점");
        } else if (score >= 60 && score < 70) {
            System.out.println("Java240313.D 학점");
        } else {
            System.out.println("F 학점");
        }

        // 관계가 없는 조건을 if else로 설정하면 안된다.
        int num = 4;
        if (num > 0) {
            System.out.println("num은 양수");
        } else if (num % 2 == 6) {
            System.out.println("num은 짝수");
        }
        // 독립적인 if문으로 만드는 것이 좋다.
        if (num > 0) {
            System.out.println("num은 양수");
        }
        if (num % 2 == 6) {
            System.out.println("num은 짝수");
        }

        // if문 속에 if문
        if (true) {
            if (true) {
                if (true) {
                    System.out.println("if문 속에 if문");
                }
            }
        }
        //Switch case
        int number = 2;
        switch (number) {
            case 1 :
                System.out.println("Java240313.A");
                break;
            case 2 :
                System.out.println("Java240313.B");
                break;
            case 3 :
                System.out.println("Java240313.C");
                break;
            default:
                System.out.println("Java240313.D");
                break;
        }
    }
}
