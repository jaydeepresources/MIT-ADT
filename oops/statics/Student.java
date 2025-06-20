package oops.statics;

public class Student {
    private int id;
    private String name;
    private float marks;
    public static int count;

    public Student() {
        count++;
    }

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    void printDetails() {
        System.out.println("Id=" + id);
        System.out.println("Name=" + name);
        System.out.println("Marks=" + marks);
    }

    public static void getStudentCount() {
        System.out.println("Count=" + count);
    }
}