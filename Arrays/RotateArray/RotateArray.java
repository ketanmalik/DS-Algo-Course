package RotateArray;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotateExtraSpace(nums, 3);
        rotateInPlace(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    // O(n) time complexity, O(1) space
    public static void rotateInPlace(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k -1);
        reverse(nums, k, nums.length - 1);
    }

    // O(n) time complexity, O(n) space
    public static void rotateExtraSpace(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];

        for(int i = 0; i < len; i++) {
            temp[i] = nums[i];
        }

        for(int i = 0; i < len; i++) {
            int newIdx = (i + k) % len;
            nums[newIdx] = temp[i];
        }
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
