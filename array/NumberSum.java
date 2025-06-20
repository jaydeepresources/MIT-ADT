package array;

public class NumberSum {
//    void sum(int[] nums) {
//        int sum = 0;
//        for (int num : nums)
//            sum += num;
//        System.out.println(sum);
//    }

    void sum(int... nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        System.out.println(sum);
    }
}