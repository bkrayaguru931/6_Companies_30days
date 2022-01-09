class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
       ArrayList<Integer> res = new ArrayList<>();
       int max = 0 ;
        for (int i = 0; i <= n - k; i++) {

            max = arr[i];

            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            res.add(max);
        }
            
            return res;
    }
}
