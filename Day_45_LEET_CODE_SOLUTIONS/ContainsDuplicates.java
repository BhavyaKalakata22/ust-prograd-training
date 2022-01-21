class Solution {
    public boolean containsDuplicate(int[] nums) {
        //call set & set it to new hashInteger
        HashSet<Integer> set =new HashSet<Integer>();
        //walking through all numbers inside
        for(int i:nums){
            //condition for checking true
            if(set.contains(i))
            {
                return true;
            }
            else
            {
                set.add(i);
            }
        }
        return false;
        
    }
}