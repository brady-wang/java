package com.company;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (revertedNumber < x) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        System.out.println(revertedNumber);
        System.out.println(x);

        return (revertedNumber == x) || (x == revertedNumber / 10);
    }

    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int len = nums.length;

        if(len <0 || nums == null){
            return 0;
        }

        for (right = 1;right<len;right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }

        System.out.println(nums);
        return left + 1;
    }


}
