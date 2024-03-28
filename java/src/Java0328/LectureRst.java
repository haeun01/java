package Java0328;

public class LectureRst {
    int userId;
    int lectureId;

    public LectureRst(){

    }

    public LectureRst(int userId, int lectureId) {
        this.userId = userId;
        this.lectureId = lectureId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
