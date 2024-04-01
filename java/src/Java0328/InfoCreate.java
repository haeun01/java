package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class InfoCreate {
    public static void createInfos() {
        Main.users = new ArrayList<>();
        Main.users.add(new User("John", "joh@naver.com", "bless99", LocalDate.of(1976,1,25),49878));
        Main.users.add(new User("Smith", "alice@naver.com", "omg01",LocalDate.of(2001,8,29),963101));
        Main.users.add(new User("Bob", "bob@naver.com", "wait2", LocalDate.of(2004,5,7),715283));
        Main.users.add(new User("jenny", "jen@naver.com", "star34", LocalDate.of(1994,4,26),715283));

        Main.lectures = new ArrayList<>();
        Main.lectures.add(new Lecture(1, Level.beginner, Category.Programming, "Tom","Java"));
        Main.lectures.add(new Lecture(2, Level.Intermediate, Category.Database, "Tonny","SQL"));
        Main.lectures.add(new Lecture(3, Level.beginner, Category.Programming, "Sam","Spring"));
        Main.lectures.add(new Lecture(4, Level.Advanced, Category.Networking, "sera","Hacking"));

        Main.lectureRsts = new ArrayList<>();
        Main.lectureRsts.add(new LectureRst("bless99", 1));
        Main.lectureRsts.add(new LectureRst("omg01", 2));
        Main.lectureRsts.add(new LectureRst("wait2",3));
    }
}
