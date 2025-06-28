package generics.raw;

public class TestExam {
    public static void main(String[] args) {
        Exam exam1 = new Exam(10000);
        System.out.println(exam1);

        String code = (String) exam1.getCode();
        System.out.println(code);
    }
}