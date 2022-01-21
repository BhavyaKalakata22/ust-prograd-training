class Solution {
    public int removeDuplicates(int[] nums) {
        //for updated array
       int count=0;
        //to count all the elements in array
        for(int i=0;i<nums.length;i++)
        {
            //if present value ==next  just skip
            if(i<nums.length-1&& nums[i]==nums[i+1])
            {
                continue;
            }
            //update array
            nums[count]=nums[i];
            count++;
        }
        return count;
        
    }
}