package Java0325;

public abstract class JavaAbstract {
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
    abstract public String getString(); //추상메서드 선언 ( {} 존재X _ {}가 있으면 내용이 없는 메서드가 됨 )

    public void setValue(int a) { // Setter 메서드
        this.a = a;
    }
    public void setString(String b) { // Setter 메서드 (만들어 놓으면 편리)
        this.b = b;
    }
}
