//9.Given a pattern containing only I's and D's. I for increasing and D for decreasing.Devise an algorithm to print the minimum number following that pattern.

class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        
         Stack<Integer> sta=new Stack<>();
       String str="";
       for(int i=0;i<=S.length();i++)
       {
           sta.push(i+1);
           if(i==S.length() || S.charAt(i)=='I')
           {
             while(sta.size()>0)
             {
                 str+=String.valueOf(sta.pop());
             }
           }
       }
       return str;
    }
}
