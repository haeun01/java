package Java0328;

// 관계를 저장하는 클래스
public class LectureTeacher {
    private String teacherId;
    private int lectureId;

    public LectureTeacher() {
    }

    public LectureTeacher(String teacherId, int lectureId) {
        this.teacherId = teacherId;
        this.lectureId = lectureId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }
}
