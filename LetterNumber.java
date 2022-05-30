import java.util.*; 
import java.io.*;

class Main 
{
  public static String StringChallenge(String str) 
  {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    while(!str.isEmpty())
    {
      for(int i=0; i<str.length(); i++)
      {
        if(str.charAt(0) == str.charAt(i))
        {
          count++;
        }
        else
        {
          break;
        }
      }
      sb.append(count);
      sb.append(str.charAt(0));
      str = str.substring(count);
      count=0;
    }
    return sb.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }

}
