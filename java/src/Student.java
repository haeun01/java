public class Student {
    private String name;
    private int age;
    private String address;
    private String personalNum;

    public Student() { // 기본 생성자

    }

    public Student(String name, int age, String address, String personalNum) { //일반 생성자
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;     // getter - 리턴 타입 int (호출한 사람에게 주는 것)
    }

    public void setAge(int age) {
        this.age = age;  // setter - 매개변수 int age
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }



    public void displayName() { // 메소드
        System.out.println(this.name);
    }
    public void displayAge() {
        System.out.println(this.age);
    }

    public void displayAddress(){
        System.out.println(this.address);
    }

    public void displayAll() {
        System.out.println(this.name + " " + this.age + " " + this.address);
    }
}
