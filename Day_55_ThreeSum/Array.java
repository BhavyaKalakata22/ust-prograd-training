import java.util.*;
public class Array {
    public static List<List<Integer>> threeSum(int[] array,int target) {
        List<List<Integer>> result = new ArrayList<>();

        int left,right,current,csum;
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++)
        {
            if((i!=0)&&(array[i]==array[i-1]))
                continue;
            current = array[i];
            left =  i+1;
            right=array.length-1;
            while(left<right)
            {
                csum=current + array[left]+array[right];
                if(csum == target)
                {
                    result.add(Arrays.asList(current, array[left], array[right]));
                    left++;
                    right--;
                    while(left<right && array[left]==array[left-1])
                        left++;
                    while(left<right && array[right]==array[right+1])
                        right--;
                }
                else if(csum < target)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        System.out.println("Three no sum pairs ->"+threeSum(array,target));
    }
}
