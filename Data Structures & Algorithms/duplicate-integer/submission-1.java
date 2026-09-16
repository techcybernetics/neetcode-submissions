class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[start]==nums[i]) {
            return true;
            }
            start++;
        }
        return false;
    }
}