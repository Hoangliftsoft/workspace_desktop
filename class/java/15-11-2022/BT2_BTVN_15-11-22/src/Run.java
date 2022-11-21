public class Run {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Name_p", "Address_p");
        Student s_stu = new Student("Name_stu", "Address_stu", "Program_stu", 2003, 5.5);
        Staff s_sta = new Staff("Name_sta", "Address_sta", "School_sta",5.55);

        System.out.println(p.toString());
        System.out.println("\n"+s_stu.toString());
        System.out.println("\n"+s_sta.toString());

    }
}
