
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i =0 , j = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        while(j < n){
            if(j < n && sum >= target){
                sum += nums[j++];
            }
            
            while(j < n && sum < target){
                sum += nums[j++];
            }
            
            if(sum >= target){
                
                while(i< j && sum - nums[i] >= target){
                    sum -= nums[i++];
                }
                
               min = Math.min(min , j- i);
            }
        }
        
        if(min == Integer.MAX_VALUE) return 0;
        
        return min ;
    }
}
