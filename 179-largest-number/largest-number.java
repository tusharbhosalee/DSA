import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] + "";
        }

         Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}