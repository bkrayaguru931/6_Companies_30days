//Count the subarrays having product less than k 

class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int count = 0;
        int i, j;
        Long product;
 
        for (i = 0; i < n; i++) {
            if (a[i] < k)
                count++;
 
            product = a[i];
 
            for (j = i + 1; j < n; j++) {
                product = product * a[j];
                if (product < k)
                    count++;
                else break;
            }
        }
 
        return count;
    }
}
