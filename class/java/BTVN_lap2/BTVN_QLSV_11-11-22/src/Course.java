import java.util.Scanner;

public class Course {
    private String courseName;
    private int n; // Number of student
    private Student[] s;

    public static Scanner sc = new Scanner(System.in);

    // Hàm tạo sinh viên
    public void createCourse() {
        // Nhập vào tên khoá học
        System.out.print("Course name: ");
        courseName = sc.nextLine();

        // Số lượng học sinh
        System.out.print("Number of Student: ");
        n = sc.nextInt();
        sc.nextLine();

        // Khai báo biến tạm cho sinh viên
        String id, name;
        float grade;

        s = new Student[n];
        for (int i = 0; i < n; ++i) {

            // Nhập id sinh viên
            System.out.print("Student's id: ");
            id = sc.nextLine();

            // Nhập tên sinh viên
            System.out.print("Student's name: ");
            name = sc.nextLine();

            // Nhập điểm sinh viên
            System.out.print("Student's grade: ");
            grade = sc.nextFloat();
            sc.nextLine();

            s[i] = new Student(id, name, grade);
        }
    }

    // Hàm xuất ra sinh
    public void printCoures() {
        System.out.println("Course: " + courseName);
        System.out.println("There are " + n + " students: ");
        for (int i = 0; i < n; ++i) {
            System.out.println((i + 1) + ": " + s[i].toString());
        }
    }

    // Hàm tìm kiếm sinh viên
    public void searchName(String lookName) {
        System.out.println("Search Name: ");
        String look_name = lookName.toLowerCase();
        for (int i = 0; i < n; ++i) {

            // Tìm chuỗi trong chuỗi không phân biết chữ hoa và thường
            if ((s[i].getName().toLowerCase()).contains(look_name)) {
                System.out.println(s[i].toString());
            }
        }
    }

    // Hàm tìm học sinh có điểm lớn nhất
    public void maxGradeStudent() {
        System.out.println("Max Grade Student: ");
        float maxGrade = s[0].getGrade();

        // Tìm điểm lớn nhất
        for (int i = 0; i < n; ++i) {
            if (maxGrade < s[i].getGrade()) {
                maxGrade = s[i].getGrade();
            }
        }

        // Xuất những sinh viên có điểm lớn nhất
        for (int i = 0; i < n; ++i) {
            if (s[i].getGrade() == maxGrade) {
                System.out.println(s[i].toString());
            }
        }
    }

    // Sắp xếp học sinh có điểm tăng dần
    public void sortbyGrade() {
        System.out.println("\nSort By Grade: ");
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (s[i].getGrade() > s[j].getGrade()) {
                    Student tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }

    // Sắp xếp học sinh có tên tăng dần
    public void sortbyName() {
        System.out.println("\nSort By Name: ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((s[i].getName()).compareTo(s[j].getName()) > 0) {
                    Student tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
    }
}