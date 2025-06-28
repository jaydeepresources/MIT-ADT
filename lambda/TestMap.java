package lambda;

import java.util.Arrays;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        Find Square of each num
//        for (int i = 0; i < nums.length; i++)
//            nums[i] *= nums[i];
//        for (int num: nums)
//            System.out.println(num);

        List<Integer> listNums = Arrays.asList(nums);
//        Find Square of each num using map
//        listNums = listNums.stream().map(num -> num * num).toList();
//        listNums.forEach(System.out::println);

        int sumOfEvenSquares = listNums.stream()
                .map(num -> num * num)
                .filter(num -> num % 2 == 0)
                .reduce(0, (num1, num2) -> num1 + num2);
    }
}