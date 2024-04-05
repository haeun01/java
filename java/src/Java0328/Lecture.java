package Java0328;

public class Lecture {
    int lectureId;
    Level level;
    Category Category;
    String instructor;
    String title;



public Lecture () {

}

public Lecture(int lectureId, Level level, Category category, String instructor, String title){
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

    public Level getLevel() {
    return level;
    }

    public void setLevel(Level level) {
    this.level = level;
    }

    public Category getCategory() {
    return Category;
    }

    public void setCategory(Category category) {
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
