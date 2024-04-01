package Java0401;

//Generic 문법

class MyClass<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t){
        this.t = t;
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>(); //클래스의 생성단계
        mc1.set("ㅎㅇ"); //생성 단계에서 자료형을 결정했기 때문에 입력단계에서 특정 자료형만 받음
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<>(); //Integer은 int 자료형의 wrapper 클래스
        mc2.set(100);
        System.out.println(mc2.get());
    }
}
