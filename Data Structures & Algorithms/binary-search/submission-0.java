class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length-1;
        int start =0;


        while(start<=len) {
            int mid = start+(len-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target) {
                len=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }
}
