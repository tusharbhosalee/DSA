class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;

             totalBottles = totalBottles + newBottles;
             numBottles = newBottles + remBottles;

        }
        return totalBottles;
        
    }
}