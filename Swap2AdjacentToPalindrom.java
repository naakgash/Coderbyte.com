import java.util.*;
import java.io.*;

class SwapTwoAdjacentForPalindrom{
	static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
	
	static String intersperse(String str)
    {
		String challengeToken = "k5olhfwva1e";
		StringBuilder sb = new StringBuilder(challengeToken);
        char result[] = str.toCharArray();
        for(int i=0; i<str.length(); i++) {
        	sb.insert((2*i),result[i]);
        }
		
        return sb.toString();
    }
	
	public static void main(String []argh)
    {
    	String str = "kabccbak";
    	String result="";
    	int begin=0, end=str.length()-1;
        int middle = (begin+end+1)/2;
        for(int i=0; i<=middle; i++){
          if(str.charAt(begin)==str.charAt(end)){
        	  begin++; end--;
          }else if(str.charAt(begin+1)==str.charAt(end)){
        	  str = swap(str, begin, begin+1);
        	  begin++; end--;
          }else{
        	  result = "-1";
        	  break;
          }
          result=str;
        }
        if(result == "-1") {
        	System.out.println("-1");
        }else {
        	System.out.println(intersperse(result));
        }
        
    }
}
