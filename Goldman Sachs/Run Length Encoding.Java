// Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
// eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.(Modified version of question named Cute Monkeys and Run Length Encoding)

class GfG
 {
	String encode(String str)
	{
          //Your code here
          String ans = "";
    for(int i = 0; i < str.length(); i++){
        ans += str.charAt(i);
        int count = 1;
        while(i+1 < str.length()  && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        ans += count+"";
    }
    return ans;
          
	}
	
 }
