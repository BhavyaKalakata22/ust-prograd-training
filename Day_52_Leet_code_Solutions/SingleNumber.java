class Solution {
    public int singleNumber(int[] nums) {
        //initialize result with zero
        int result=0;
        //calculating length
        for(int i=0;i<nums.length;i++)
        {
            //element in array appears twice
            result ^=nums[i];
        }
        return result;
    }
}