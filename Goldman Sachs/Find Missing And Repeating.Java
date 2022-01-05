class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        
        // int a[] = new int[2];
        // for(int i=0;i<n-1;i++){
        //      if(arr[i]==arr[i+1])  
        //       a[1]=i+1;
        // }
        // HashSet<int> set = new HashSet<int>();
        // int setsum
        // for(int i=0;i<n-1;i++){
        //     set.add(arr[i]); 
        // }
        // int sum=(n*(n+1))/2;
        // int setsum=0;
        // for(int i=0;i<n-1;i++){
            
        //     setsum+=set.get(i);
        // }
    
        // return a;
                        //OR
         int x[]=new int[n+1];
         for(int i=0;i<n;i++){
             x[arr[i]]++;
         }
         int ans[]={0,0};
         
         for(int i=1;i<n+1;i++){
             if(x[i]==2){
                 ans[0]=i;
             }
             if(x[i]==0){
                 ans[1]=i;
             }
         }
         return ans;
    }
}
