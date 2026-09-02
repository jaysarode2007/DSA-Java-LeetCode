// LeetCode 1518 - Water Bottles
// Day 05 of my 100 Days DSA Challenge

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;

        while(numBottles >= numExchange){

            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }

        return ans;
    }
}
