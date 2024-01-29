public class ClassCourse {
    private int classId, capacity, studentCount;
    private String title;

    public ClassCourse() {
        setClassId(classId);
        setCapacity(capacity);
        setStudentCount(studentCount);
        setTitle(title);
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getClassId() {
        return classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getTitle() {
        return title;
    }


}
