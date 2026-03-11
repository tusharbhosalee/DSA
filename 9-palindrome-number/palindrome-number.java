class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        
        int n = x;
        int reverseNumber = 0;

        while (n > 0) {
            int reverseDigit = n % 10;
            reverseNumber = reverseNumber * 10 +  reverseDigit;
            n = n/10;
        }
        
        if (x == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}