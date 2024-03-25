package Java0325;

public class JavaChild extends JavaAbstract{
    //이용할 거면 생성해줘야 함(필수는 아님)
    public JavaChild(){
        super();
    }

    public JavaChild(int a, String b) {
        super(a, b);
    }

    //추상 클래스를 포함한 모든 클래스는 무조건 필수 (반드시 있어야 함)
    @Override
    public String getString() {
        return super.b;           //this나 super를 필요로 하는 경우, 지정해주는 걸 습관화 들이면 좋음
    }

    public void setValue(int a) {
        // super.a = a; -> 잘 활용하지 않음. 자바 스타일이 아님.
        super.setValue(a); // 자바스타일. 자바는 세터(Setter)와 게터(Getter)를 사용하는 것을 추천!!
    }

    public void setString(String b) {
        super.setString(b);
    }
}
