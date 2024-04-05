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

        Main.teachers = new ArrayList<>();
        Main.teachers.add(new Teacher("teacherNo1", "Michael"));
        Main.teachers.add(new Teacher("teacherNo2", "Adrian"));

        Main.lectureTeachers = new ArrayList<>();
        Main.lectureTeachers.add(new LectureTeacher("teacherNo1", 1));
        Main.lectureTeachers.add(new LectureTeacher("teacherNo1", 2));
        Main.lectureTeachers.add(new LectureTeacher("teacherNo2", 3));
        Main.lectureTeachers.add(new LectureTeacher("teacherNo2", 4));

        Main.freeBoards = new ArrayList<>();
        Main.freeBoards.add(new FreeBoard(1, "게시글 1"
                , "게시판을 이용합시다", "tommy"));
        Main.freeBoards.add(new FreeBoard(2, "게시글 2"
                , "글이 너무 없네요", "sue"));
        Main.freeBoards.add(new FreeBoard(3, "게시글 3"
                , "너무 배고프다", "nice"));
    }
}
