public class Member {
    static int name;
    int age;

    static {  //정적 초기화 블럭
        name = 10000;
    }

    public Member() {
    }

    public Member(int age) {
        this.age = age;
    }

}
