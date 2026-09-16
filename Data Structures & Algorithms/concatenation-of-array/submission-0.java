class Solution {
    public int[] getConcatenation(int[] nums) {
         int length = nums.length;
        int[] result= new int[length*2];
        int resultLength=result.length;
        int left=0;

        while(left<resultLength) {
            result[left]=nums[left];
            result[resultLength-1]=nums[length-1];
            left++;
            length--;
            resultLength--;
        }
        return result;
    }
}