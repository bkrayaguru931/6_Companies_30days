// Brute Force Approach

class Solution {
    
    int maxDivide(int a,int b){
        while(a%b==0){
            a=a/b;
        }
        return a;
    }
    int isUgly(int num){
        num = maxDivide(num, 2);
        num = maxDivide(num, 3);
        num = maxDivide(num, 5);
        
        return (num==1) ? 1 : 0 ;
    }
    
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        int i = 1;
        int count = 1;
        while(count < n){
            i++;
            if(isUgly(i)==1)
            count++;
        }
        return i;
    }
}
