package generics.param;

public class TestExam {
    public static void main(String[] args) {
        Exam<Integer> exam1 = new Exam<>(10000);
        System.out.println(exam1);

        Integer code = exam1.getCode();
        System.out.println(code);
    }
}