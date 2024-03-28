package Java0327;

class MyException extends Exception {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

class MyRTException extends RuntimeException {
    public MyRTException(){
        super();
    }
    public MyRTException(String message) {
        super(message);
    }
}

class A {
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지 : MyException");

    MyRTException mre1 = new MyRTException();
    MyRTException mre2 = new MyRTException("예외 메시지: MyRTException");

    void abc_1(int num) {
        try {
            if (num > 70)
                System.out.println("정상 작동");
            else
                throw new MyException("나이가 70이하임 : " + num);  //예외를 던진 시점에 예외 발생
        } catch (MyException e) {
            System.out.println("예외 처리 1");
            System.out.println(e.getMessage());
        }
    }
    void bcd_1() {
        abc_1(65);
    }

    void abc_2(int num) throws MyException {   //예외처리를 내가 하지 않겠다.라는 의미
                                               //throws_나를 호출한 사람이 처리 (예외 전가)
        if (num > 70)
            System.out.println("정상 작동");
        else
            throw new MyException("예외전가 => 나이가 70이하임 : " + num);  //예외를 던진 시점에 예외 발생
    }
    void bcd_2() {
        try {
            abc_2(65);
        } catch (MyException e) {
            System.out.println("예외 처리 2");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}
