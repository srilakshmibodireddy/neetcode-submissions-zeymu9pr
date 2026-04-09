class Solution {
    public int[] getConcatenation(int[] nums) {
        //int ans[] = new int[nums.length*2];
        int ans[] = Arrays.copyOf(nums, nums.length*2);
        //ans = Arrays.copyOf(nums, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length+i] = nums[i];
        }
        return ans;
    }
}