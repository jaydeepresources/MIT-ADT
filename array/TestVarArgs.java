package array;

public class TestVarArgs {
    public static void main(String[] args) {
        NumberSum numberSum = new NumberSum();
        int[] inputs = {1,2};
        numberSum.sum(inputs);

        numberSum.sum(10,20,30);
    }
}
