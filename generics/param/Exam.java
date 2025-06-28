package generics.param;

public class Exam<C> {

    private C code;

    public Exam(C code) {
        this.code = code;
    }

    public C getCode() {
        return code;
    }

    public void setCode(C code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "code=" + code +
                ", type=" + code.getClass().getSimpleName()+
                '}';
    }
}
