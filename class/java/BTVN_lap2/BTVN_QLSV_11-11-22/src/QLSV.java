public class QLSV {
    public static void main(String[] args) throws Exception {
        Course c = new Course();
        c.createCourse();
        // c.printCoures();
        // c.searchName("Hoang");
        // c.maxGradeStudent();

        c.sortbyGrade();
        c.printCoures();

        c.sortbyName();
        c.printCoures();
    }
}
