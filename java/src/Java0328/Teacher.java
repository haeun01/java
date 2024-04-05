package Java0328;

public class Teacher {
    String name;
    String teacherId;

    public Teacher() {

    }

    public Teacher(String name, String teacherId) {
        this.name = name;
        this.teacherId = teacherId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }


}
