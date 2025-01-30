/*Doc 
 * 1 this approach of code is to find the two numbers in the array whose sum is equal to the target
 * 2 i use Collections Framework  HashMap to solve the problem of  O(n) time complexity
 * 3 i use the concept of difference of target and the element in the array to find the other element
 */


import java.util.HashMap;
 class twoSum {
    public int[] twoSum(int[] nums, int target) {
        //  int [] result=new int[2];
           int n=nums.length;
            HashMap<Integer,Integer> map=new HashMap<>(n);
            for(int i =0 ;i < n ;i++)
            {
                int diff=target-nums[i];
                if(map.containsKey(diff))
                {
                    return new int[]{map.get(diff),i};
                }
                map.put(nums[i],i);
            }
        
        return new int[0];
        }
   
}

/*
 *  [1 2 3]  target=3
 *  sum=1;
 * 
 * 
 */