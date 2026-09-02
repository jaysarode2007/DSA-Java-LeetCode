// LeetCode 1 - Two Sum
// Day 06 of my 100 Days DSA Challenge

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++){

            for (int j = i + 1; j < nums.length; j++){

                if(nums[i] + nums[j] == target){

                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        return ans;
    }
}
