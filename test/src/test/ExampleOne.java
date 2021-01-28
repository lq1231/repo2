package test;

import java.util.Arrays;

public class ExampleOne {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,2,21,1,1,2,1,2};
        System.out.println(majorityElement(nums));

    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
