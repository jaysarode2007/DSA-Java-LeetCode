// LeetCode 319 - Bulb Switcher
// Day 15 of my 100 Days DSA Challenge

class Solution {
    public int bulbSwitch(int n) {
        int count = 0;

        int i = 1;

        while (i * i <= n) {
            count++;
            i++;
        }

        return count;
    }
}
