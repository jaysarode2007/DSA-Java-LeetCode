// LeetCode 268 - Missing Number
// Day 10 of my 100 Days DSA Challenge

class Solution {
    public int missingNumber(int[] nums) {

        int range = nums.length;

        int actualSum = (range * (range + 1)) / 2;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
        }

        int ans = actualSum - currSum;

        return ans;
    }
}
