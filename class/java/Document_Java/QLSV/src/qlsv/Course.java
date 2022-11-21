package qlsv;
import java.util.Scanner;

public class Course {
    private String courseName;
    private int  n;    //number of students
    private Student[] s;

    public void createCourse() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Cousre name: "); courseName=sc.nextLine();
        System.out.print("Number of Students: "); n=sc.nextInt();
        sc.nextLine();
        String id, name; float grade;
        s=new Student[10];
        for (int i=0; i<n;i++){
          System.out.print("Student's id: ");   id=sc.nextLine();
          System.out.print("Student's name: "); name=sc.nextLine();
          System.out.print("Student's grade: "); grade=sc.nextFloat();
          sc.nextLine();
          s[i]=new Student(id,name,grade);
        }
    }

    public void printCourse(){
        System.out.println("Cousre name: "+courseName); 
        System.out.println("There are "+n+" students:"); 
        for (int i=0; i<n;i++)
            System.out.println((i+1)+": "+s[i].toString());  
    }
    
}
