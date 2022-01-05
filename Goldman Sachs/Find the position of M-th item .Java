//7. Find the kid which gets tha damaged toy

class Solution {
    static int findPosition(int N , int M , int K) {
        // code here
       if(N == 1)
        return 1;
       int n = K+M-1;
        if(n <= N)
            return n;
        else{
            if(n%N == 0) return N;
            else return n%N;
        }
    }
};
