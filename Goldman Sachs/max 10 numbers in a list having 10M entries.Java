

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
       int nums[]=new int[k];
       int j=0;
       for(int i=n-1;i>=(n-k);i--)
       {
           nums[j]=arr[i];
           j++;
       }
       return nums;
    }
}
