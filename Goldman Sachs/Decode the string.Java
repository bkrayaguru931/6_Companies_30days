//Difficult(took hint from yt)

class Solution{
    static String decodedString(String s){
        // code here
        if(s == "")return "";
        String str = new String();
        int repeat = 1;
        for(int i =0;i<s.length();++i)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                String temp = "";
                int k = i;
                while(Character.isDigit(s.charAt(k)))
                {
                    temp+=s.charAt(k);
                    k++;
                }
                repeat = Integer.parseInt(temp);
                i = k-1;
            }
            else if(s.charAt(i) =='[')
            {
                Stack<Character> st = new Stack<>();
                st.push('[');
                int k = i+1;
                while(!st.isEmpty())
                {
                    if(s.charAt(k) == ']')
                    {
                        st.pop();
                        k++;
                    }
                    else if(s.charAt(k) =='[')
                    {
                        st.push('[');
                        k++;
                    }
                    else k++;
                }
                String inside_bracket = decodedString(s.substring(i+1,k-1));
                i = k-1;
                for(int j =0;j<repeat;++j)
                {
                    str+=inside_bracket;
                }
            }
            
            else
            {
                str+=s.charAt(i);
            }
        }
        return str;
    }
}
