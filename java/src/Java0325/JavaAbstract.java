package Java0325;

public class JavaAbstract {
    //필드
    int a;
    String b;

    //생성자
    public JavaAbstract() {
        this.a = 10;
        this.b = "default";
    }

    public JavaAbstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    //메서드
    public int getValue() {
        return a;
    }
    public String getString() {
        return b;
    }
}
