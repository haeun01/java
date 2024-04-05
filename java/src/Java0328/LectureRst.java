package Java0328;
// 데이터베이스 구현 방식에 유사

public class LectureRst {
    String userId;
    int lectureId;

    public LectureRst(){

    }

    public LectureRst(String userId, int lectureId) {
        this.userId = userId;
        this.lectureId = lectureId;

    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {

        this.lectureId = lectureId;
    }


}
