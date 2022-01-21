class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        //2,7,11,15 //target 9
        //2 -7 11 15
        
        //hash map
        //2 0
        //7 1
        //11 2
        // 15 3
        
        //2 ------> hashmap(7)
        
        HashMap<Integer,Integer> map = new HashMap();
        
        //for filling HM
        
        for(int i=0;i<nums.length;i++)
        {
            
            map.put(nums[i],i);
        }
        //searching
        for(int i=0;i<nums.length;i++) { ///2 7 11 15
            int num = nums[i];
        int rem=target-num;
        if(map.containsKey(rem))
        {
            int index = map.get(rem);
            if(index==i)
                continue;
            return new int[]{i,index};
        }
        }
        
        return new int[]{};
    }
}