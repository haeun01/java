import App.Student;

public class Java0311Main {
    public static void main(String[] args) {
        // 클래스의 생성자가 없는 경우  => 기본생성자가 자동으로 만들어짐
        // 매개변수가 있는 생성자만 있는 경우 => 기본 생성자는 만들어지지 않는다.
        // 생성자의 오버로딩
        Student a = new Student();
        Student tom = new Student("tom", 20, "Seoul", "12345");
        Student steve = new Student("steve", 25, "LA");
    }
}
