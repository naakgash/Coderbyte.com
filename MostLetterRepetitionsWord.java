import java.util.*; 
import java.io.*;

class Main {

  public static String SearchingChallenge(String str) {
    String[] words = str.split("\\s");
    int temp = 0;
    int count = 0;
    String result = "";
    String tempx = "";
    for(String w:words){
      tempx = w;
      while(!w.isEmpty()){
        for(int i=1; i<w.length(); i++){
          if(w.charAt(0) == w.charAt(i)){count++; }
        }
        w = w.substring(1);
      }
      if(count > temp){ 
        temp = count;
        result = tempx;
      }
      count = 0;
    }
    return (temp != 0) ? result : "-1";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SearchingChallenge(s.nextLine())); 
  }

}
