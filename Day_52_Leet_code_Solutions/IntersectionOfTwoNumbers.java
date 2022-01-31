class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       int len1=nums1.length;
    int len2=nums2.length;
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> index=new ArrayList<>();
    
    for(int i=0;i<len1;i++){
        for(int j=0;j<len2;j++){
            if(nums1[i]==nums2[j] && !index.contains(j)){
                list.add(nums1[i]);
                index.add(j);
                break;
            }
        }
    }
    int res[]=new int[list.size()];
    for(int i=0;i<list.size();i++){
        res[i]=list.get(i);
    }
    return res;
        
    }
}