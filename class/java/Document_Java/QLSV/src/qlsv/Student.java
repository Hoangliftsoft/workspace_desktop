package qlsv;

public class Student {
    private String id,name;
    private float grade;

    public Student(String id, String name, float grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + "  " + name + "  "+grade;
    }
    
    
    
}
