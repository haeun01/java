package Java0325;

public class Students {
    private String name;
    private String department;
    private int studentId;

    public Students (){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString() {
        return name + ", " +  department + ", " + studentId;
    }
}
