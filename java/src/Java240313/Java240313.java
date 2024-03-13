package Java240313;

class Human {
    String name;
    int age;
    void eat() {}
    void sleep() {}
}
class Students extends Human {
    int studentID;
    void goToSchool() {}
}
class Worker extends Human {
    int workerID;
    void goToWork() {}
}
public class Java240313 {
    public static void main(String[] args) {
        //Java240313.Human 객체 생성
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        //Java240313.Students 객체 생성
        Students s = new Students();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        //Java240313.Worker 객체 생성
        Worker w = new Worker();
        w.name = "봉윤정";
        w.age = 45;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
