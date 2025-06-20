package oops.encapsulated;

public class TestSimpleStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(10);
        System.out.println("Id=" + student.getId());

//        Student student = new Student(10, "Raj",76.4f);
//        student.printDetails();
    }
}