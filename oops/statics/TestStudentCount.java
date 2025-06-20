package oops.statics;

public class TestStudentCount {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();

        Student.getStudentCount();
    }
}