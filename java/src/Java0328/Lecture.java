package Java0328;

public class Lecture {
    int lectureId;
    String level;
    String Category;
    String instructor;
    String title;

public Lecture () {

}

public Lecture(int lectureId, String level, String category, String instructor, String title){
    this.lectureId = lectureId;
    this.level = level;
    this.Category = category;
    this.instructor = instructor;
    this.title = title;
}

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return lectureId + "/ "+ title +"/ " + level + "/ " + Category + instructor;
    }
}
