// LeetCode 27 - Remove Element
// Day 11 of my 100 Days DSA Challenge

class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}
