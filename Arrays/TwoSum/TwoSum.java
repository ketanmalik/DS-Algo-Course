package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7};
        int target = 9;

        System.out.println(Arrays.toString(twoSumNaive(nums, target)));
        System.out.println(Arrays.toString(twoSumNaive(nums, target)));
    }

    //O(N^2) time complexity, O(1) space complexity
    public static int[] twoSumNaive(int[] arr, int target) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    //O(N) time complexity, O(N) space complexity
    public static int[] twoSumEfficient(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int req = target - nums[i];
            if(hmap.get(req) != null) {
                return new int[] {hmap.get(req), i};
            }
            hmap.put(nums[i], i);
        }

        return null;
    }

}
