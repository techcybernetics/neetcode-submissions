class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
    }
     return slow + 1;
    }
    }