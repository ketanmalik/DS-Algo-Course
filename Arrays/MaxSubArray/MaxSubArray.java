package MaxSubArray;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArayEfficient(nums1));
        System.out.println(maxSubArrayNaive(nums2));
    }

    // O(n) time complexity
    public static int maxSubArayEfficient(int[] nums) {
        int maxSum = nums[0], currSum = nums[0];

        for(int num: nums) {
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

        /*
        *   for(int i = 1; i < nums.length; i++) {
                if(nums[i] < nums[i] + nums[i - 1]) {
                    nums[i] = nums[i] + nums[i - 1];
                }
            }

            int maxSum = Integer.MIN_VALUE;
            for(int num: nums) {
                maxSum = Math.max(maxSum, num);
            }

            return maxSum;
        * */

    }

    // O(n^2) time complexity
    public static int maxSubArrayNaive(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currSum = nums[i];
            maxSum = Math.max(maxSum, currSum);
            for(int j = i + 1; j < nums.length; j++) {
                currSum += nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}
