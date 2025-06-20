package array;

public class TestArray {
    public static void main(String[] args) {
//        int nums[] = new int[5];
        int nums[] = {1, 2, 3, 4, 5};

//        for (int i = 0; i < nums.length; i++)
//            System.out.println(nums[i]);

        for(int num : nums)
            System.out.println(++num);
    }
}



