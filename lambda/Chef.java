package lambda;

public class Chef implements Recipe{
    @Override
    public void cook() {
        System.out.println("Chef's Recipe");
    }
}
