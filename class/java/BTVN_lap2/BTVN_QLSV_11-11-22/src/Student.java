public class Student {
    private String id, name;
    private float grade; // Điểm

    public Student(String id, String name, float grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nName: " + name + "\nGrade: " + grade;
    }
}
