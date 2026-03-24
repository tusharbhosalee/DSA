class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], false);
        }

        List<Integer> keys = new ArrayList<>(hm.keySet());

        for (int key : keys) {
            if (!hm.containsKey(key - 1)) {
                hm.put(key, true);
            }
        }

        int max = 0;

        for (int key : hm.keySet()) {
            int k = 1;
            if (hm.get(key)) {
                while (hm.containsKey(key + k)) {
                    k++;
                }
            }
            max = Math.max(max, k);
        }

        return max;
    }
}