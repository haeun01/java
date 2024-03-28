package Java0328;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("John", "john@naver.com", 123456, LocalDate.of(1999,1,1),49878);
        users.add(user1);
        User user2 = new User("Smith", "alice@naver.com", 789525,LocalDate.of(2001,2,5),963101);
        users.add(user2);
        User user3 = new User("Bob", "bob@naver.com", 456128, LocalDate.of(2004,5,7),715283);
        users.add(user3);

        ArrayList<Lecture> lectures = new ArrayList<>();
        Lecture lecture1 = new Lecture(1, "Java","beginner", "Programming","Tom");
        lectures.add(lecture1);
        Lecture lecture2 = new Lecture(2, "C++","beginner", "Programming","Tonny");
        lectures.add(lecture2);
        Lecture lecture3 = new Lecture(3, "Spring" ,"beginner", "Programming","Sam");
        lectures.add(lecture3);

        ArrayList<LectureRst> lectureRsts = new ArrayList<>();
        LectureRst lectureRst1 = new LectureRst(123456, 1);
        lectureRsts.add(lectureRst1);
        LectureRst lectureRst2 = new LectureRst(789525, 2);
        lectureRsts.add(lectureRst2);
        LectureRst lectureRst3 = new LectureRst(456128,3);
        lectureRsts.add(lectureRst3);

        for(int i = 0; i< lectureRsts.size(); i++) {
            if (lectureRsts.get(i).getLectureId() == 1) {
                System.out.println(lectureRsts.get(i).getUserId());
            }
        }


        for (int i = 0; i < users.size(); i++) {
            int userId = users.get(i).getuserId();
            for (int j = 0; j < lectureRsts.size(); j++) {
                if (lectureRsts.get(i).getUserId() == userId) {
                    int lectureId = lectureRsts.get(j).getLectureId();
                    for (int k = 0; k < lectures.size(); k++) {
                        if (lectures.get(i).getLectureId() == lectureId) {
                            System.out.println("userId= " + userId +  ", Title Name= " + lectures.get(k).getTitle());
                            break;
                        }
                    }
                }
            }
        }



    }
}
