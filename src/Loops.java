// WEEK 1 - DAY 2

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        // CFU 1
        int[] nums = {5, 4, 3, 2, 1};
        int lastItemValue = nums[nums.length-1] * nums[0];
        System.out.println("CFU 1.a: " + Arrays.toString(nums));

        for (int i=0; i<nums.length-1; i++) {
            nums[i] *= nums[i + 1];
        }

        nums[nums.length-1] = lastItemValue;
        System.out.println("CFU 1.b: " + Arrays.toString(nums));

        // CFU 2
        int[] initialNums = {1, 2, 3, 4, 5};
        int[] reversedNums = new int[initialNums.length];

        int x = initialNums.length-1;
        for (int i=0; i<initialNums.length; i++) {
            reversedNums[i] = initialNums[x--];
        }

        System.out.println("CFU 2.a: " + Arrays.toString(initialNums));
        System.out.println("CFU 2.b: " + Arrays.toString(reversedNums));
    }
}
