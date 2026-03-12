class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new ArrayList<>();
        int p = num.length-1;

        int carry = 0;

        while (p >= 0 || k > 0) {
            int numVal = 0;

            if (p >= 0) {
                numVal = num[p];
            }

            int d = k % 10;

            int sum = numVal + d + carry;

            int digit = sum % 10;
            carry = sum / 10;

            answer.add(digit);

            p--;
            k = k / 10;
        }
        if (carry > 0) {
            answer.add(carry);
        }
        Collections.reverse(answer);
        return answer;
    }
}