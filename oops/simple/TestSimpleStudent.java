package oops.simple;

public class TestSimpleStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 10;
        student.name="Raj";
        student.marks=76.4f;

        student.printDetails();
    }
}